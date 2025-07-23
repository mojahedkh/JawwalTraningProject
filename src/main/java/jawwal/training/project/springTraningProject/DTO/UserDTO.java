package jawwal.training.project.springTraningProject.DTO;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserDTO {
    @NotBlank(message = "user name is required")
    public String userName;

    @Pattern(regexp = "^599\\d{6}$", message = "Phone number must start with 599 and be 9 digits long")
    public String userPhoneNumber;
    public String userAddress;
}
