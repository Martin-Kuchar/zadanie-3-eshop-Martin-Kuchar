package sk.stuba.fei.uim.oop.assignment3.cart.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findAll();

    Cart findById(long id);
}
