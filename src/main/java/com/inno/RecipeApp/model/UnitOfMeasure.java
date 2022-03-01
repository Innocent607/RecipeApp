package com.inno.RecipeApp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

@Data
@Entity
@Table(name="unit_of_measure")
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
