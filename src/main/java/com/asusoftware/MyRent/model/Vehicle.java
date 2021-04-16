package com.asusoftware.MyRent.model;

import com.sun.istack.Nullable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue
    private UUID id;

    @Nullable
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;

    @Nullable
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "boat_id", referencedColumnName = "id")
    private Boat boat;
}
