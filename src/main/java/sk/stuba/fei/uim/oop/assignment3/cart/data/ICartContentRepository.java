package sk.stuba.fei.uim.oop.assignment3.cart.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartContentRepository extends JpaRepository<CartContent, Long> {
    CartContent findById(long id);
}
