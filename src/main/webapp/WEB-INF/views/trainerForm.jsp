<%-- 
    Document   : trainerForm
    Created on : Jun 26, 2022, 5:29:28 PM
    Author     : stkou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Trainer Form:</h1>

        <form action="trainer/insert" method="post">
            
            First Name <input type="text" name="trainer_fname"></br>
            Last Name <input type="text" name="trainer_lname"></br>
            

            <input type="radio" name="subject" value="java" required>
            <label>Java</label> </br>
            <input type="radio" name="subject" value="html" required>
            <label>Html</label> </br>
            <input type="radio" name="subject" value="javascript" required>
            <label>Javascript</label> </br>
            <input type="radio" name="subject" value="c++" required>
            <label>C++</label> </br>
            <input type="radio" name="subject" value="python" required>
            <label>Python</label> </br>
            <input type="submit" value="insert Trainer" style="color:green">
        </form>
        
    </body>
</html>
