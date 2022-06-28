package ucuenca.ejemplo.store.shopping.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

@Data
public class Product {
    private long id;
    private String name;
    private String description;
    private double price;
    private double stock;
    private String status;
    private Date createAt;
    private Category category;
}
