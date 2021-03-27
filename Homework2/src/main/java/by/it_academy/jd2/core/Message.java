package by.it_academy.jd2.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

        public String getMessage () {
            return message;
        }

        @Override
        public String toString () {
            return " Cообщениe: " + message + "\n";
        }
    }

