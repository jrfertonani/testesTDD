package testesTDD.models.course.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testesTDD.models.course.entity.Course;
import testesTDD.models.course.repository.ICourseRepository;
import testesTDD.models.course.services.CreateCourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private ICourseRepository repository;

    @PostMapping
    public Course cresteCourse(@RequestBody Course course){
        CreateCourseService createCourseService = new CreateCourseService(repository);
        return createCourseService.execute(course);
    }
}
