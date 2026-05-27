package com.question;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class Q17_Mockito_test {

    @Mock
    private ProductRepository repo;

    @InjectMocks
    private ProductService service;

    @Test
    void testGetById_ReturnsProduct() {
        // Arrange: stub repository
        Product sampleProduct = new Product();
        sampleProduct.setId(1L);
        sampleProduct.setName("Laptop");
        sampleProduct.setPrice(1000.0);

        when(repo.findById(1L)).thenReturn(Optional.of(sampleProduct));

        // Act: call service
        Product result = service.getById(1L);

        // Assert: verify product name
        assertEquals("Laptop", result.getName());
    }
}
