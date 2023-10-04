package com.google.converter;

import com.google.dto.RoleDTO;
import com.google.service.RoleService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
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

