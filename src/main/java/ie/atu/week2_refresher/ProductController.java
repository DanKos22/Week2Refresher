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

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        int i;
        for(i = 0; i <= productList.size(); i++){
            product = productList.get(i);
        }
        productList.set(i, product);
        return product;
    }


    @DeleteMapping("/{id}")
    public List<Product> deleteProduct(@PathVariable("id") long id){
        productList.removeIf(product -> product.getId() == id);
        return productList;
    }
}
