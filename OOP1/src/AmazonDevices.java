import java.util.Scanner;

/**
 *
 * Class AmazonDevices
 *
 * This is Amazon Devices class. This class extends Physical Product class and implements
 * Comparable interface.
 * URL: https://www.amazon.com.au/s?i=amazon-devices&ref=nb_sb_noss
 *
 *
 * @author Zidong Peng 24274850
 * @version 11/11/2023
 *
 */
public class AmazonDevices extends PhysicalProduct implements Comparable<AmazonDevices> {

    private String color;  //Define a color variable
    private boolean isChildrenDevice;  //Define whether is a child device variable



    /**
     *
     * AmazonDevices default constructor
     *
     */
    public AmazonDevices() {}

    /**
     *
     * AmazonDevices constructor
     * A second constructor that initialises all the instance variables
     * (including the instance variables in the abstract superclass)
     *
     * @param productPrice1
     * @param productName1
     * @param country
     * @param color
     * @param isChildrenDevice
     */
    public AmazonDevices(int productPrice1, String productName1, String country, String color, boolean isChildrenDevice) {
        super(productPrice1, productName1, country);
        this.color = color;
        this.isChildrenDevice = isChildrenDevice;
    }



    /**
     *
     * Method getColor
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * Method isChildrenDevice
     *
     * @return isChildrenDevice
     */
    public boolean isChildrenDevice() {
        return isChildrenDevice;
    }



    /**
     *
     * Method printDetails
     *
     */
    public void printDetails() {
        System.out.print("The product details are:\n");
        System.out.print("Product name: " + super.productName1 + "\n");
        System.out.print("Product price: " + super.productPrice1 + "$\n");
        System.out.print("Purchase country: " + super.country + "\n");
        System.out.print("Shoes color: " + this.color + "\n");
        System.out.println("Is it a Children's shoes? " + this.isChildrenDevice + "\n");
    }

    /**
     *
     * Method displayPrice
     *
     */
    @Override
    public void addComment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your evaluation of this product: ");
        String comment = scanner.nextLine();
        System.out.println("Your evaluation of this product is: " + comment);

    }


    /**
     *
     * Method compareTo
     *
     * @param a the object to be compared.
     */
    @Override
    public int compareTo(AmazonDevices a) {
        if (a == null) {
            throw new NullPointerException();
        } else {
            if(a.getProductName1().equals(productName1)) {
                return color.compareTo(a.getColor());
            } else {
                return productName1.compareTo(a.getProductName1());
            }
        }
    }
}
