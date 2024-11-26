package com.example.CarsInfo.Controller;

import com.example.CarsInfo.Entity.Product;
import com.example.CarsInfo.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

   @Autowired
    private Services services;

   @PostMapping("/saveproduct")
   public Product saveProduct(@RequestBody Product product){

       return services.saveProduct(product);
   }


   @GetMapping("/getAllProduct")
   public List<Product> getAllProduct(){

       return  services.getAllProduct();
   }

   @GetMapping("/getproductById/{id}")
   public Optional<Product> getproductById(@PathVariable Long id ){
        return services.getproductById(id);
   }

   @PutMapping("/updateProductById/{id}")
   public Optional<Product> updateProductById(@PathVariable Long id ,@RequestBody Product product){

       return services.updateProductById(id,product);
   }


   @DeleteMapping("/deleteProductById/{id}")
   public void deleteProductById (@PathVariable Long id){

       services.deleteProductById(id);

   }



}
