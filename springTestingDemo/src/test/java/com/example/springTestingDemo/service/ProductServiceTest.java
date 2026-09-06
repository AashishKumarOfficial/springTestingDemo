
        package com.example.springTestingDemo.service;

import com.example.springTestingDemo.entity.Product;
import com.example.springTestingDemo.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    void shouldReturnProductWhenProductExists() {

        // Arrange
        Product product = new Product(1L, "Laptop", 50000, 10);

        when(productRepository.findById(1L))
                .thenReturn(Optional.of(product));

        // Act
        Product actualResult =
                productService.getProductById(1L);

        // Assert
        assertEquals(1L, actualResult.getId());
        assertEquals("Laptop", actualResult.getName());

        verify(productRepository).findById(1L);
    }

    @Test
    void shouldThrowExceptionWhenProductDoesNotExist() {

        // Arrange
        when(productRepository.findById(99L))
                .thenReturn(Optional.empty());

        // Act + Assert
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> productService.getProductById(99L)
                );

        assertEquals(
                "Product not found 99",
                exception.getMessage()
        );

        verify(productRepository).findById(99L);
    }

    @Test
    void shouldCreateProductWhenNameIsUnique() {

        // Arrange
        Product product = new Product(1L, "Laptop", 50000, 10);

        when(productRepository.existsByName("Laptop"))
                .thenReturn(false);

        when(productRepository.save(product))
                .thenReturn(product);

        // Act
        Product actualResult =
                productService.createProduct(product);

        // Assert
        assertEquals("Laptop", actualResult.getName());
        assertEquals(50000, actualResult.getPrice());


        verify(productRepository).existsByName("Laptop");
        verify(productRepository).save(product);
    }
}
