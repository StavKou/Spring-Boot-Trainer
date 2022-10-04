<%-- 
    Document   : updateTrainer
    Created on : Jun 30, 2022, 9:57:20 PM
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
        <h1>Update Form:</h1>
        
        <form action="/trainer/update" method="post">
            
            <input type="hidden" name="trid" value="${updatetrainer.trid}">
            <label>FirstName </label>
            <input type="text" name="trainer_fname" value="${updatetrainer.trainerFname}" required> 
            <label>LastName </label>
            <input type="text" name="trainer_lname" value="${updatetrainer.trainerLname}" required> 

            
            <label>Subject</label><br>
            <input type="radio"name="subject" value="java">
            <label>Java</label> </br>
            <input type="radio"name="subject" value="html">
            <label>Html</label> </br>
            <input type="radio"name="subject" value="javascript">
            <label>Javascript</label> </br>
            <input type="radio" name="subject" value="c++">
            <label>C++</label> </br>
            <input type="radio" name="subject" value="python">
            <label>Python</label> </br>
            <input type="submit">

        </form>
    </body>
</html>
