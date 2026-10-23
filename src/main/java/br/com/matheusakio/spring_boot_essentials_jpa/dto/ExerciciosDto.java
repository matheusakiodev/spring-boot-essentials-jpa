package br.com.matheusakio.spring_boot_essentials_jpa.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ExerciciosDto {

    private String nome;
    private String grupoMuscular;
}
