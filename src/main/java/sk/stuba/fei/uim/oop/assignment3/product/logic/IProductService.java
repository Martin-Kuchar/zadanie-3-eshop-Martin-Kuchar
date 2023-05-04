package sk.stuba.fei.uim.oop.assignment3.product.logic;

import java.util.List;

import sk.stuba.fei.uim.oop.assignment3.exception.NotFoundException;
import sk.stuba.fei.uim.oop.assignment3.product.data.Product;
import sk.stuba.fei.uim.oop.assignment3.product.web.bodies.ProductRequest;
import sk.stuba.fei.uim.oop.assignment3.product.web.bodies.ProductUpdateRequest;

public interface IProductService {
    
    List<Product> getAll();

    Product create(ProductRequest request) throws NotFoundException;

    Product getById(long id) throws NotFoundException;

    Product update(long id, ProductUpdateRequest request) throws NotFoundException;

    void delete(long id) throws NotFoundException;

    int getAmount(long id) throws NotFoundException;
}
