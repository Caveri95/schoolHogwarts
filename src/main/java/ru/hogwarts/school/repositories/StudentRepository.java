package ru.hogwarts.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findStudentByAge(int age);

    List<Student> findStudentByAgeBetween(int min, int max);

    List<Student> findStudentByFacultyId(long id);

}
