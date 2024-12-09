package data.jpa.spring.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import data.jpa.spring.dto.UserDTO;
import data.jpa.spring.entity.User;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDTO (User user);

    User toEntity (UserDTO userDTO);

}
