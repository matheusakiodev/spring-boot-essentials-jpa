package br.com.matheusakio.spring_boot_essentials_jpa.database.repository;

import br.com.matheusakio.spring_boot_essentials_jpa.database.model.AlunosEntity;
import br.com.matheusakio.spring_boot_essentials_jpa.database.model.ExerciciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// Só de extender, ele já interpreta a interface como um bean, não é necessário a anotação
public interface IAlunosRepository extends JpaRepository<AlunosEntity, Integer> {

}
