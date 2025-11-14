package com.devsuperior.dscommerce.dto;


import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.entities.Product;
import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "nome precisa ter 3 a 80 caracteres")
    @NotBlank(message = "Campo Requerido")
    private String name;
    @Size(min = 10, message = "A descrição precisa ter no minimo 10 caracteres")
    @NotBlank(message = "Campo requerido")
    private String description;
    @Positive(message = "O preço deve ser positivo")
    @NotNull(message = "Campo requerido")
    private Double price;
    private String imgUrL;
@NotEmpty(message = "Deve ter pelo menos uma Categoria")
    private List<Category> categories = new ArrayList<>();

   public ProductDTO(){
    }

    public ProductDTO(Long id, String name, String description, Double price, String imgUrL, List<CategoryDTO> categories) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrL = imgUrL;

    }
    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrL = entity.getImgUrL();
        for (Category cat : entity.getCategories()) {
            categories.add(new CategoryDTO(cat));

        }

}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrL() {
        return imgUrL;
    }

    public List<Category> getCategories() {
        return categories;
    }
}