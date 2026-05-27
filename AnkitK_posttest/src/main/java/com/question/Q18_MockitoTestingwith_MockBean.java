package com.question;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.mockito.MockBean;

@SpringBootTest
class Q18_MockitoTestingwith_MockBean {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @Test
    void testGetById_UsesMockBean() {
        Product sample = new Product();
        sample.setId(1L);
        sample.setName("Laptop");

        when(productRepository.findById(1L)).thenReturn(Optional.of(sample));

        Product result = productService.getById(1L);

        assertEquals("Laptop", result.getName());
    }
}

