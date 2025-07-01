package org.example.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name =  "problems")
@Getter
@Setter
public class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column(nullable = false)
    private String title ;
    @Lob // Để lưu trữ text dài
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description ;
    @Column(nullable = false)
    private Integer timeLimit; // ms
    @Column(nullable = false)
    private Integer memoryLimit;
    @OneToMany(mappedBy = "problem", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TestCase> testCases;
}
