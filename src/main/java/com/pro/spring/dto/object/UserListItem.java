package com.pro.spring.dto.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserListItem {
    private long id;

    private String name;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
