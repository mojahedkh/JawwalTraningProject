package jawwal.training.project.springTraningProject.Controller;

import jawwal.training.project.springTraningProject.Model.Course;
import jawwal.training.project.springTraningProject.Model.StringProcessTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("User")
public class UserController {

    private List<String> allCourses = List.of("Medicine", "calculas -1- ", "calculas -2-", "Mathmatics", "Phyics", "Software Enginnering");


    @GetMapping("/getUser")
    public String getUser() {
        return "Mujahed";
    }


    @PostMapping("/getSpecificCourse")
    public ResponseEntity<?> getSpecificCourse(@RequestBody Course courseRequest) {
        try {
            String Course = allCourses
                    .stream()
                    .filter(course -> course.contains(courseRequest.getCourseName()))
                    .findFirst().orElseThrow(() ->
                            new RuntimeException("There is no Course name "));
        } catch (Exception ex) {
            System.out.println("Exception type is : " + ex.getClass());
            return ResponseEntity.ok(Map.of("ResponseCode", "-1", "ResponseMessege", "Failed"));
        }
        return ResponseEntity.ok(Map.of("ResponseCode", "0", "ResponseMessege", "Success"));
    }

    @PostMapping("/addNewUser")
    public ResponseEntity<String> addNewUser(String user) {
        allCourses.add(user);
        return ResponseEntity.ok("Success");
    }
}
