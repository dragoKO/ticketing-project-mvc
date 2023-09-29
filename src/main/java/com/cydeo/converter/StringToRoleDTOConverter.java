package com.cydeo.converter;

import com.cydeo.dto.RoleDTO;
import com.cydeo.service.RoleService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationPropertiesBinding // convert to object automatically (not working)
public class StringToRoleDTOConverter implements Converter<String, RoleDTO> {
    RoleService roleService;

    public StringToRoleDTOConverter(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public RoleDTO convert(String source) {

        return roleService.findById(Long.parseLong(source));
    }
}

