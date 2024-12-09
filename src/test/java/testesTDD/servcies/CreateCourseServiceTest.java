package testesTDD.servcies;

import org.junit.jupiter.api.Test;
import testesTDD.models.course.entity.Course;
import testesTDD.models.course.services.CourseInMemoryRepository;
import testesTDD.models.course.services.CreateCourseService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateCourseServiceTest {

    @Test
    public void shoud_br_able_to_create_a_new_course(){
        //criar um novo cursp

        //Criar tabla de curso ( Entidade )

        //ID, descricao, name, morkload
        Course course = new Course();
        course.setDescription("Curso_Description_Test");
        course.setName("Curso_Name");
        course.setWorkload(100);

        //Criar um repositori de curso

        CourseInMemoryRepository repository = new CourseInMemoryRepository();

        //Criar um novo service
        CreateCourseService createCourseService = new CreateCourseService(repository);
        Course createdCourse = createCourseService.execute(course);

        assertNotNull(createdCourse.getId());
    }

    @Test
    public void shoud_not_be_able_to_create_a_new_course_if_exists(){

        Course course = new Course();
        course.setDescription("Not_create_course");
        course.setName("Not_create_course");
        course.setWorkload(100);

        CourseInMemoryRepository repository = new CourseInMemoryRepository();

        CreateCourseService createCourseService = new CreateCourseService(repository);
        createCourseService.execute(course);
        createCourseService.execute(course);


    }
}
