package br.com.matheusakio.spring_boot_essentials_jpa.service;

import br.com.matheusakio.spring_boot_essentials_jpa.database.model.ExerciciosEntity;
import br.com.matheusakio.spring_boot_essentials_jpa.database.repository.IExerciciosRepository;
import br.com.matheusakio.spring_boot_essentials_jpa.dto.ExerciciosDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciciosService {

    private final IExerciciosRepository exerciciosRepository;

    public List<ExerciciosEntity> findAll(){
        return exerciciosRepository.findAll();
    }

    public void save(ExerciciosDto exerciciosDto){
        ExerciciosEntity exercicio = ExerciciosEntity.builder()
                .nome(exerciciosDto.getNome())
                .grupoMuscular(exerciciosDto.getGrupoMuscular())
                .build();

        exerciciosRepository.save(exercicio);

    }
}
