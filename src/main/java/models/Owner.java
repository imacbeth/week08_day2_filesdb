package models;

import java.util.List;

public class Owner {

    private int id;
    private String name;
    private String username;
    private List<Folder> folders;

    public Owner(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public Owner() {
    }


}
