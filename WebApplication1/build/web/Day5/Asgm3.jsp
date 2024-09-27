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
                <img src="images/Day5/A3.1.png" alt="alt"/>
                <img src="images/Day5/A3.2.png" alt="alt"/>
                <img src="images/Day5/A3.3.png" alt="alt"/>
                <img src="images/Day5/A3.4.png" alt="alt"/>
                <img src="images/Day5/A3.4.png" alt="alt"/>
                <img src="images/Day5/A3.4.png" alt="alt"/>
                <img src="images/Day5/A3.4.png" alt="alt"/>
                <img src="images/Day5/A3.4.png" alt="alt"/>
            </div>


            <!-- Right Pane: Code Input and Test Cases -->
            <div class="right-pane">
                <!--                <h3>Nhập code của bạn</h3>
                                <textarea class="code-area" placeholder="Viết code của bạn ở đây..."></textarea>-->

                <h4 class="mt-4">Test Case</h4>
                <form action="SolutionDay5?asgm=3" method="post">
                    <div class="mb-3">
                        <label for="inputA" class="form-label">Input array ranked: </label>
                        <input name="str1" type="text" class="form-control" id="inputA" placeholder="Contains n space-separated integers. Ex: 100 100 50 40 40 20 10">
                    </div>
                    <div class="mb-3">
                        <label for="inputA" class="form-label">Input array player: </label>
                        <input name="str2" type="text" class="form-control" id="inputA" placeholder="Contains m space-separated integers. Ex: 5 25 50 120">
                    </div>
                    <button type="submit" class="btn btn-primary">Run test case</button>
                </form>

                <div class="mt-4">
                    <h5>Result:</h5>
                    <div class="alert alert-secondary" role="alert">
                        <c:forEach items="${rs}" var="n">
                            <p>${n}</p>
                        </c:forEach>
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
