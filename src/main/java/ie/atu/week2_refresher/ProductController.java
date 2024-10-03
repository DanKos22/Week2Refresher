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
    private InventoryServiceClient inventoryServiceClient;

    @Autowired
    public ProductController(ProductService productService, InventoryServiceClient inventoryServiceClient){
        this.productService = productService;
        this.inventoryServiceClient = inventoryServiceClient;
    }


    @GetMapping
    public List<Product>getAllProducts(){
        return productService.getAllProducts();
    }


    @PostMapping
    public Product addProduct(@RequestBody @Valid Product product){
        return productService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }


    @DeleteMapping("/{id}")
    public List<Product> deleteProduct(@PathVariable("id") long id){
        return productService.deleteProduct(id);
    }

    @PostMapping("/send-and-save")
    public String sendAndSave(@RequestBody Product product) {
        String message = inventoryServiceClient.someDetails(product);
        return message;
    }


}
