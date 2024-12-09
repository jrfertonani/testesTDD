package testesTDD.models.course.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testesTDD.models.course.entity.Course;

@Service
public class CourseRepository implements  ICourseRepository{

    @Autowired
    CourseJPARepository courseJPARepository;


    @Override
    public Course findByName(String name) {
       return this.courseJPARepository. findByName(name);
    }

    @Override
    public Course Save(Course course) {
        return this.courseJPARepository.save(course);
    }
}
