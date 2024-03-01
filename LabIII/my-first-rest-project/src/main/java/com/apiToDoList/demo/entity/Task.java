package com.apiToDoList.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;
    @Column(name = "descricao", length = 255, nullable = false)
    private String descricao;
    @Column(name = "dataEntrega")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataEntrega;
}
