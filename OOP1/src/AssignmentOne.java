import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/**
 *
 * Class AssignmentOne
 * This is class Assignment One
 *
 * @author Zidong Peng 24274850
 * @version 11/11/2023
 */
public class AssignmentOne {

    /**
     *
     * Method demonstratePolymorphism
     *
     * @param product
     */
    public static void demonstratePolymorphism(Product product) {
        product.purchasingArea();
    }

    /**
     *
     * Method demonstrateWildcards
     *
     * @param ar
     */
    public static void  demonstrateWildcards(ArrayList<? extends PhysicalProduct> ar) {
        for (PhysicalProduct p : ar) {
            System.out.println("The product you purchased is: " + p.getProductName1());
        }
    }

    /**
     *
     * Method DemonstrateLambdas
     *
     * @param arr
     * @param predicate
     */
    public static void demonstrateLambdas(ArrayList<AmazonDevices> arr, Predicate<AmazonDevices> predicate) {

        for (AmazonDevices amazonDevices:arr) {
            if (predicate.test(amazonDevices)) {
                System.out.println(amazonDevices.getProductName1() + " is children's device.");
            }
        }
    }


    /**
     *
     * main Method
     *
     * @param args
     */
    public static void main(String[] args) {

        // Part 2 – Using abstract classes and interfaces
        System.out.println("Part 2 – Using abstract classes and interfaces");
        AmazonDevices amazonDevices = new AmazonDevices(500, "Nike shoes", "China", "Black", false);
        Software software = new Software(20, "Office 365",1, "Mac","Australia",65,true);
        amazonDevices.printDetails();
        software.printDetails();
        System.out.println("------------------------------");

        // Part 3 – Polymorphism
        //In the demonstatePolymorphism method, the purchasingArea method in the Product interface was called,
        //while I overridden the purchasingArea method in the PhysicalProduct and DigitalProduct classes, respectively.
        //Then an object for Software was created in the main method, and the Software class inherited the DigitalProduct class.
        //Then the Software object executes its corresponding version. These reflect polymorphism, as the same method is used for
        //different types of products and the corresponding version of the method is executed at runtime based on the actual object type.
        System.out.println("Part 3 – Polymorphism");
        AssignmentOne assignmentOne = new AssignmentOne();
        Product product = new Software(20, "Office 365",1, "Windows","England",65,true);
        assignmentOne.demonstratePolymorphism(product);
        System.out.println("------------------------------");

        // Part 4 – Generic classes
        System.out.println("Part 4 – Generic classes");
        ArrayList<AmazonDevices> amazonDevices1 = new ArrayList<>();
        amazonDevices1.add(new AmazonDevices(600, "Earphone", "Australia", "Purple", true));
        amazonDevices1.add(new AmazonDevices(500, "Earphone", "Australia", "Blue", false));
        amazonDevices1.add(new AmazonDevices(300, "Sound box", "New Zealand", "Black", true));
        amazonDevices1.add(new AmazonDevices(200, "Kindle", "Australia", "Red", false));
        amazonDevices1.add(new AmazonDevices(700, "TV Stick", "China", "White", false));
        System.out.println("------------------------------");

        // Part 5 - Generic methods
        System.out.println("Part 5 - Generic methods");
        Collections.sort(amazonDevices1);
        System.out.print("The sorted order is: \n");
        for (AmazonDevices am:amazonDevices1) {
            System.out.print(am.getProductName1() + ", " + am.getColor() + "\n");
        }
        System.out.println("------------------------------");

        // Part 6 - Wildcards
        //The DemonstrateWildcards method uses the wildcard character<? Extends PhysicalProduct>, which means that the method accepts objects
        //from any subclass of PhysicalProduct and stores these objects in the ArrayList collection. In the main method, an ArrayList collection
        //of objects of the PhysicalProduct subclass was created, and the objects were added. Finally, the DemonstrateWildcards method was used
        //to call the methods in the abstract class.
        System.out.println("Part 6 - Wildcards");
        ArrayList<AmazonDevices> amazonDevices2 = new ArrayList<>();
        amazonDevices2.add(new AmazonDevices(600, "Earphone", "Australia", "Blue", false));
        AssignmentOne assignmentOne1 = new AssignmentOne();
        assignmentOne1.demonstrateWildcards(amazonDevices2);
        System.out.println("------------------------------");

        // Part 7 - Simple lambda expressions
        System.out.println("Part 7 - Simple lambda expressions");
        AssignmentOne assignmentOne2 = new AssignmentOne();
        assignmentOne2.demonstrateLambdas(amazonDevices1, am -> am.isChildrenDevice());
        System.out.println("------------------------------");



    }
}
