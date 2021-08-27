package day13;

import java.util.*;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message mes : getMessages()) {
            if (mes.getSender() == u1 && mes.getReceiver()==u2)
                System.out.println(u1.getUsername() + ": " + mes.getText());
            if (mes.getSender() == u2 && mes.getReceiver()==u1)
                System.out.println(u2.getUsername() + ": " + mes.getText());
        }
    }
}

