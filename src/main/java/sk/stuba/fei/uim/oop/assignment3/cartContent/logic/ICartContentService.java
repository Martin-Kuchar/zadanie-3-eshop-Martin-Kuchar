package sk.stuba.fei.uim.oop.assignment3.cartcontent.logic;

import sk.stuba.fei.uim.oop.assignment3.cartcontent.data.CartContent;

public interface ICartContentService {
    
    CartContent create();

    CartContent save(CartContent c);
}
