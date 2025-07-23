package jawwal.training.project.springTraningProject.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CourseDTO {

    @NotBlank(message = "Course name is required")
    private String courseName;

    private String courseID;
    private String course;
    private String description;
    private String category;

}
