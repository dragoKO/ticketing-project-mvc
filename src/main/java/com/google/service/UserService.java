package com.google.service;


import com.google.dto.UserDTO;

;import java.util.List;

public interface UserService extends CrudService<UserDTO,String> {
    List<UserDTO> findManagers();



}
