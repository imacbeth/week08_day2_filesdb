package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="folders")
public class Folder {

    private int id;
    private String title;
    private List<File> files;
}
