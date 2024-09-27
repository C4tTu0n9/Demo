/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Day5;

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
public class SolutionDay5 extends HttpServlet {

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
                request.getRequestDispatcher("Day5/Asgm1.jsp").forward(request, response);
                break;
            case "2":
                request.getRequestDispatcher("Day5/Asgm2.jsp").forward(request, response);
                break;
            case "3":
                request.getRequestDispatcher("Day5/Asgm3.jsp").forward(request, response);
                break;
            case "4":
                request.getRequestDispatcher("Day5/Asgm4.jsp").forward(request, response);
                break;
            case "5":
                request.getRequestDispatcher("Day5/Asgm5.jsp").forward(request, response);
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
        String rs = Asgm1.mySolve(c);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day5/Asgm1.jsp").forward(request, response);
    }

    private void Asgm2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("a");
        if (a.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day5/Asgm2.jsp").forward(request, response);
            return;
        }
        String[] as = a.split(" ");
        List<Long> arr = new ArrayList<>();
        for (int i = 0; i < as.length; i++) {
            arr.add(Long.parseLong(as[i]));
        }
        long rs = Asgm2.aVeryBigSum(arr);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day5/Asgm2.jsp").forward(request, response);
    }

    private void Asgm3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("str1");
        String num1 = request.getParameter("str2");
        if (num.isBlank() || num1.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day5/Asgm3.jsp").forward(request, response);
            return;
        }
        String[] n1 = num.split(" ");
        String[] n2 = num1.split(" ");
        List<Integer> r = new ArrayList<>();
        List<Integer> p = new ArrayList<>();

        for (int i = 0; i < n1.length; i++) {
            r.add(Integer.parseInt(n1[i]));
        }
        for (int i = 0; i < n2.length; i++) {
            p.add(Integer.parseInt(n2[i]));
        }
        List<Integer> rs = Asgm3.climbingLeaderboard(r, p);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day5/Asgm3.jsp").forward(request, response);
    }

    private void Asgm4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ch = request.getParameter("n1");
        String n = request.getParameter("n2");
        if (ch.isBlank() || n.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day5/Asgm4.jsp").forward(request, response);
            return;
        }
        String rs = Asgm4.myCheck(Integer.parseInt(ch), Integer.parseInt(n));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day5/Asgm4.jsp").forward(request, response);
    }

    private void Asgm5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");
        String n3 = request.getParameter("n3");
        if (n1.isBlank() || n2.isBlank() || n3.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day5/Asgm5.jsp").forward(request, response);

        }
        List<Integer> nn1 = new ArrayList<>();
        String[] n11 = n1.split(" ");
        for (int i = 0; i < n11.length; i++) {
            nn1.add(Integer.parseInt(n11[i]));
        }
        String rs = Asgm5.bonAppetit(nn1, Integer.parseInt(n2), Integer.parseInt(n3));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day5/Asgm5.jsp").forward(request, response);
    }

}
