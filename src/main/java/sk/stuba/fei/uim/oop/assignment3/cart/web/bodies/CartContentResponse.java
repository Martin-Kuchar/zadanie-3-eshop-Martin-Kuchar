package sk.stuba.fei.uim.oop.assignment3.cart.web.bodies;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CartContentResponse {

    private long productId;
    private int amount;
    
}
