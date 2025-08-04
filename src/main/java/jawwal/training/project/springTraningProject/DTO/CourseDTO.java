package jawwal.training.project.springTraningProject.DTO;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    public String CourseName;
    public String CourseDescription;

    @Size(min = 2, max = 4, message = "Course hour must be between 2 and 4 hour")
    public Integer CourseHour;

    public String CourseCategory;
    public String CourseDepartment;

}
