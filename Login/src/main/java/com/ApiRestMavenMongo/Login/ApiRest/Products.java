package com.ApiRestMavenMongo.Login.ApiRest;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "Shoes")
public class Products {
    @Id
    private String id;
    @NotEmpty
    private String referencia;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String modelo;
    @NotEmpty
    private String talla;
    private String color;
    @NotEmpty
    private Integer precioCompra;
    @NotEmpty
    private Integer precioVenta;


}
