package sk.stuba.fei.uim.oop.assignment3.product.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sk.stuba.fei.uim.oop.assignment3.exception.NotFoundException;
import sk.stuba.fei.uim.oop.assignment3.product.data.IProductRepository;
import sk.stuba.fei.uim.oop.assignment3.product.data.Product;
import sk.stuba.fei.uim.oop.assignment3.product.web.bodies.ProductRequest;
import sk.stuba.fei.uim.oop.assignment3.product.web.bodies.ProductUpdateRequest;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository repository;

    @Override
    public List<Product> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Product create(ProductRequest request) throws NotFoundException {
        Product p = this.repository.save(new Product(request));
        return p;
    }

    @Override
    public Product getById(long id) throws NotFoundException {
        Product p = this.repository.findById(id);
        if (p == null) {
            throw new NotFoundException();
        }
        return p;
    }

    @Override
    public Product update(long id, ProductUpdateRequest request) throws NotFoundException {
        Product p = this.getById(id);
        if (request.getName() != null) {
            p.setName(request.getName());
        }
        if (request.getDescription() != null) {
            p.setDescription(request.getDescription());
        }
        return this.repository.save(p);
    }
    
    @Override
    public void delete(long id) throws NotFoundException {
        this.repository.delete(this.getById(id));
    }

    @Override
    public int getAmount(long id) throws NotFoundException {
        Product p = this.getById(id);
        return p.getAmount();
    }
}
