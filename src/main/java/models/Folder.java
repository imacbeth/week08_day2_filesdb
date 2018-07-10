package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="folders")
public class Folder {

    private int id;
    private String title;
    private List<File> files;

    public Folder(String title) {
        this.title = title;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
