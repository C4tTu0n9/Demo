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
                <div hidden="">${i=11}</div>
                <img src="images/Day${i}/A2.1.png" alt="alt"/>
                <img src="images/Day${i}/A2.2.png" alt="alt"/>
                <img src="images/Day${i}/A2.3.png" alt="alt"/>
            </div>


            <!-- Right Pane: Code Input and Test Cases -->
            <div class="right-pane">
                <!--                <h3>Nhập code của bạn</h3>
                                <textarea class="code-area" placeholder="Viết code của bạn ở đây..."></textarea>-->

                <h4 class="mt-4">Test Case</h4>
                <form action="SolutionDay${i}?asgm=2" method="post">
                    <div class="mb-3">
                        <label for="inputA" class="form-label">Input string: </label>
                        <input name="size" type="text" class="form-control" id="inputA" placeholder="Bai nay khoai qua em chua nghi ra cach code tren web">
                    </div>
                    <button type="" class="btn btn-primary">Run test case</button>
                </form>

                <div class="">
                    <h5>Code cua em day a: </h5>
                    <p>
                            public static void main(String[] args) {
	var scanner = new Scanner(System.in);
	int queries = Integer.parseInt(scanner.nextLine().trim());
	var dStack = new MyDoubleStack();
	for (int i = 0; i < queries; i++) {
		String nextLine = scanner.nextLine();
		String[] fields = nextLine.split(" ");
		int query = Integer.parseInt(fields[0]);
		switch (query) {
			case 1 -> {
				int value = Integer.parseInt(fields[1]);
				dStack.enqueue(value);
			}
			case 2 -> {
				dStack.dequeue();
			}
			default -> {
				System.out.println(dStack.peek());
			}
		}
	}
}

static class MyDoubleStack {
	private final Stack<Integer> left = new Stack<>();
	private final Stack<Integer> right = new Stack<>();

	void enqueue(int data) {
		left.push(data);
	}

	Integer dequeue() {
		if (right.isEmpty()) {
			while (!left.isEmpty()) {
				right.push(left.pop());
			}
		}
		return right.pop();
	}

	Integer peek() {
		if (right.isEmpty()) {
			while (!left.isEmpty()) {
				right.push(left.pop());
			}
		}
		return right.peek();
	}
}
                                </p>
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
