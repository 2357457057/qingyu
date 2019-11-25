package com.hwua.web.servlet;

import com.hwua.entity.User;
import com.hwua.service.IUserServices;
import com.hwua.service.impl.UserServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class servletLR extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IUserServices userService = new UserServiceImpl();;

        System.out.println("???????????");
        String name=req.getParameter("name");
        String pwd = req.getParameter("pwd");
        System.out.println(name);
        System.out.println(pwd);
        User user = new User(name,pwd);
        User userTest =  userService.QueryUser(user);
        System.out.println(user);
        System.out.println("test"+userTest);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("---load----");
    }
}
