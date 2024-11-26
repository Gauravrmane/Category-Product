package com.example.CarsInfo.Service;

import com.example.CarsInfo.Entity.Category;
import com.example.CarsInfo.Entity.Product;
import com.example.CarsInfo.Repository.CategoryRepo;
import com.example.CarsInfo.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceIMPL implements  Services{

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ProductRepo productRepo;


    @Override
    public Category saveCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Category> getAllcategory() {
        return categoryRepo.findAll();
    }

    @Override
    public Optional<Category> getAllcategorybyId(Long id) {
        return categoryRepo.findById(id);
    }

    @Override
    public Optional<Category> updateCategoryById(Long id , Category category) {

        Optional<Category> find=categoryRepo.findById(id);
        if (find.isPresent()){

            Category getcategory=find.get();
            getcategory.setCompanyName(category.getCompanyName());
            categoryRepo.save(getcategory);
        }
        return find;
    }

    @Override
    public void  deleteCategoryById(Long id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll() ;
    }

    @Override
    public Optional<Product> getproductById(Long id) {
        return productRepo.findById(id);
    }

    @Override
    public Optional<Product> updateProductById(Long id, Product product) {
        Optional<Product> find =productRepo.findById(id);
        if(find.isPresent()){
            Product getproduct =find.get();
            getproduct.setCarModel(product.getCarModel());
            productRepo.save(getproduct);
        }

        return find;
    }

    @Override
    public void deleteProductById(Long id) {
        productRepo.deleteById(id);
    }

}
