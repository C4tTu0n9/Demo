/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Day4;

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
public class SolutionDay4 extends HttpServlet {

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
                request.getRequestDispatcher("Day4/Asgm1.jsp").forward(request, response);
                break;
            case "2":
                request.getRequestDispatcher("Day4/Asgm2.jsp").forward(request, response);
                break;
            case "3":
                request.getRequestDispatcher("Day4/Asgm3.jsp").forward(request, response);
                break;
            case "4":
                request.getRequestDispatcher("Day4/Asgm4.jsp").forward(request, response);
                break;
            case "5":
                request.getRequestDispatcher("Day4/Asgm5.jsp").forward(request, response);
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
        int rs = Asgm1.camelcase(c);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day4/Asgm1.jsp").forward(request, response);
    }

    private void Asgm2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("a");
        if (a.isBlank()) {
            int rs = 0;
            request.setAttribute("rs", rs);
            request.getRequestDispatcher("Day4/Asgm2.jsp").forward(request, response);
            return;
        }
        String[] ss = a.split(" ");
        List<Integer> ii = new ArrayList<>();
        for (int i = 0; i < ss.length; i++) {
            ii.add(Integer.parseInt(ss[i]));
        }
        int rs = Asgm2.simpleArraySum(ii);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day4/Asgm2.jsp").forward(request, response);
    }

    private void Asgm3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("str1");
        String num1 = request.getParameter("str2");
        boolean rs = Asgm3.isAnagram(num, num1);
        request.setAttribute("rs", rs?"Anagrams":"Not Anagrams");
        request.getRequestDispatcher("Day4/Asgm3.jsp").forward(request, response);
    }

    private void Asgm4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = request.getParameter("n");
        String[] rs = Asgm4.staircase(Integer.parseInt(str));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day4/Asgm4.jsp").forward(request, response);
    }

    private void Asgm5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String c = request.getParameter("n");
        String rs = Asgm5.solve(c);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day4/Asgm5.jsp").forward(request, response);
    }

}
