/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Day12;

import Model.SinglyLinkedList;
import Model.SinglyLinkedListNode;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author tuong
 */
public class SolutionDay12 extends HttpServlet {

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
    int day = 12;

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
                request.getRequestDispatcher("Day" + day + "/Asgm5.jsp").forward(request, response);
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
        String n = request.getParameter("nums");
        String[] nums = n.split(" ");
        Model.SinglyLinkedList list = new SinglyLinkedList();
        for (String num : nums) {
            list.insertNode(Integer.parseInt(num));
        }
        Model.SinglyLinkedListNode rss = Asgm1.reverse(list.head);
        String rs = Model.SinglyLinkedList.printSinglyLinkedList(rss);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm1.jsp").forward(request, response);
    }

    private void Asgm2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        String[] nums = n1.split(" ");
        Model.SinglyLinkedList list = new SinglyLinkedList();
        for (String num : nums) {
            list.insertNode(Integer.parseInt(num));
        }
        String[] nums2 = n2.split(" ");
        Model.SinglyLinkedList list2 = new SinglyLinkedList();
        for (String num2 : nums2) {
            list2.insertNode(Integer.parseInt(num2));
        }
        Model.SinglyLinkedListNode rss = Asgm2.mergeLists(list.head, list2.head);
        String rs = Model.SinglyLinkedList.printSinglyLinkedList(rss);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm2.jsp").forward(request, response);
    }

    private void Asgm3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nums = request.getParameter("num");
        if (nums.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm3.jsp").forward(request, response);
            return;
        }
        int rs = Asgm3.lastRemaining(Integer.parseInt(nums));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm3.jsp").forward(request, response);
    }

    private void Asgm4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("nums");
        if (num.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm4.jsp").forward(request, response);
            return;
        }
        boolean rs = Asgm4.isPowerOfFour(Integer.parseInt(num));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm4.jsp").forward(request, response);
    }

    private void Asgm5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String word = request.getParameter("nums");
        if (word.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm5.jsp").forward(request, response);
            return;
        }
        String[] words = word.split(" ");
        SinglyLinkedList list = new SinglyLinkedList();
        for (String nums1 : words) {
            list.insertNode(Integer.parseInt(nums1));
        }
        SinglyLinkedListNode rss = Asgm5.swapPairs(list.head);
        String rs = SinglyLinkedList.printSinglyLinkedList(rss);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm5.jsp").forward(request, response);
    }
}
