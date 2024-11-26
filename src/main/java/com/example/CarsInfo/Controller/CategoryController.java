package com.example.CarsInfo.Controller;

import com.example.CarsInfo.Entity.Category;
import com.example.CarsInfo.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    private Services services;

    @PostMapping("/savecategory")
    public  Category saveCategory(@RequestBody Category category){

        return services.saveCategory(category);
    }

    //GetallCategory

    @GetMapping("/getAllcategory")
    public List<Category> getAllcategory(){

        return services.getAllcategory();
    }


    @GetMapping("/getAllcategorybyId/{id}" )
    public Optional<Category> getAllcategorybyId(@PathVariable Long id){

        return services.getAllcategorybyId(id);
    }

    @PutMapping("/updateCategoryById/{id}")
    public Optional<Category> updateCategoryById(@PathVariable Long id, @RequestBody Category category){
        return services.updateCategoryById(id,category);

    }

   @DeleteMapping("/deleteCategoryById/{id}")
    public void deleteCategoryById (@PathVariable Long id){

        services.deleteCategoryById(id);
    }


}
