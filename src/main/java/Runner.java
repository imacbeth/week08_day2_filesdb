import models.File;
import models.Folder;

public class Runner {

    public static void main(String[] args){
        Folder documents = new Folder("My Documents");
        Folder project = new Folder("Java Project");

        File cv = new File("July CV", "doc", 100, documents);
        File profilePic = new File("profile", "jpeg", 400, documents);
        File runner = new File("runner", "java", 600, project);
        File pizzaShop = new File("pizzaShop", "java", 650, project);
        File pizzaOrder = new File("pizzaOrder", "java", 650, project);

    }
}
