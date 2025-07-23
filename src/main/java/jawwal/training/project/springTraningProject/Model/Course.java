package jawwal.training.project.springTraningProject.Model;


import lombok.Data;

@Data
public class Course {
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
