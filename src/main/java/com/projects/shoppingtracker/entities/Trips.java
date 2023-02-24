package com.projects.shoppingtracker.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "trips")
public class Trips {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String store;
    private String tripDate;
    private Integer amount;
}
