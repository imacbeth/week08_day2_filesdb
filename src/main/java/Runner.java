import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args){
        Folder documents = new Folder("My Documents");
        DBHelper.save(documents);
        Folder project = new Folder("Java Project");
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

    }
}
