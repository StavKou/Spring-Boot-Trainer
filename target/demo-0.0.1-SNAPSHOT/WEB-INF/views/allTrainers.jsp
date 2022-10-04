<%-- 
    Document   : AllTrainers
    Created on : Jun 26, 2022, 6:26:50 PM
    Author     : stkou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>All the Trainers:</h1>

        <table border="1" style="border-spacing: 8px;">
            <th><strong>Id</strong></th>
            <th><strong>First Name</strong></th>
            <th><strong>Last Name</strong></th>
            <th><strong>Subject</strong></th>


            <%-- Loop forEach --%>
            <c:forEach items="${trainerlist}" var="trainers">
                <tr>
                    <td><em>${trainers.trid}</em></td>
                    <td><em>${trainers.trainerFname}</em></td>
                    <td><em>${trainers.trainerLname}</em></td>
                    <td><em>${trainers.subject}</em></td>
                    <td><a href="/trainer/delete/${trainers.trid}">Delete</a></td>
                    <td><a href="/trainer/update/${trainers.trid}">Update</a></td>               
                </tr>
            </c:forEach>
                

    </table>
</body>
</html>
