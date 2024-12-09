package testesTDD.models.course.repository;

import org.springframework.stereotype.Repository;
import testesTDD.models.course.entity.Course;

@Repository
public interface ICourseRepository {

    public Course findByName(String name);

    public Course Save(Course course);

}
