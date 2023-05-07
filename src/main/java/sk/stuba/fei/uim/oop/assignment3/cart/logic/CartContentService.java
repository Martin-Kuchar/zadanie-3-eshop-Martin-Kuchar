package sk.stuba.fei.uim.oop.assignment3.cart.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sk.stuba.fei.uim.oop.assignment3.cart.data.CartContent;
import sk.stuba.fei.uim.oop.assignment3.cart.data.ICartContentRepository;
import sk.stuba.fei.uim.oop.assignment3.cart.web.bodies.CartContentResponse;

@Service
public class CartContentService implements ICartContentService {

    @Autowired
    private ICartContentRepository repository;

    @Override
    public CartContent create(CartContentResponse response) {
        return this.repository.save(new CartContent());
    }
    
}
