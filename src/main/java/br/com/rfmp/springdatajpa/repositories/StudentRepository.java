package br.com.rfmp.springdatajpa.repositories;

import br.com.rfmp.springdatajpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
