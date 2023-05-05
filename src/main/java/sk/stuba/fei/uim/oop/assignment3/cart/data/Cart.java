package sk.stuba.fei.uim.oop.assignment3.cart.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import sk.stuba.fei.uim.oop.assignment3.product.data.Product;

@Entity
@Getter
@Setter
public class Cart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(cascade = {CascadeType.REMOVE})
    private List<Product> shoppingList;
    private boolean payed;

    public Cart() {
        this.shoppingList = new ArrayList<>();
        //this.payed = c.isPayed();
    }

}
