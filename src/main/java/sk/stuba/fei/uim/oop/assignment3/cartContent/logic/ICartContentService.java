package sk.stuba.fei.uim.oop.assignment3.cartContent.logic;

import sk.stuba.fei.uim.oop.assignment3.cartContent.data.CartContent;

public interface ICartContentService {
    
    CartContent create();

    CartContent save(CartContent c);
}
