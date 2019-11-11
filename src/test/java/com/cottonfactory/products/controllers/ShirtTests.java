package com.cottonfactory.products.controllers;

import com.cottonfactory.products.entities.Shirt;
import com.cottonfactory.products.repositories.ShirtRepository;
import com.cottonfactory.products.services.ShirtService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShirtTests {
    private ShirtService shirtsvc;

    @MockBean
    private ShirtRepository shirtRepository;

    @Before
    public void setup() {
        // TODO: Issue #1 - Refactor to use mocks.
        shirtsvc = new ShirtService();

    }

    @Test
    public void testGetAllShirts() {
        // Setup: some setup is done in setup method above.
        Shirt shirt1 = new Shirt("large", "green", 20.00f);
        Shirt shirt2 = new Shirt("small", "pink", 15.00f);
        shirtsvc.addShirt(shirt1);
        shirtsvc.addShirt(shirtsvc.save(shirt2));

        // Exercise
        List shirts = shirtsvc.findAll();

        // Assert
        assertEquals(shirts.size(), 2);

        // Teardown
    }
}
