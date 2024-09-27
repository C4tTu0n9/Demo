<%-- 
    Document   : Asgm1
    Created on : Sep 26, 2024, 10:41:15 AM
    Author     : tuong
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Code Challenge Interface</title>
        <!-- Link Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/mystyle.css"/>
    </head>
    <body>


        <!-- Nút để ẩn/hiện menu -->
        <a href="home" class="link-light link-offset-2 link-underline-opacity-25" style="font-size:30px;cursor:pointer" onclick="openNav()">Menu</a>

        <div class="split resizable">
            <!-- Left Pane: Problem Description -->
            <div class="left-pane">
                <div hidden="">${i=12}</div>
                <img src="images/Day${i}/A2.1.png" alt="alt"/>
                <img src="images/Day${i}/A2.2.png" alt="alt"/>
            </div>


            <!-- Right Pane: Code Input and Test Cases -->
            <div class="right-pane">
                <!--                <h3>Nhập code của bạn</h3>
                                <textarea class="code-area" placeholder="Viết code của bạn ở đây..."></textarea>-->

                <h4 class="mt-4">Test Case</h4>
                <form action="SolutionDay${i}?asgm=2" method="post">
                    <div class="mb-3">
                        <label for="inputA" class="form-label">Input numbers in linked list 1 (spaced-separate): </label>
                        <input name="num1" type="text" class="form-control" id="inputA" placeholder="Ex: 1 3 7">
                    </div>
                    <div class="mb-3">
                        <label for="inputA" class="form-label">Input numbers in linked list 2 (spaced-separate): </label>
                        <input name="num2" type="text" class="form-control" id="inputA" placeholder="Ex: 1 2">
                    </div>
                    <button type="" class="btn btn-primary">Run test case</button>
                </form>

                <div class="mt-4">
                    <h5>Result:</h5>
                    <div class="alert alert-secondary" role="alert">
                        <p>${rs}</p>
                    </div>
                </div>
            </div>
        </div>

        <!-- Link Bootstrap JS (Optional) -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
        <script>
// Toggle thanh menu ẩn hiện
document.getElementById('menu-toggle').onclick = function () {
var menu = document.getElementById('menu');
if (menu.style.left === '0px') {
menu.style.left = '-250px';
} else {
menu.style.left = '0px';
}
};

        </script>

        <script>
            function openNav() {
                document.getElementById("myNav").style.width = "20%";
            }

            function closeNav() {
                document.getElementById("myNav").style.width = "0%";
            }
        </script>
    </body>
</html>
