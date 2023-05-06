package sk.stuba.fei.uim.oop.assignment3.cart.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import sk.stuba.fei.uim.oop.assignment3.cart.web.bodies.CartContentResponse;

@Entity
@Getter
@Setter
public class CartContent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long productId;
    private int amount;

    public CartContent(CartContentResponse r) {
        this.productId = r.getProductId();
        this.amount = r.getAmount();
    }
}
