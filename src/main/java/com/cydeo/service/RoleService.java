package com.cydeo.service;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;

import java.util.List;


public interface RoleService {
    //    save, find, delete, findAll
    RoleDTO save(RoleDTO roleDTO);

    RoleDTO findBy(Long id);

    List<RoleDTO> findAll();

    void delete(RoleDTO role);

    void delete(Long id);

}
