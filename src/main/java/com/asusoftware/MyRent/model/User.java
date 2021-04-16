package com.asusoftware.MyRent.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.Nullable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @Email
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "password")
    private String password;

    @JsonFormat(pattern="yyyy-MM-dd")
    @NotNull
    @Column(name = "birthday")
    private Date birthday;

    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Nullable
    @OneToMany(mappedBy="user")
    private List<Post> posts;
}
