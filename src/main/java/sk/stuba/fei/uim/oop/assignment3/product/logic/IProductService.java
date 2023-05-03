package sk.stuba.fei.uim.oop.assignment3.product.logic;

import java.util.List;

import sk.stuba.fei.uim.oop.assignment3.exception.NotFoundException;
import sk.stuba.fei.uim.oop.assignment3.product.data.Product;
import sk.stuba.fei.uim.oop.assignment3.product.web.bodies.ProductRequest;

public interface IProductService {
    
    List<Product> getAll();

    Product create(ProductRequest request) throws NotFoundException;

    Product getById(long id) throws NotFoundException;
}
