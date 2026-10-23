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
public class AlunosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;

    @OneToOne
    @JoinColumn(name = "avaliacao_fisica_id")
    private AvaliacoesFisicasEntity avaliacaoFisica;

    @OneToMany(mappedBy = "aluno")
    private Set<TreinoEntity> treinos = new HashSet<>();
}
