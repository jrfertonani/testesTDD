package testesTDD.models.course.services;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.ErrorResponseException;
import testesTDD.models.course.entity.Course;
import testesTDD.models.course.repository.CourseJPARepository;
import testesTDD.models.course.repository.ICourseRepository;

@Service
public class CreateCourseService {


    private ICourseRepository repository;

    public CreateCourseService(ICourseRepository repository){
        this.repository = repository;
    }

    public Course execute(Course course){



        // Validar se os dados do curso estão válidos

        // validar se o course existe
        Course existedCourse = this.repository.findByName(course.getName());


        //Se sim = retorna erro
        if(existedCourse != null){
            throw new Error("Curso ja existe!");
        }

        //Se não - retorna novo curso
        return this.repository.Save(course);

    };

}
