/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Day7;

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
public class SolutionDay7 extends HttpServlet {

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
    int day = 7;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n = request.getParameter("asgm");
        switch (n) {
            case "1":
                request.getRequestDispatcher("Day" + day + "/Asgm1.jsp").forward(request, response);
                break;
            case "2":
                request.getRequestDispatcher("Day" + day + "/Asgm2.jsp").forward(request, response);
                break;
            case "3":
                request.getRequestDispatcher("Day" + day + "/Asgm3.jsp").forward(request, response);
                break;
            case "4":
                request.getRequestDispatcher("Day" + day + "/Asgm4.jsp").forward(request, response);
                break;
            case "5":
                request.getRequestDispatcher("Day" + 6 + "/Asgm3.jsp").forward(request, response);
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
            case "4_1":
                Asgm4_1(request, response);
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
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        if (n1.isBlank() || n2.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm1.jsp").forward(request, response);
        }
        String n11[] = n1.split(" ");
        List<Integer> listn1 = new ArrayList<>();
        for (String n111 : n11) {
            listn1.add(Integer.valueOf(n111));
        }
        List<Integer> rss = Asgm1.rotateLeft(Integer.parseInt(n2), listn1);
        String rs = "";
        for (int i = 0; i < rss.size(); i++) {
            rs += rss.get(i) + " ";
        }
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm1.jsp").forward(request, response);
    }

    private void Asgm2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");
        String n3 = request.getParameter("n3");
        String n4 = request.getParameter("n4");
        String n5 = request.getParameter("n5");
        String n6 = request.getParameter("n6");
        String[] n11 = n1.split(" ");
        String[] n22 = n2.split(" ");
        String[] n33 = n3.split(" ");
        String[] n44 = n4.split(" ");
        String[] n55 = n5.split(" ");
        String[] n66 = n6.split(" ");
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();
        List<Integer> l5 = new ArrayList<>();
        List<Integer> l6 = new ArrayList<>();
        for (int j = 0; j < n11.length; j++) {
            l1.add(Integer.valueOf(n11[j]));
            l2.add(Integer.valueOf(n22[j]));
            l3.add(Integer.valueOf(n33[j]));
            l4.add(Integer.valueOf(n44[j]));
            l5.add(Integer.valueOf(n55[j]));
            l6.add(Integer.valueOf(n66[j]));
        }
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

        int rs = Asgm2.hourglassSum(list);

        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm2.jsp").forward(request, response);
    }

    private void Asgm3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("n");
        if (num.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm3.jsp").forward(request, response);
            return;
        }
        String[] s1 = num.split(" ");
        List<Integer> s11 = new ArrayList<>();

        for (String s12 : s1) {
            s11.add(Integer.valueOf(s12));
        }

        int rs = Asgm3.birthdayCakeCandles(s11);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm3.jsp").forward(request, response);
    }

    private void Asgm4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ch = request.getParameter("n1");
        if (ch.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm4.jsp").forward(request, response);
            return;
        }
        request.setAttribute("size", Integer.valueOf(ch));
        request.getRequestDispatcher("Day" + day + "/Asgm4_1.jsp").forward(request, response);
    }

    private void Asgm4_1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int size = Integer.parseInt(request.getParameter("size"));
        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String rowInput = request.getParameter("n" + i);
            List<Integer> subList = new ArrayList<>();
            if (rowInput != null && !rowInput.trim().isEmpty()) {
                String[] values = rowInput.trim().split("\\s+");
                for (int j = 0; j < size && j < values.length; j++) {
                    subList.add(Integer.valueOf(values[j]));
                }
            }
            matrix.add(subList);
        }
        int rs = Asgm4.diagonalDifference(matrix);

        request.setAttribute("rs", rs);
        request.setAttribute("size", size);
        request.getRequestDispatcher("Day" + day + "/Asgm4_1.jsp").forward(request, response);
    }

    private void Asgm5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Day" + 6 + "/Asgm3.jsp").forward(request, response);
    }
}