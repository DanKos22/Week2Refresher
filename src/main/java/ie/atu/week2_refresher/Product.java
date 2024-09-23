package ie.atu.week2_refresher;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(value = 1, message = "ID must be equal or greater to 1")
    private long id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @Min(value = 1, message = "Price must be equal or greater to 1")
    private double price;
}
