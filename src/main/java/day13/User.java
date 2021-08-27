package day13;

import java.util.*;

import static day13.MessageDatabase.addNewMessage;


public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        for (User allUser : subscriptions) { // Going to ArrayList subscriptions
            if (allUser == user) { //Searching to match at username
                System.out.println("Вы уже подписаны на пользователя");
                return;
            }
        }
        subscriptions.add(user); //Adding username in subscriptions list
    }

    public boolean isSubscribed(User user) {
        boolean sub = false;
        for (User allUser : subscriptions) { // Goes through the ArrayList subscriptions
            if (allUser == user)   //Searching to match at username
            {
                sub = true;
                break;
            }
        }
        return sub;
    }

    public boolean isFriend(User user) {
        boolean i = false;
        boolean j = false;
        boolean friend = false;
        for (User matching : subscriptions) {
            if (matching == user) {
                i = true;
                break;
            }
        }
        for (User answerMatching : user.getSubscriptions()) {
            if (answerMatching == User.this) {
                j = true;
                break;
            }
        }
        if (i && j) {
            friend = true;
        }
        return friend;
    }

    public void sendMessage(User user, String text) {
        addNewMessage(User.this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}

