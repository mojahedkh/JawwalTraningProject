package jawwal.training.project.springTraningProject.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static List<String> names =
            new ArrayList<>(List.of("Ahmad", "Mohammad", "Lama", "Manar"));

    public Optional<String> getName(String name){
        return names.stream().
                filter(name2 -> name2.equals(name)).
                findFirst() ;
    }

}
