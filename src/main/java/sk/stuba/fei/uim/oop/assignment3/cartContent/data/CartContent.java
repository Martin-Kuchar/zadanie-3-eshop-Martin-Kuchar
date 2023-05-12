package sk.stuba.fei.uim.oop.assignment3.cartContent.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sk.stuba.fei.uim.oop.assignment3.product.data.Product;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CartContent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Product product;
    private int amount;

    public CartContent(Product p, int amount) {
        this.product = p;
        this.amount = amount;
    }
}
