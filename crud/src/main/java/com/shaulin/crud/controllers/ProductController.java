package com.shaulin.crud.controllers;

import com.shaulin.crud.dtos.ProductDTO;
import com.shaulin.crud.model.Product;
import com.shaulin.crud.repositories.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping
    public ResponseEntity getAllProducts() {
        List<Product> listProducts = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listProducts);
    }

    @GetMapping("/{id}")
    public ResponseEntity getProductById(@PathVariable(value = "id") Integer id) {
        Optional<Product> product = repository.findById(id);
        if (product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PRODUCT NOT FOUND");
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(product.get());
    }

    @PostMapping
    public ResponseEntity insertProduct(@RequestBody ProductDTO productDTO) {
        var product = new Product();
        BeanUtils.copyProperties(productDTO, product);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delteProduct(@PathVariable(value = "id") Integer id) {
        Optional<Product> product = repository.findById(id);
        if (product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PRODUCT NOT FOUND");
        }
        repository.delete(product.get());
        return ResponseEntity.status(HttpStatus.OK).body("PRODUCT DELETED");
    }

    @PutMapping("/{id}")
    public ResponseEntity updateProduct(@PathVariable(value = "id") Integer id, @RequestBody ProductDTO productDTO) {
        Optional<Product> product = repository.findById(id);
        if (product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PRODUCT NOT FOUND");
        }

        var productModel = product.get();
        BeanUtils.copyProperties(productDTO, productModel);

        return ResponseEntity.status(HttpStatus.OK).body(repository.save(productModel));
    }
}
