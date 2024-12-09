package testesTDD.models.course.services;

import testesTDD.models.course.entity.Course;
import testesTDD.models.course.repository.ICourseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CourseInMemoryRepository implements ICourseRepository {

    private List<Course> courses;

    public CourseInMemoryRepository(){
        this.courses = new ArrayList<>();
    }

    @Override
    public Course findByName(String name) {
        Optional<Course> optionalCourse =  this.courses.stream().filter(course -> course.getName().equals(name)).findFirst();
        return optionalCourse.orElse(null);
    }

    @Override
    public Course Save(Course course) {
        this.courses.add(course);
        course.setId(UUID.randomUUID());
        return course;
    }
}
