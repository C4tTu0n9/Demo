/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Day13;

import Model.MyTree;
import Model.Node;
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
public class SolutionDay13 extends HttpServlet {

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
            out.println("<title>Servlet SolutionDay13</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SolutionDay13 at " + request.getContextPath() + "</h1>");
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
                request.getRequestDispatcher("Day13/Asgm1.jsp").forward(request, response);
                break;
            case "2":
                request.getRequestDispatcher("Day13/Asgm2.jsp").forward(request, response);
                break;
            case "3":
                request.getRequestDispatcher("Day13/Asgm3.jsp").forward(request, response);
                break;
            case "4":
                request.getRequestDispatcher("Day13/Asgm4.jsp").forward(request, response);
                break;
            case "5":
                request.getRequestDispatcher("Day13/Asgm5.jsp").forward(request, response);
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
                day13Asgm1(request, response);
                break;
            case "2":
                day13Asgm2(request, response);
                break;
            case "3":
                day13Asgm3(request, response);
                break;
            case "4":
                day13Asgm4(request, response);
                break;
            case "5":
                day13Asgm5(request, response);
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

    private void day13Asgm1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nodes = request.getParameter("nodes");
        String[] a = nodes.split(" ");
        Node root = null;
        for (int i = 0; i < a.length; i++) {
            root = MyTree.insert(root, Integer.parseInt(a[i]));
        }
        int rs = Asgm1.height(root);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day13/Asgm1.jsp").forward(request, response);
    }

    private void day13Asgm2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nodes = request.getParameter("nodes");
        String[] a = nodes.split(" ");
        Node root = null;
        for (int i = 0; i < a.length; i++) {
            root = MyTree.insert(root, Integer.parseInt(a[i]));
        }
        List<Integer> rs = Asgm2.levelOrder(root);
        String rss = "";
        for (int i = 0; i < rs.size() - 1; i++) {
            rss += rs.get(i) + "->";
        }
        rss += rs.get(rs.size() - 1);
        request.setAttribute("rs", rss);
        request.getRequestDispatcher("Day13/Asgm2.jsp").forward(request, response);
    }

    private void day13Asgm3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nodes = request.getParameter("nodes");
        String v1 = request.getParameter("v1");
        String v2 = request.getParameter("v2");
        String[] a = nodes.split(" ");
        Node root = null;
        for (int i = 0; i < a.length; i++) {
            root = MyTree.insert(root, Integer.parseInt(a[i]));
        }
        int rs = Asgm3.lca(root, Integer.parseInt(v1), Integer.parseInt(v2)).data;
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day13/Asgm3.jsp").forward(request, response);
    }

    private void day13Asgm4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nodes = request.getParameter("nodes");
        String[] a = nodes.split(" ");
        Node root = null;
        for (int i = 0; i < a.length; i++) {
            root = MyTree.insert(root, Integer.parseInt(a[i]));
        }
        List<String> rs = Asgm4.binaryTreePaths(root);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day13/Asgm4.jsp").forward(request, response);
    }

    private void day13Asgm5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nodes = request.getParameter("nodes");
        String[] a = nodes.split(" ");
        Node root = null;
        for (int i = 0; i < a.length; i++) {
            root = MyTree.insert(root, Integer.parseInt(a[i]));
        }
        Asgm5.recoverTree(root);
        List<Integer> rss = Asgm2.levelOrder(root);
        StringBuilder rs = new StringBuilder();
        for(int i = 0; i< rss.size()-1; i++){
            rs.append(rss.get(i)).append("->");
        }
        rs.append(rss.get(rss.size()-1));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day13/Asgm5.jsp").forward(request, response);
    }

}
