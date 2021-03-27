package by.it_academy.jd2.core;



import java.util.ArrayList;
import java.util.List;


public class AllMessage {
    private static List<Message> AllMessage;

    private AllMessage() {
    }
    public static List<Message> getAllMessage(){
        if(AllMessage==null){
            AllMessage= new ArrayList<>();
        }return AllMessage;
    }
}