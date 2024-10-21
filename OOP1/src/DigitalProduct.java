/**
 *
 * Class DigitalProduct
 *
 * This is Digital Product class. This class implements
 *  * the Product interface.
 *
 * @author Zidong Peng 24274850
 * @version 11/11/2023
 */
public abstract class DigitalProduct implements Product{

    int productPrice2;  //Defined product price variable
    String productName2;  //Defined product name variable
    int purchaseQuantity;  //Define a purchase quantity variable
    String computerSystem;  //Define a computer system name variable
    String country;  //Defined country variable



    /**
     *
     * DigitalProduct default constructor
     *
     */
    public DigitalProduct() {}

    /**
     *
     * PhysicalProduct constructor
     * A second constructor that sets all the instance variables
     *
     * @param productPrice2
     * @param productName2
     * @param purchaseQuantity
     * @param computerSystem
     * @param country
     */
    protected DigitalProduct(int productPrice2, String productName2, int purchaseQuantity, String computerSystem, String country) {
        this.productPrice2 = productPrice2;
        this.productName2 = productName2;
        this.purchaseQuantity = purchaseQuantity;
        this.computerSystem = computerSystem;
        this.country = country;
    }

    /**
     *
     * Method purchaseQuantityPlus1
     * Calling this method will increase the purchase quantity variable in the system by one
     *
     */
    public void purchaseQuantityPlus1() {
        purchaseQuantity = purchaseQuantity + 1;
    }

    /**
     *
     * Method chooseComputerSystem
     *
     */
    public abstract void chooseComputerSystem();

    /**
     *
     * Method purchasingArea
     * This method rewrites the method in the Product interface.
     * Digital products can be purchased in any region.
     *
     * @param <T>
     */
    @Override
    public <T extends Product> void purchasingArea() {
        System.out.println("You can purchase products in this area.");
    }

    /**
     *
     * Method purchaseQuantity
     * This method rewrites the method in the Product interface
     * Digital products can purchase 2 pieces
     *
     * @param q
     * @param <T>
     */
    @Override
    public <T extends Product> void purchaseQuantity(int q) {
        if (q <= 2) {
            System.out.println("You are preparing to purchase" + q + "pieces of this product"); //If q is less than or equal to 2,
        }                                                                                       // the system displays that this product can be purchased
        if (q > 2) {
            System.out.println("Sorry, you can only purchase 5 or fewer of this product");  //If q is less than or equal to 2, the system displays that this product cannot be purchased
        }
    }



}
