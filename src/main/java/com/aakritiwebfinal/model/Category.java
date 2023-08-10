package com.aakritiwebfinal.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "category_id")
    private int id;
    private String name;

}
