package com.mryzhan.service;

import com.mryzhan.dto.RoleDTO;
import com.mryzhan.exception.UserServiceException;

import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long id) throws UserServiceException;
}
