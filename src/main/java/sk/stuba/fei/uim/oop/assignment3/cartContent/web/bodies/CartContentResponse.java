package sk.stuba.fei.uim.oop.assignment3.cartContent.web.bodies;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sk.stuba.fei.uim.oop.assignment3.cartContent.data.CartContent;

@Getter
@Setter
@NoArgsConstructor
public class CartContentResponse {

    private long productId;
    private int amount;

    public CartContentResponse(CartContent c) {
        this.productId = c.getProduct().getId();
        this.amount = c.getAmount();
    }
}
