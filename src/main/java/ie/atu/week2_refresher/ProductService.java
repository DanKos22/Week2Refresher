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

    public Product updateProduct(@RequestBody Product product){
        productList.set();
        return product;
    }

    public List<Product> deleteProduct(@PathVariable long id){
        productList.removeIf(product -> product.getId() == id);
        return productList;
    }
}
