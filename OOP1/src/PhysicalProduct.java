import java.util.Scanner;

/**
 *
 * Class PhysicalProduct
 * This is Physical Product class. This class implements
 * the Product interface.
 *
 * @author Zidong Peng 24274850
 * @version 11/11/2023
 */
public abstract class PhysicalProduct implements Product{
    int productPrice1;  //Defined product price variable
    String productName1;  //Defined product name variable
    String country;  //Defined country variable

    /**
     *
     * PhysicalProduct default constructor
     *
     */
    protected PhysicalProduct() {
    }


    /**
     *
     * PhysicalProduct constructor
     * A second constructor that sets all the instance variables
     *
     * @param productPrice1
     * @param productName1
     * @param country
     */
    protected PhysicalProduct(int productPrice1, String productName1, String country) {
        this.productPrice1 = productPrice1;
        this.productName1 = productName1;
        this.country = country;
    }


    /**
     *
     * Method getProductName1
     * Getter method
     *
     * @return productName1
     */
    public String getProductName1() {
        return productName1;
    }

    /**
     * Method getProductPrice1
     * Getter method
     *
     * @return productPrice1
     */
    public int getProductPrice1() {
        return productPrice1;
    }

    /**
     *
     * Method addComment
     * This method can be called to add evaluations of the product
     * This is the abstract method
     *
     */
    public abstract void addComment();

    /**
     *
     * Method addAddress
     * This method can be called to add the user's address
     * This is the non-abstract method
     *
     */
    public void addAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your address: ");  //Users can enter their own mailing address
        String address = scanner.nextLine();
        System.out.println("Your evaluation of this product is: " + address);
    }




    /**
     *
     * Method purchasingArea
     * This method rewrites the method in the Product interface
     * Physical products can purchase 5 piece.
     *
     * @param <T>
     */
    @Override
    public <T extends Product> void purchasingArea() {
        if (country.equals("Australia")) {
            System.out.println("You can purchase products in this area.");  //If the user is in Australia, the system displays that they can purchase this product
        } else {
            System.out.println("Sorry, you are not allowed to purchase products in this area.");
        }  //If the user is in Australia, the system displays that they can purchase this product
    }

    /**
     *
     * Method purchaseQuantity
     * This method rewrites the method in the Product interface
     *
     * @param q
     * @param <T>
     */
    @Override
    public <T extends Product> void purchaseQuantity(int q) {
        if (q <= 5) {
            System.out.println("You are preparing to purchase" + q + "pieces of this product");  //If q is less than or equal to 5,
        }                                                                                        // the system displays that this product can be purchased
        if (q > 5) {
            System.out.println("Sorry, you can only purchase 5 or fewer of this product");
        }  //If q is less than or equal to 2, the system displays that this product cannot be purchased

    }


}
