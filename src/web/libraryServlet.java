package web;

import pojo.Library;
import service.ILibraryService;
import service.impl.LibraryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "libraryServlet")
public class libraryServlet extends HttpServlet {
    ILibraryService service=new LibraryServiceImpl();//调 存 转
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
            List<Library> list=service.selectAll();
            request.getSession().setAttribute("list",list);
            request.getRequestDispatcher("/library.jsp").forward(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
