package jawwal.training.project.springTraningProject.Controller;

import jakarta.validation.Valid;
import jawwal.training.project.springTraningProject.DTO.UserDTO;
import jawwal.training.project.springTraningProject.Exception.UserException.UserNameNotFoundException;
import jawwal.training.project.springTraningProject.Model.Response;
import jawwal.training.project.springTraningProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.*;
/* https/localhost:8080/user/getUser   */
@RestController
@RequestMapping("user")
public class UserController {
    private static List<String> names =
            new ArrayList<>(List.of("Ahmad", "Mohammad", "Lama", "Manar"));

    @Autowired
    public UserService userService;

    @GetMapping("/getUser")
    public List<String> getName() {
        return names;
    }
    @GetMapping("/getSpecificName/{userName}")
    public ResponseEntity<String> getsSpecificName(String userName){
        String name = userService.getName(userName).
                orElseThrow(()-> new UserNameNotFoundException("UserNameNot found"));

        return ResponseEntity.ok(name);
    }


    @GetMapping("/getUserByUserName/{userName}")
    public Optional<String> getUserByUserName(@PathVariable String userName) {

        return names.stream()
                .filter(user -> user.equals(userName))
                .findFirst();
    }

    @PostMapping("/addNewUser")
    public ResponseEntity<?> addNewUser(@Valid @RequestBody UserDTO user , BindingResult result) {

        if(!result.hasErrors()){
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new  Response("0" , "Success" , null));
        }
        else{
            Map<String,Object> resultSet = new HashMap<>();

            result.getFieldErrors()
                    .stream()
                    .forEach( fileds ->
                            resultSet.put(fileds.getField() , fileds.getDefaultMessage()));

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new Response("-1" , "Failed" ,resultSet ));

        }
    }

    @PostMapping("/validatePhoneName")
    public UserDTO validateUser(@RequestBody UserDTO user) {
        return user;
    }
    /* Please add Method Here --Task-- */


}
