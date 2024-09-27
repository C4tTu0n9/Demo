/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Day3;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class SolutionDay3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SolutionDay2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SolutionDay2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n = request.getParameter("asgm");
        switch (n) {
            case "1":
                request.getRequestDispatcher("Day3/Asgm1.jsp").forward(request, response);
                break;
            case "2":
                request.getRequestDispatcher("Day3/Asgm2.jsp").forward(request, response);
                break;
            case "3":
                request.getRequestDispatcher("Day3/Asgm3.jsp").forward(request, response);
                break;
            case "4":
                request.getRequestDispatcher("Day3/Asgm4.jsp").forward(request, response);
                break;
            case "5":
                request.getRequestDispatcher("Day3/Asgm5.jsp").forward(request, response);
                break;
            default:
                throw new AssertionError();
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n = request.getParameter("asgm");
        switch (n) {
            case "1":
                Asgm1(request, response);
                break;
            case "2":
                Asgm2(request, response);
                break;
            case "3":
                Asgm3(request, response);
                break;
            case "4":
                Asgm4(request, response);
                break;
            case "5":
                Asgm5(request, response);
                break;
            default:
                throw new AssertionError();
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void Asgm1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String c = request.getParameter("num");
        String rs = Asgm1.myCheck(Integer.parseInt(c));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day3/Asgm1.jsp").forward(request, response);
    }

    private void Asgm2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String c = request.getParameter("num");
        int rs = Asgm2.handshake(Integer.parseInt(c));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day2/Asgm2.jsp").forward(request, response);
    }

    private void Asgm3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("num");
        String rs = Asgm3.solve(Integer.parseInt(num));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day2/Asgm3.jsp").forward(request, response);
    }

    private void Asgm4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String c = request.getParameter("num");
        long rs = Asgm4.summingSeries(Integer.parseInt(c));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day2/Asgm4.jsp").forward(request, response);
    }

    private void Asgm5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String c = request.getParameter("nums");
        String[] a = c.split(" ");
        List<Integer> n = new ArrayList<>();
        for (String a1 : a) {
            n.add(Integer.valueOf(a1));
        }
        List<Integer> rs = Asgm5.solve(n);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day2/Asgm5.jsp").forward(request, response);
    }

}
