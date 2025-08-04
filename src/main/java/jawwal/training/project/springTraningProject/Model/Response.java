package jawwal.training.project.springTraningProject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
public class Response {
    public String responseCode;
    public String responseMessage;
    public Map<String , Object> responseStatus;
}