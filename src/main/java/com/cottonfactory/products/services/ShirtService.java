package com.cottonfactory.products.services;

import com.cottonfactory.products.entities.Shirt;
import com.cottonfactory.products.repositories.ShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShirtService {

    @Autowired
    private ShirtRepository shirtRepository;

    public void addShirt(Shirt shirt) {
        // TODO: Issue #2 - Make sure that no duplicate shirts are created!
        shirtRepository.save(shirt);
    }

    public List<Shirt> findAll() {
        Iterable shirtList = shirtRepository.findAll();
        List shirts = new ArrayList<Shirt>();

        shirtList.forEach( s -> shirts.add(s));
        return shirts;
    }

    public Shirt findShirtById(Long id) {
        Shirt shirt = shirtRepository.findById(id).get();
        return shirt;
    }

    public void updateShirt(Shirt shirt) {
        shirtRepository.save(shirt);
    }

    public void deleteShirt(Long id) {
        Shirt shirt = this.findShirtById(id);
        shirtRepository.delete(shirt);
    }

    public Shirt save(Shirt shirt) {
        return shirtRepository.save(shirt);
    }
}
