/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Day11;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import model.DoublyLinkedList;
import model.DoublyLinkedListNode;

/**
 *
 * @author tuong
 */
public class SolutionDay11 extends HttpServlet {

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
    int day = 11;

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
        String n = request.getParameter("str");

        int rs = Asgm1.sherlockAndAnagrams(n);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm1.jsp").forward(request, response);
    }

    private void Asgm2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String size = request.getParameter("size");
//        int rs = Asgm2.stringConstruction(size);
//        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm2.jsp").forward(request, response);
    }

    private void Asgm3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nums = request.getParameter("nums");
        String n = request.getParameter("n");
        if (nums.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm3.jsp").forward(request, response);
            return;
        }
        String[] numss = nums.split(" ");
        DoublyLinkedList list = new DoublyLinkedList();
        for (String nums1 : numss) {
            list.insertNode(Integer.parseInt(nums1));
        }
        DoublyLinkedListNode rss = Asgm3.sortedInsert(list.head, Integer.parseInt(n));
        String rs = DoublyLinkedList.printList(rss);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm3.jsp").forward(request, response);
    }

    private void Asgm4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("nums");
        String loop = request.getParameter("loop");
        String[] nums = num.split(" ");
        if (num.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm4.jsp").forward(request, response);
            return;
        }
        List<Integer> listNum = new ArrayList<>();
        for (String num1 : nums) {
            listNum.add(Integer.valueOf(num1));
        }
        List<Integer> rs = Asgm4.waiter(listNum, Integer.parseInt(loop));
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
        DoublyLinkedList list = new DoublyLinkedList();
        for (String nums1 : words) {
            list.insertNode(Integer.parseInt(nums1));
        }
        DoublyLinkedListNode rss = Asgm5.reverse(list.head);
        String rs = DoublyLinkedList.printList(rss);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm5.jsp").forward(request, response);
    }
}
