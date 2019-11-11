package com.cottonfactory.products.repositories;
import com.cottonfactory.products.entities.Shirt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShirtRepository extends CrudRepository<Shirt, Long> {
}
