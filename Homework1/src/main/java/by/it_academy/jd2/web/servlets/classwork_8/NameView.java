package by.it_academy.jd2.web.servlets.classwork_8;

import java.util.ArrayList;
import java.util.List;

public class NameView {
    private final List<String> names = new ArrayList<>();

    public void add(String name) {
        this.names.add(name + " 1 ");

    }

    public List<String> getAll(){
        return this.names;
    }
}
