package jawwal.training.project.springTraningProject.Controller;

import jakarta.validation.Valid;
import jawwal.training.project.springTraningProject.DTO.CourseDTO;
import jawwal.training.project.springTraningProject.Exception.CourseException.CourseNotValidException;
import jawwal.training.project.springTraningProject.Model.Response;
import jawwal.training.project.springTraningProject.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Course")
public class CourseController {
    private static List<CourseDTO> names =
            new ArrayList<>(List.of(
                    new CourseDTO("C++" ,"this course is very hard" , 20 ) ,
                    new CourseDTO("Java" ,"this course is very easy" , 10 )
            ));

    @Autowired
    private CourseService courseService ;

    @PostMapping("/addNewCourse")
    public ResponseEntity<Response> addNewCourse(@RequestBody @Valid CourseDTO courseDTO ) {


        /* Insert into Course_Table */
        CourseDTO courseDTO1 = courseService.addCourse(courseDTO);
        return  ResponseEntity.ok(new Response("0" , "Success" , courseDTO1));
    }
}
