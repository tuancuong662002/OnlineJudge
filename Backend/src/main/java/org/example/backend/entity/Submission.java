package org.example.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "submissions")
@Getter
@Setter
public class Submission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "problem_id", nullable = false)
    private Problem problem;

    @Lob
    @Column(name = "source_code", nullable = false, columnDefinition = "TEXT")
    private String sourceCode;

    @Column(nullable = false, length = 20)
    private String language;

    @Column(nullable = false, length = 50)
    private String status = "Pending";

    private Integer executionTime; // ms

    private Integer memoryUsed; // KB

    // ...
}