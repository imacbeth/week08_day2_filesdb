import db.DBFolder;
import db.DBHelper;
import db.DBOwner;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args){

        Owner iona = new Owner("iona", "ilm91");
        DBHelper.save(iona);

        Folder documents = new Folder("My Documents", iona);
        DBHelper.save(documents);

        Folder project = new Folder("Java Project", iona);
        DBHelper.save(project);

        File cv = new File("July CV", "doc", 100, documents);
        DBHelper.save(cv);

        File profilePic = new File("profile", "jpeg", 400, documents);
        DBHelper.save(profilePic);

        File runner = new File("runner", "java", 600, project);
        DBHelper.save(runner);

        File pizzaShop = new File("pizzaShop", "java", 650, project);
        DBHelper.save(pizzaShop);

        File pizzaOrder = new File("pizzaOrder", "java", 650, project);
        DBHelper.save(pizzaOrder);


        List<File> files = DBHelper.getAll(File.class);
        List<Folder> folders = DBHelper.getAll(Folder.class);
        List<File> filesInProject = DBFolder.getFilesInFolder(project);
        List<Folder> foldersOfOwner = DBOwner.getFoldersOfOwner(iona);

    }
}
