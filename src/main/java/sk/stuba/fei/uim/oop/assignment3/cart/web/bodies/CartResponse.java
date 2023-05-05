package sk.stuba.fei.uim.oop.assignment3.cart.web.bodies;

import java.util.List;

import lombok.Getter;
import sk.stuba.fei.uim.oop.assignment3.cart.data.Cart;
import sk.stuba.fei.uim.oop.assignment3.product.data.Product;

@Getter
public class CartResponse {
    private final long id;
    private final List<Product> shoppingList;
    private final boolean payed;

    public CartResponse(Cart c) {
        this.id = c.getId();
        this.shoppingList = c.getShoppingList();
        this.payed = c.isPayed();
    }
}
