package com.hwua.dao;

import com.hwua.entity.User;

import java.sql.SQLException;

public interface IUserDao {
    User QueryUser(User user) throws SQLException;
}
