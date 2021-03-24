package by.it_academy.jd2.web.servlets.classwork_8;

import java.util.Scanner;

public class Users {
    public static void main(String[] args) {
        NameView view = new NameView();

        Scanner scanner = new Scanner(System.in);
        System.out.println("для выхода введите exit");
        System.out.println("вводите имена");

        String next = null;

        while (!(next = scanner.next()).equalsIgnoreCase("exit")){
            view.add(next);
        }

        System.out.println(view.getAll());
    }
}