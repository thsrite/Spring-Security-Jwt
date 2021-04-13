package com.erin.security.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户实体类
 * @author jiangxd
 */
@Data
@TableName("t_user")
public class UserInfo {

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @TableField(value = "username")
    private String username;

    @TableField(value = "password")
    private String password;

    @TableField(value = "sex")
    private String sex;

}
