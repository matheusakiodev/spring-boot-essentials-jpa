package br.com.matheusakio.spring_boot_essentials_jpa.database.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExerciciosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, name = "grupo_muscular")
    private String grupoMuscular;

    @ManyToMany
    @JoinTable(name = "treinos_exercicios",
               joinColumns = @JoinColumn(name = "treino_id"),
               inverseJoinColumns = @JoinColumn(name = "exercicio_id")
    )
    private Set<ExerciciosEntity> exercicios = new HashSet<>();



}
