package br.com.matheusakio.spring_boot_essentials_jpa.controller;

import br.com.matheusakio.spring_boot_essentials_jpa.database.model.ExerciciosEntity;
import br.com.matheusakio.spring_boot_essentials_jpa.dto.ExerciciosDto;
import br.com.matheusakio.spring_boot_essentials_jpa.service.ExerciciosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/exercicios")
@RequiredArgsConstructor
public class ExerciciosController {

    private final ExerciciosService exerciciosService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ExerciciosEntity> findAll(){
        return exerciciosService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody ExerciciosDto exercicio){
        exerciciosService.save(exercicio);
    }
}
