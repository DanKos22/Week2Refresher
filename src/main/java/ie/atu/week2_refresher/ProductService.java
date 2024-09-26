package ie.atu.week2_refresher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts(){
        return productList;
    }

    public Product addProduct(Product product){
        productList.add(product);
        return product;
    }

    public Product updateProduct(@PathVariable long id, @RequestBody Product product){
        //Loop through the productList
        for(Product oldProduct : productList){
            //If the id passed in the URL matches the id of product in the productList, the product properties will be updated
            if(oldProduct.getId() == id){
                oldProduct.setId(product.getId());
                oldProduct.setName(product.getName());
                oldProduct.setPrice(product.getPrice());
                return oldProduct;
            }
        }
        return product;
    }

    public List<Product> deleteProduct(@PathVariable long id){
        //For each product in productList, remove product if product.getId() is equal to the id passed in the URL
        productList.removeIf(product -> product.getId() == id);
        return productList;
    }
}
