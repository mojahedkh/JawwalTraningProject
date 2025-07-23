package jawwal.training.project.springTraningProject.Mapper;

import jawwal.training.project.springTraningProject.DTO.UserDTO;
import jawwal.training.project.springTraningProject.Entity.UserEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity mapToEntity(UserDTO userDTO);
    UserDTO mapToDTO(UserEntity userEntity);
}
