package ie.atu.week2_refresher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
/*
    public Product updateProduct(@PathVariable long id, Product product){
        return productList.;
    }*/

    public List<Product> deleteProduct(long id){
        productList.remove(id);
        return productList;
    }


}
