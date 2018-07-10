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

    public Folder(){

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

    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    public List<File> getFiles(){
        return files;
    }
    public void setFiles(List<File> files) {
        this.files = files;
    }
}
