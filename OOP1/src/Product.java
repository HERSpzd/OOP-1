/**
 *
 * Interface Product
 * This the Product interface
 *
 * @author Zidong Peng 24274850
 * @version 11/11/2023
 */
public interface Product {

    /**
     *
     * Method purchasingArea
     * Users can enter the purchase area to determine if the product can be purchased
     * Physical products can only be purchased in the Australian region, while digital
     * products can be purchased in any region.
     *
     * @param <T>
     */
    <T extends Product> void purchasingArea();

    /**
     * Method purchaseQuantity
     * Users can enter the quantity of products purchased. Physical products can purchase
     * 5 pieces, while digital products can purchase 2 pieces.
     *
     * @param q
     * @param <T>
     */
    <T extends Product> void purchaseQuantity(int q);

}
