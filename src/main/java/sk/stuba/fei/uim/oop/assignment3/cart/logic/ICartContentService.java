package sk.stuba.fei.uim.oop.assignment3.cart.logic;

import sk.stuba.fei.uim.oop.assignment3.cart.data.CartContent;

public interface ICartContentService {
    
    CartContent create();

    CartContent save(CartContent c);
}
