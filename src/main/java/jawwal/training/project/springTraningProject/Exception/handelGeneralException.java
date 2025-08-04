package jawwal.training.project.springTraningProject.Exception;


import jawwal.training.project.springTraningProject.Model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class handelGeneralException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodNotArqumentException(MethodArgumentNotValidException ex){
        Map<String,Object> result = new HashMap<>();

        ex.getBindingResult().getFieldErrors()
                .stream()
                .forEach( fileds ->
                        result.put(fileds.getField() , fileds.getDefaultMessage()));

        return ResponseEntity.status(HttpStatus.OK).body(
                new Response("-1" , "Failed" ,result ));
    }

}
