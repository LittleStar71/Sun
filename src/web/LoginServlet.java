package web;
import org.apache.commons.beanutils.BeanUtils;
import pojo.User;
import service.IUserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class LoginServlet extends HttpServlet {
    IUserService service=new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, String[]> map = request.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
            int i=service.login(user);
            if(i==1)
            {
                response.getWriter().write("<script>alert(登陆成功)</script>");
                request.getRequestDispatcher("success.jsp").include(request,response);
            }
            else
            {
                response.getWriter().write("<script>alert('登陆失败')</script>");
                request.getRequestDispatcher("index.jsp").include(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {

    }
}
