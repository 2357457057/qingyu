package com.hwua.dao.impl;

import com.hwua.dao.IUserDao;
import com.hwua.entity.User;
import com.hwua.util.C3P0Util;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDaoImpl implements IUserDao {
    @Override
    public User QueryUser(User user) throws SQLException {
        String Sql = "SELECT * FROM msg WHERE NAME=? PWD=?";
        return C3P0Util.getQueryRunner().query(Sql,new BeanHandler<>(User.class),user.getNAME(),user.getPWD());
    }
}
