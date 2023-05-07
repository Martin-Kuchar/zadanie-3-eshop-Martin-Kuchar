package sk.stuba.fei.uim.oop.assignment3.cart.web.bodies;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;
import sk.stuba.fei.uim.oop.assignment3.cart.data.Cart;
import sk.stuba.fei.uim.oop.assignment3.cart.data.CartContent;

@Getter
@Setter
public class CartResponse {
    private final long id;
    private final List<CartContent> shoppingList;
    private final boolean payed;

    public CartResponse(Cart c) {
        this.id = c.getId();
        this.payed = c.isPayed();
        this.shoppingList = c.getShoppingList();
    }
}
