package sk.stuba.fei.uim.oop.assignment3.cartContent.web.bodies;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartContentRequest {
    private long productId;
    private int amount;
}
