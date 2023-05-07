package sk.stuba.fei.uim.oop.assignment3.cart.logic;

import sk.stuba.fei.uim.oop.assignment3.cart.data.CartContent;
import sk.stuba.fei.uim.oop.assignment3.cart.web.bodies.CartContentResponse;

public interface ICartContentService {
    
    CartContent create(CartContentResponse response);
}
