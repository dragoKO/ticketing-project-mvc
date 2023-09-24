package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseEntity {
    private Long id;
    private LocalDateTime insertLocalDateTime;
    private Long insertUserId;
    private LocalDateTime lastUpdatedLocalDateTime;
    private Long lastUpdatedUserId;
}
