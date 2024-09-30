package ie.atu.week2_refresher;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Inventory-Service", url = "http://localhost:8081")
public interface InventoryServiceClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody Product product);
}
