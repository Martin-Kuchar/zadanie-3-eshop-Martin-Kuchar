package sk.stuba.fei.uim.oop.assignment3.cart.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sk.stuba.fei.uim.oop.assignment3.cart.data.Cart;
import sk.stuba.fei.uim.oop.assignment3.cart.data.CartContent;
import sk.stuba.fei.uim.oop.assignment3.cart.data.ICartRepository;
import sk.stuba.fei.uim.oop.assignment3.cart.web.bodies.CartContentResponse;
import sk.stuba.fei.uim.oop.assignment3.exception.IllegalOperationException;
import sk.stuba.fei.uim.oop.assignment3.exception.NotFoundException;
import sk.stuba.fei.uim.oop.assignment3.product.logic.IProductService;

@Service
public class CartService implements ICartService {
    
    @Autowired
    private ICartRepository repository;

    @Autowired
    private IProductService productService;

    @Autowired
    private ICartContentService cartContentService;

    @Override
    public List<Cart> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Cart create() throws NotFoundException {
        Cart c = this.repository.save(new Cart());
        return c;
    }

    @Override
    public Cart getById(long id) throws NotFoundException {
        Cart c = this.repository.findById(id);
        if (c == null) {
            throw new NotFoundException();
        }
        return c;
    }

    @Override
    public void delete(long id) throws NotFoundException {
        this.repository.delete(this.getById(id));
    }

    @Override
    public Cart addToCart(long id, CartContentResponse cc) throws NotFoundException, IllegalOperationException {
        Cart c = this.getById(id);
        if (c.isPayed()) {
            throw new IllegalOperationException();
        }

        this.productService.addAmount(cc.getProductId(), -cc.getAmount());
        ArrayList<CartContent> l = new ArrayList<CartContent>();
        l.add(this.cartContentService.create(cc));
        c.setShoppingList(l);

        return c;
    }

}