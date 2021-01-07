package io.emma.Juguetes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "juguetes")
public class Juguete {
    @Column(length = 200)
    private String name;
    private String color;//Tamano maximo de 250 char si quiero mas @column + tamano
    private float precio;

    //private Categoria categoria;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Juguete(){};

    public Juguete(String name, String color, float precio,  int id){
        this.name = name;
        this.color = color;
        this.precio = precio;
        //this.categoria = categoria;
        this.id = id;
    }


}
