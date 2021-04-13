package com.erin.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.erin.security.dao.UserDao;
import com.erin.security.pojo.UserInfo;
import com.erin.security.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl extends ServiceImpl<UserDao, UserInfo> implements IUserService {

    @Autowired
    private UserDao userdao;

    public UserInfo findUserById(Long userId){
        UserInfo userInfo = this.userdao.selectById(userId);
        return userInfo;
    }

}
