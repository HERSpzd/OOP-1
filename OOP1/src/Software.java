/**
 *
 * Class Software
 *
 * This is software class. This class extends Digital Product class.
 *
 * URL: https://www.amazon.com.au/s/ref=nb_sb_noss?url=search-alias%3Dsoftware&field-keywords=
 *
 * @author Zidong Peng 24274850
 * @version 11/11/2023
 *
 */
public class Software extends DigitalProduct {

    private int spaceSize;  //Define variables for the space occupied by a software
    private boolean isChildrenSoftware;  //Define whether is a child's software variable

    /**
     *
     * Software default constructor
     *
     */
    public Software() {}

    /**
     *
     * AmazonDevices constructor
     * A second constructor that initialises all the instance variables
     * (including the instance variables in the abstract superclass)
     *
     * @param productPrice2
     * @param productName2
     * @param purchaseQuantity
     * @param computerSystem
     * @param country
     * @param spaceSize
     * @param isChildrenSoftware
     */
    public Software(int productPrice2, String productName2, int purchaseQuantity, String computerSystem, String country, int spaceSize, boolean isChildrenSoftware) {
        super(productPrice2, productName2, purchaseQuantity, computerSystem, country);
        this.spaceSize = spaceSize;
        this.isChildrenSoftware = isChildrenSoftware;
    }

    /**
     *
     * Method chooseComputerSystem
     *
     */
    @Override
    public void chooseComputerSystem() {
        if (computerSystem.equals("Windows")) {
            System.out.println("This software supports your computer system.");
        }
        if (computerSystem.equals("Mac")) {
            System.out.println("This software supports your computer system.");
        }
        if (computerSystem.equals("Linux")) {
            System.out.println("This software supports your computer system.");
        } else {
            System.out.println("This software does not support your computer system.");
        }
    }

    /**
     *
     * Method printDetail
     *
     */
    public void printDetails() {
        System.out.print("The product details are: \n");
        System.out.print("Product name: " + super.productName2 + "\n");
        System.out.print("Product price: " + super.productPrice2 + "$\n");
        System.out.print("Purchase quantity: " + super.purchaseQuantity + "\n");
        System.out.print("Software space: " + this.spaceSize + "MB\n");
        System.out.print("Is it a Children Software? " + this.isChildrenSoftware + "\n");
    }




}
