package day13;

import java.util.*;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;
    Calendar calendar = new GregorianCalendar();

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = calendar.getTime();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getData() {
        return date;
    }

    @Override
    public String toString() {
        return "\n"+"From: " + sender + "\n" + "TO: " + receiver + "\n" + "ON: " + getData() + "\n" + text;
    }
}
