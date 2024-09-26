/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Day1;

import static controller.Day1.Asgm1.A;
import static controller.Day1.Asgm1.V;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author tuong
 */
public class SolutionDay1 extends HttpServlet {

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
            out.println("<title>Servlet SolutionDay1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SolutionDay1 at " + request.getContextPath() + "</h1>");
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
                request.getRequestDispatcher("Day1/Asgm1.jsp").forward(request, response);
                break;
            case "2":
                request.getRequestDispatcher("Day1/Asgm2.jsp").forward(request, response);
                break;
            case "3":
                request.getRequestDispatcher("Day1/Asgm3.jsp").forward(request, response);
                break;
            case "4":
                request.getRequestDispatcher("Day1/Asgm4.jsp").forward(request, response);
                break;
            case "5":
                request.getRequestDispatcher("Day1/Asgm5.jsp").forward(request, response);
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
                day1Asgm1(request, response);
                break;
            case "2":
                day1Asgm2(request, response);
                break;
            case "3":
                day1Asgm3(request, response);
                break;
            case "4":
                day1Asgm4(request, response);
                break;
            case "5":
                day1Asgm5(request, response);
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

    private void day1Asgm1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String coef = request.getParameter("a");
        String exp = request.getParameter("b");
        String lim = request.getParameter("limits");

        String[] coefs = coef.split(" ");
        String[] exps = exp.split(" ");
        String[] lims = lim.split(" ");

        int[] coefss = new int[coefs.length];
        int[] expss = new int[exps.length];
        int[] limss = new int[lims.length];

        for (int i = 0; i < coefs.length; i++) {
            coefss[i] = Integer.parseInt(coefs[i]);
        }

        for (int i = 0; i < exps.length; i++) {
            expss[i] = Integer.parseInt(exps[i]);
        }

        for (int i = 0; i < lims.length; i++) {
            limss[i] = Integer.parseInt(lims[i]);
        }

        int[][] arr = {coefss, expss, limss};

        double S = ((double) Math.round(A(arr) * 100) / 100);
        double V = ((double) Math.round(V(arr) * 100) / 100);

        request.setAttribute("S", S);
        request.setAttribute("V", V);
        request.getRequestDispatcher("Day1/Asgm1.jsp").forward(request, response);
    }

    private void day1Asgm2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = request.getParameter("str");
        s = Asgm2.a(s);
        request.setAttribute("rs", s);
        request.getRequestDispatcher("Day1/Asgm2.jsp").forward(request, response);
    }

    private void day1Asgm3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("num");
        String rep = request.getParameter("rep");
        int rs = Asgm3.myNum(Integer.parseInt(num), Integer.parseInt(rep));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day1/Asgm3.jsp").forward(request, response);
    }

    private void day1Asgm4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("num");
        List<String> rs = Asgm4.myPascalTriangle(Integer.parseInt(num));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day1/Asgm4.jsp").forward(request, response);
    }

    private void day1Asgm5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("num");
        boolean c = Asgm5.isFullOfColors(num);
        request.setAttribute("rs", c);
        request.getRequestDispatcher("Day1/Asgm5.jsp").forward(request, response);
    }

}
