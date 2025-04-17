package gr.aueb.cf.schoolapp.controller;

import gr.aueb.cf.schoolapp.dao.CityDAOImpl;
import gr.aueb.cf.schoolapp.dao.ICityDAO;
import gr.aueb.cf.schoolapp.dao.ITeacherDAO;
import gr.aueb.cf.schoolapp.dao.TeacherDAOImpl;
import gr.aueb.cf.schoolapp.dto.TeacherReadOnlyDTO;
import gr.aueb.cf.schoolapp.exceptions.TeacherDAOException;
import gr.aueb.cf.schoolapp.exceptions.TeacherNotFoundException;
import gr.aueb.cf.schoolapp.model.Teacher;
import gr.aueb.cf.schoolapp.service.CityServiceImpl;
import gr.aueb.cf.schoolapp.service.ICityService;
import gr.aueb.cf.schoolapp.service.ITeacherService;
import gr.aueb.cf.schoolapp.service.TeacherServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/school-app/teachers/view/teacher")
public class TeacherViewController  extends HttpServlet {
    ITeacherDAO teacherDAO = new TeacherDAOImpl();
//    ITeacherService teacherService = new TeacherServiceImpl(teacherDAO);
//    ICityDAO cityDAO = new CityDAOImpl();
//    ICityService cityService = new CityServiceImpl(cityDAO);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String message = "";
        try {
            Teacher teacher = teacherDAO.getById(id);
            request.setAttribute("teacher", teacher);
            request.getRequestDispatcher("/WEB-INF/jsp/teacher-view.jsp").forward(request, response);
        } catch (TeacherDAOException | ServletException | RuntimeException | IOException e) {
            message = e.getMessage();
            request.setAttribute("message", message);
            request.getRequestDispatcher("/WEB-INF/jsp/teachers.jsp").forward(request, response);
        }
    }
}
