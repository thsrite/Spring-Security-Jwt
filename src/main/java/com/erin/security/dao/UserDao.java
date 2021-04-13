package com.erin.security.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.erin.security.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户dao
 * @author jiangxd
 */
@Mapper
public interface UserDao extends BaseMapper<UserInfo> {
}
