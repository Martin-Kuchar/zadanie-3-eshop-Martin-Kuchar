package sk.stuba.fei.uim.oop.assignment3.cart.logic;

import java.util.List;

import sk.stuba.fei.uim.oop.assignment3.cart.data.Cart;
import sk.stuba.fei.uim.oop.assignment3.cart.web.bodies.CartContentResponse;
import sk.stuba.fei.uim.oop.assignment3.exception.IllegalOperationException;
import sk.stuba.fei.uim.oop.assignment3.exception.NotFoundException;

public interface ICartService {

    List<Cart> getAll();

    Cart create() throws NotFoundException;

    Cart getById(long id) throws NotFoundException;

    void delete(long id) throws NotFoundException;

    Cart addToCart(long id, CartContentResponse c) throws NotFoundException, IllegalOperationException;

}
