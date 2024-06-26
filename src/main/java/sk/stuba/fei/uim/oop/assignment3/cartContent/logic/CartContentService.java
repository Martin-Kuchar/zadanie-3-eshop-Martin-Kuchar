package sk.stuba.fei.uim.oop.assignment3.cartcontent.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sk.stuba.fei.uim.oop.assignment3.cartcontent.data.CartContent;
import sk.stuba.fei.uim.oop.assignment3.cartcontent.data.ICartContentRepository;

@Service
public class CartContentService implements ICartContentService {

    @Autowired
    private ICartContentRepository repository;

    @Override
    public CartContent create() {
        return this.repository.save(new CartContent());
    }

    @Override
    public CartContent save(CartContent c) {
        return this.repository.save(c);
    }
}
