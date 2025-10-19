package com.example.kiranaStore.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "products")
@EqualsAndHashCode(exclude = "products")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(length = 15)
    private String phoneNum;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Product> products = new ArrayList<>();
}
