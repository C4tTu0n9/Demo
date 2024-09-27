/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.Day9;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author tuong
 */
public class SolutionDay9 extends HttpServlet {

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
    int day = 9;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n = request.getParameter("asgm");
        switch (n) {
            case "1":
                request.getRequestDispatcher("Day" + day + "/Asgm1.jsp").forward(request, response);
                break;
            case "2":
                HttpSession s = request.getSession();
                s.removeAttribute("phoneBook");
                request.getRequestDispatcher("Day" + day + "/Asgm2.jsp").forward(request, response);
                break;
            case "3":
                c = 0;
                setNameAsgm3 = new HashSet<>();
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
            case "2_1":
                Asgm2_1(request, response);
                break;
            case "2_2":
                Asgm2_2(request, response);
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
        String q = request.getParameter("query");
        List<Integer> l = new ArrayList<>();
        String[] ns = n.split(" ");
        for (String n1 : ns) {
            l.add(Integer.valueOf(n1));
        }
        String rs = Asgm1.myStringQuery(l, Integer.parseInt(q));
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm1.jsp").forward(request, response);
    }

    private void Asgm2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String size = request.getParameter("size");
        request.setAttribute("size", size);
        request.getRequestDispatcher("Day" + day + "/Asgm2_1.jsp").forward(request, response);
    }

    private void Asgm2_1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int size = Integer.parseInt(request.getParameter("size"));

        List<String> names = new ArrayList<>();
        List<String> nums = new ArrayList<>();
        Map<String, String> phoneBook = new HashMap<String, String>();
        for (int i = 0; i < size; i++) {
            String name = request.getParameter("name" + i);
            String phone = request.getParameter("num" + i);
            phoneBook.put(name, phone);
        }
        HttpSession session = request.getSession();
        session.setAttribute("phoneBook", phoneBook);
        request.getRequestDispatcher("Day" + day + "/Asgm2_2.jsp").forward(request, response);
    }

    private void Asgm2_2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        String rs = "";
        Map<String, String> phoneBook = (Map<String, String>) session.getAttribute("phoneBook");
        if (phoneBook.containsKey(name)) {
            rs = name + "=" + phoneBook.get(name);
        } else {
            rs = "Not found";
        }
        session.setAttribute("phoneBook", phoneBook);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm2_2.jsp").forward(request, response);
    }

    static int c = 0;
    Set<String> setNameAsgm3 = new HashSet<>();

    private void Asgm3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("n");
        if (name.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm3.jsp").forward(request, response);
            return;
        }

        if (!setNameAsgm3.contains(name)) {
            setNameAsgm3.add(name);
            c = c + 1;
        } else {
        }
        request.setAttribute("rs", c);
        request.getRequestDispatcher("Day" + day + "/Asgm3.jsp").forward(request, response);
    }

    private void Asgm4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ch = request.getParameter("num");
        if (ch.isBlank()) {
            request.setAttribute("rs", 0);
            request.getRequestDispatcher("Day" + day + "/Asgm4.jsp").forward(request, response);
            return;
        }
        int rs = Asgm4.romanToInt(ch);
        request.setAttribute("rs", rs);
        request.getRequestDispatcher("Day" + day + "/Asgm4.jsp").forward(request, response);
    }


    private void Asgm5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s1 = request.getParameter("n1");
        String s2 = request.getParameter("n2");

        String[] myPut = s2.split(" ");
        int choose = Integer.parseInt(s1);
        switch (choose) {
            case 1:
                Asgm5.put(Integer.parseInt(myPut[0]), Integer.parseInt(myPut[1]));
                break;
            case 2:
                List<String> rss = Asgm5.get(Integer.parseInt(myPut[0])-1);
                request.setAttribute("rs", rss);
                request.getRequestDispatcher("Day" + day + "/Asgm5.jsp").forward(request, response);
                return;
            case 3:
                Asgm5.remove(Integer.parseInt(myPut[0]));
                break;
            default:
                throw new AssertionError();
        }
        List<String> rsss = Asgm5.myList();
        request.setAttribute("rs", rsss);
        request.getRequestDispatcher("Day" + day + "/Asgm5.jsp").forward(request, response);
    }
}
