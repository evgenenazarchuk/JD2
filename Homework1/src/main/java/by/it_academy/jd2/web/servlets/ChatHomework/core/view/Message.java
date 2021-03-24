package by.it_academy.jd2.web.servlets.ChatHomework.core.view;

import by.it_academy.jd2.web.servlets.ChatHomework.core.Constants;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {

    private User sender;
    private User receiver;
    private String date;
    private String message;

    public Message(User sender, User receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        SimpleDateFormat dateTime = new SimpleDateFormat(Constants.FORMAT_DATE);
        this.date = dateTime.format(new Date());
    }

    public String getSender() {
        return sender.getLogin();
    }

    public String getReceiver() {
        return receiver.getLogin();
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return date+ " От: " + sender.getName() +" Cообщениe: " + message + "\n";
    }
}