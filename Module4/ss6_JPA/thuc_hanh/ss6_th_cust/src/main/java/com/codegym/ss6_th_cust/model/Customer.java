package com.codegym.ss6_th_cust.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "firsname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

//    @Column(name = "linkmeet")
//    private String linkmeet;
//
//    @Column(name = "dateregister", columnDefinition = "DATE")
//    private String dateregister;
}
