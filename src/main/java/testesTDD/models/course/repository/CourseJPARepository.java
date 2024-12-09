package testesTDD.models.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testesTDD.models.course.entity.Course;

import java.util.UUID;

@Repository
public interface CourseJPARepository extends JpaRepository<Course, UUID> {

    public Course findByName(String name);
}
