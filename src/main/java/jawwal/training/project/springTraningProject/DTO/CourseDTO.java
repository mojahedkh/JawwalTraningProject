package jawwal.training.project.springTraningProject.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    @NotBlank(message = "course name is required ")
    public String CourseName;
    @Size(min = 10, message = "Course Description must be at least 10 character")
    public String CourseDescription;

    public Integer CourseHour;


}
