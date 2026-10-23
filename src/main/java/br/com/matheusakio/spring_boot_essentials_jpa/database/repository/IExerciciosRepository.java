package br.com.matheusakio.spring_boot_essentials_jpa.database.repository;

import br.com.matheusakio.spring_boot_essentials_jpa.database.model.ExerciciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Só de extender, ele já interpreta a interface como um bean
public interface IExerciciosRepository extends JpaRepository<ExerciciosEntity, Integer> {

}
