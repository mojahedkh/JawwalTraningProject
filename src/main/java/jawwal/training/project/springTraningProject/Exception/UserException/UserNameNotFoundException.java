package jawwal.training.project.springTraningProject.Exception.UserException;

public class UserNameNotFoundException extends RuntimeException {
    public UserNameNotFoundException(String msg){
        super(msg);
    }
}
