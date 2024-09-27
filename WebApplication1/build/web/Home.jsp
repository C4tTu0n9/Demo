<%-- 
    Document   : Home
    Created on : Sep 25, 2024, 10:20:26 PM
    Author     : tuong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/mystyle.css"/>
    </head>
    <body>
        <div class="binder">
            <br>
            <h2>DSA Assignments</h2>
        </div>
        <button class="accordion">Day 1</button>
        <div class="panel">
            <p><a href="SolutionDay1?asgm=1" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    1. Area Under Curves and Volume of Revolving a Curve
                </a></p>
            <p><a href="SolutionDay1?asgm=2" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    2. String Reductions
                </a></p>
            <p><a href="SolutionDay1?asgm=3" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    3. Super Digit
                </a></p>
            <p><a href="SolutionDay1?asgm=4" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    4. Pascals Triangle
                </a></p>
            <p><a href="SolutionDay1?asgm=5" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    5. Sequence Full Of Colors
                </a></p>

        </div>

        <button class="accordion">Day 2</button>
        <div class="panel">
            <p><a href="SolutionDay2?asgm=1" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    1. Strange Grid Again
                </a></p>
            <p><a href="SolutionDay2?asgm=2" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    2. Handshake
                </a></p>
            <p><a href="SolutionDay2?asgm=3" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    3. Special Multiple
                </a></p>
            <p><a href="SolutionDay2?asgm=4" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    4. Summing the N series
                </a></p>
            <p><a href="SolutionDay2?asgm=5" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    5. Bus Station
                </a></p>
        </div>

        <button class="accordion">Day 3</button>
        <div class="panel">
            <p><a href="SolutionDay3?asgm=1" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    1. Java If-Else
                </a></p>
            <p><a href="SolutionDay3?asgm=2" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    2. Java Loops II
                </a></p>
            <p><a href="SolutionDay3?asgm=3" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    3. Java Loops I
                </a></p>
            <p><a href="SolutionDay3?asgm=4" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    4. Java Substring
                </a></p>
            <p><a href="SolutionDay3?asgm=5" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    5. Java String Reverse
                </a></p>        
        </div>

        <button class="accordion">Day 4</button>
        <div class="panel">
            <p></p>
        </div>

        <button class="accordion">Day 5</button>
        <div class="panel">
            <p></p>
        </div>

        <button class="accordion">Day 6</button>
        <div class="panel">
            <p></p>
        </div>
        <button class="accordion">Day 7</button>
        <div class="panel">
            <p></p>
        </div>
        <button class="accordion">Day 8</button>
        <div class="panel">
            <p></p>
        </div>
        <button class="accordion">Day 9</button>
        <div class="panel">
            <p></p>
        </div>
        <button class="accordion">Day 10</button>
        <div class="panel">
            <p></p>
        </div>
        <button class="accordion">Day 11</button>
        <div class="panel">
            <p></p>
        </div>
        <button class="accordion">Day 12</button>
        <div class="panel">
            <p></p>
        </div>
        <button class="accordion">Day 13</button>
        <div class="panel">
            <p><a href="SolutionDay13?asgm=1" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    1. Tree: Height of a Binary Tree
                </a></p>
            <p><a href="SolutionDay13?asgm=2" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    2. Tree: Level Order Traversal
                </a></p>
            <p><a href="SolutionDay13?asgm=3" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    3. Binary Search Tree : Lowest Common Ancestor
                </a></p>
            <p><a href="SolutionDay13?asgm=4" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    4. Binary Tree Paths
                </a></p>
            <p><a href="SolutionDay13?asgm=5" class="link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">
                    5. Recover Binary Search Tree
                </a></p>
        </div>
        <script>
            var acc = document.getElementsByClassName("accordion");
            var i;

            for (i = 0; i < acc.length; i++) {
                acc[i].addEventListener("click", function () {
                    this.classList.toggle("active");
                    var panel = this.nextElementSibling;
                    if (panel.style.display === "block") {
                        panel.style.display = "none";
                    } else {
                        panel.style.display = "block";
                    }
                });
            }
        </script>

    </body>
</html>
