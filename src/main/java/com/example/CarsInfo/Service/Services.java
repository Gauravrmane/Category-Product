package com.example.CarsInfo.Service;

import com.example.CarsInfo.Entity.Category;
import com.example.CarsInfo.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface Services {
    Category saveCategory(Category category);

    Product saveProduct(Product product);

    List<Category> getAllcategory();

    Optional<Category> getAllcategorybyId(Long id);

    Optional<Category> updateCategoryById(Long id, Category category);

    void deleteCategoryById(Long id);

    List<Product> getAllProduct();

    Optional<Product> getproductById(Long id);

    Optional<Product> updateProductById(Long id, Product product);

    void deleteProductById(Long id);
}
