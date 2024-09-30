package ie.atu.week2_refresher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week2RefresherApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week2RefresherApplication.class, args);
    }

}
