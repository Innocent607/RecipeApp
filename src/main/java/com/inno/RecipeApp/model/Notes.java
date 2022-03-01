package com.inno.RecipeApp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
@Table(name="notes")
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
