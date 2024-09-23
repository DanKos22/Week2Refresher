package ie.atu.week2_refresher;


import jakarta.validation.Valid;
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
    public Product addProduct(@RequestBody @Valid Product product){
        productList.add(product);
        return product;
    }
    /*
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") long id, @RequestBody Product product){
        return ProductService.updateProduct(id, product);
    }*/


    @DeleteMapping("/{id}")
    public List<Product> deleteProduct(@PathVariable("id") long id){
        productList.remove(id);
        return productList;
    }
}
