package com.devsuperior.dscommerce.dto;


import com.devsuperior.dscommerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.util.HashSet;
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
    private Double price;
    private String imgUrL;

    private Set<CategoryDTO> categories = new HashSet<>();

    public Set<CategoryDTO> getCategories() {
        return categories;
    }


    public ProductDTO(Long id, String name, String description, Double price, String imgUrL) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrL = imgUrL;
    }

    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
        this.imgUrL = entity.getImgUrL();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrL() {
        return imgUrL;
    }

    public void setImgUrL(String imgUrL) {
        this.imgUrL = imgUrL;
    }
}
