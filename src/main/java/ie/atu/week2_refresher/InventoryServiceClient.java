package ie.atu.week2_refresher;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Inventory-Service", url = "${feign.url}")
public interface InventoryServiceClient {
    @PostMapping("/addProduct")
    //Product addProduct(@RequestBody Product product);
    String someDetails(@RequestBody Product product);
}

//http://inventoryservice:8081