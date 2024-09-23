package ie.atu.week2_refresher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    List<Product> productList = new ArrayList<>();

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }


    @GetMapping
    public List<Product>getAllProducts(){
        return productList;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        productList.add(product);
        return product;
    }


}
