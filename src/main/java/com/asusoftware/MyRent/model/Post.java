package com.asusoftware.MyRent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "users")
public class Post {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "category_type")
    private CategoryType categoryType;

    @NotBlank
    @Column(name = "price_per_day")
    private String pricePerDay;

    @NotBlank
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
