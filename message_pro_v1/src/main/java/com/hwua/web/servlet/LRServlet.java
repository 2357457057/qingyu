package com.hwua.web.servlet;

import com.hwua.entity.User;
import com.hwua.service.IUserServices;
import com.hwua.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;


class LRServlet extends HttpServlet {

  private final static IUserServices userService;
      static {
               userService = new UserServiceImpl();
       }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String url = req.getRequestURI(); //  /emp.do
        String methodName = url.substring(url.lastIndexOf("/") + 1, url.lastIndexOf(".")); //
        Method method = null;

        try {
            //使用反射机制获取本类中声明的方法
            method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            // 执行 许可
            method.invoke(this, req, resp);


        } catch (Exception e) {
//              throw new RuntimeException("调用方法出错");
        }
    }

    private void userLogin(HttpServletRequest req, HttpServletResponse resp){
            String name=  req.getParameter("name");
            String pwd = req.getParameter("pwd");
            User user = new User(name,pwd);
            User userTest =  userService.QueryUser(user);
            System.out.println(user);
    }
}
