package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.DataSource;
import lombok.Data;

@Data
public class User {
    private Integer id;

    private String name;
    private String password;
    private String role;
}
