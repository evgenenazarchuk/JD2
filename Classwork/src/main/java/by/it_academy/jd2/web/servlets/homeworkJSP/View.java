package by.it_academy.jd2.web.servlets.homeworkJSP;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class View {

    String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        return sdf.format(new Date());
    }

    private final List<String> names = new ArrayList<>();

    public void add(String name) {
        this.names.add(getFormattedDate() + " " + name);
    }

    public List<String> getAll() {
        return this.names;
    }

}