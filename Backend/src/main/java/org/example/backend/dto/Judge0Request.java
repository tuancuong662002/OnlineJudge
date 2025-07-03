package org.example.backend.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Judge0Request {

    private String source_code;
    private Integer language_id;
    private String stdin;
    // getters, setters, constructors
}