package jawwal.training.project.springTraningProject.Service;

import jawwal.training.project.springTraningProject.DTO.CourseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private static List<CourseDTO> Courses =
            new ArrayList<>(List.of(
                    new CourseDTO("C++" ,"this course is very hard" , 20 ) ,
                    new CourseDTO("Java" ,"this course is very easy" , 10 )
            ));

    public CourseDTO addCourse(CourseDTO courseDTO){
        Courses.add(courseDTO);
        return courseDTO;
    }
}
