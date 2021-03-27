package by.it_academy.jd2.core;

public class DataMessage {
    public static void saveMessage(Message message) {
        AllMessage.getAllMessage().add(message);
    }
}
