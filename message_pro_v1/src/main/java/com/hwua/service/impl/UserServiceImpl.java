package com.hwua.service.impl;

import com.hwua.dao.IUserDao;
import com.hwua.dao.impl.UserDaoImpl;
import com.hwua.entity.User;
import com.hwua.service.IUserServices;

import java.sql.SQLException;

public class UserServiceImpl implements IUserServices {
    private final IUserDao iUserDao = new UserDaoImpl();
    @Override
    public User QueryUser(User user) {
        try {
            return iUserDao.QueryUser(user);
        } catch (SQLException e) {
            return null;
        }
    }
}
