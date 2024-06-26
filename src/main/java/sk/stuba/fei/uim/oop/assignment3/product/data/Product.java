package sk.stuba.fei.uim.oop.assignment3.product.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sk.stuba.fei.uim.oop.assignment3.product.web.bodies.ProductRequest;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private int amount;
    private String unit;
    private double price;

    public Product(ProductRequest r) {
        this.name = r.getName();
        this.description = r.getDescription();
        this.amount = r.getAmount();
        this.unit = r.getUnit();
        this.price = r.getPrice();
    }
}
