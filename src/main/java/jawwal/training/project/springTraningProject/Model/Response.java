package jawwal.training.project.springTraningProject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> {
    public String responseCode;
    public String responseMessage;
    public T responseResult;
}