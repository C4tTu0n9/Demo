/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Day6;

import Model.SinglyLinkedList;
import Model.SinglyLinkedListNode;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class SolutionDay6 extends HttpServlet {

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
    int day = 6;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n = request.getParameter("asgm");
        int day = 6;
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
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        if (n1.isBlank() || n2.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm1.jsp").forward(request, response);
        }
        String n11[] = n1.split(" ");
        String n22[] = n2.split(" ");

        SinglyLinkedList head1 = new SinglyLinkedList();
        SinglyLinkedList head2 = new SinglyLinkedList();

        for (int i = 0; i < n11.length; i++) {
            head1.insertNode(Integer.parseInt(n11[i]));
        }
        for (int i = 0; i < n22.length; i++) {
            head2.insertNode(Integer.parseInt(n22[i]));
        }
        SinglyLinkedListNode rss = Asgm1.mergeLists(head1.head, head2.head);
        String rs = "";
        while (rss != null) {
            if (rss.next == null) {
                rs += rss.data + "";
                break;
            }
            rs += rss.data + " ->";
            rss = rss.next;
        }
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm1.jsp").forward(request, response);
    }

    private void Asgm2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("a");
        String[] aa = a.split(" ");
        SinglyLinkedList list = new SinglyLinkedList();

        for (int i = 0; i < aa.length; i++) {
            list.insertNode(Integer.parseInt(aa[i]));
        }
        SinglyLinkedListNode rss = Asgm2.removeDuplicates(list.head);
        String rs = "";
        while (rss != null) {
            if (rss.next == null) {
                rs += rss.data + "";
                break;
            }
            rs += rss.data + " ->";
            rss = rss.next;
        }
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm2.jsp").forward(request, response);
    }

    private void Asgm3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("str1");
        String num1 = request.getParameter("str2");
        if (num.isBlank() || num1.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm3.jsp").forward(request, response);
            return;
        }
        String[] s1 = num.split(" ");
        String[] s2 = num1.split(" ");
        List<String> s11 = new ArrayList<>();
        List<String> s22 = new ArrayList<>();

        for (int i = 0; i < s1.length; i++) {
            s11.add(s1[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            s22.add(s2[i]);
        }

        List<Integer> rs = Asgm3.matchingStrings(s11, s22);
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
        String[] aa = ch.split(" ");
        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 0; i < aa.length; i++) {
            list.insertNode(Integer.parseInt(aa[i]));
        }

        boolean rs = Asgm4.hasCycle(list.head);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm4.jsp").forward(request, response);
    }

    private void Asgm5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");
        HttpSession session = request.getSession();
        String oldStr = (String) session.getAttribute("oldStr") == null ? "" : (String) session.getAttribute("oldStr");
        if (n1.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm5.jsp").forward(request, response);
        }
        String rs = Asgm5.myChoice(oldStr, Integer.parseInt(n1), n2);
        request.setAttribute("rs", rs);
        session.setAttribute("oldStr", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm5.jsp").forward(request, response);
    }
}
