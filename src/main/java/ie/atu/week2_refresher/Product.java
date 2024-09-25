package ie.atu.week2_refresher;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(value = 1, message = "ID must be greater or equal to 1")
    private long id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @Positive(message = "Price must be a positive number")
    private double price;
}
