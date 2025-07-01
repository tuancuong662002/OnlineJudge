package org.example.backend.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name =  "users")
@Getter
@Setter
public class User {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private long id ;
       @Column(nullable = false)
       private String username ;
       @Column(unique = true , nullable = false )
       private String email ;
       @Column(name= "hashed_password")
       private String hashedPassword ;
       @Column(nullable = false)
       private String role ;
}
