<%-- 
    Document   : Menu
    Created on : Sep 25, 2024, 8:22:42 PM
    Author     : tuong
--%>

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
        <div id="myNav" class="overlay">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            <div class="overlay-content">
                <a href="#">About</a>
                <a href="#">Services</a>
                <a href="#">Clients</a>
                <a href="#">Contact</a>
            </div>
        </div>

        <!-- Nút để ẩn/hiện menu -->
        <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Menu</span>

        <div class="split resizable">
            <!-- Left Pane: Problem Description -->
            <div class="left-pane">
                <h3>Đề bài</h3>
                <p>
                    Viết một hàm để tính tổng của hai số nguyên. Hàm sẽ nhận vào hai đối số và trả về tổng của chúng.
                </p>
                <h5>Input</h5>
                <ul>
                    <li>Số nguyên a</li>
                    <li>Số nguyên b</li>
                </ul>
                <h5>Output</h5>
                <p>Tổng của hai số nguyên a và b.</p>
                <h5>Ví dụ</h5>
                <pre>
            Input: a = 3, b = 5
            Output: 8
                </pre>
            </div>


            <!-- Right Pane: Code Input and Test Cases -->
            <div class="right-pane">
                <!--                <h3>Nhập code của bạn</h3>
                                <textarea class="code-area" placeholder="Viết code của bạn ở đây..."></textarea>-->

                <h4 class="mt-4">Test Cases</h4>
                <form>
                    <div class="mb-3">
                        <label for="inputA" class="form-label">Số nguyên a</label>
                        <input type="number" class="form-control" id="inputA" placeholder="Nhập số a">
                    </div>
                    <div class="mb-3">
                        <label for="inputB" class="form-label">Số nguyên b</label>
                        <input type="number" class="form-control" id="inputB" placeholder="Nhập số b">
                    </div>
                    <button type="button" class="btn btn-primary">Chạy</button>
                </form>

                <div class="mt-4">
                    <h5>Kết quả:</h5>
                    <div class="alert alert-secondary" role="alert">
                        Chưa có kết quả
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
