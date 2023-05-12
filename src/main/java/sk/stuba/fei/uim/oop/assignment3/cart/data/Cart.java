package sk.stuba.fei.uim.oop.assignment3.cart.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(orphanRemoval = true)
    private List<CartContent> shoppingList;
    
    private boolean payed;

    public Cart() {
        this.shoppingList = new ArrayList<>();
    }
}
