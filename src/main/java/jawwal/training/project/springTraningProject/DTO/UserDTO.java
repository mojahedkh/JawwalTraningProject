package jawwal.training.project.springTraningProject.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDTO {

    @NotBlank(message = "userNumber is Required  ")
    public String userName;
    @NotBlank(message = "PhoneNumber is Required ")
    public String userPhoneNumber;
    public String userAddress;
}
