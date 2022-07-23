<%-- 
    Document   : insert
    Created on : Jul 23, 2022, 8:37:43 PM
    Author     : Mohammmed Sami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Employee</title>
    </head>
    <body>
        <div>
            
            <form action="${pageContext.request.contextPath}/InsertEmployee" method="Post">

                <center>
                    <font size="5" color="${color}">
                    <p> ${message}</p>
                    </font>
                    <font size="3" color="blue">
                        <h2>Please Insert Your Data Here</h2>
                        <div>
                            First Name <input type="text" name="first" /><br/>
                            Last Name <input type="text" name="last" /><br/>
                            Position <input type="text" name="position" /><br/>
                            Salary <input type="text" name="salary" /><br/>
                            <button type="submit">Add</button>
                        </div>
                    
                    </font>
                    
                    
                </center>
                
            </form>
            
        </div>
    </body>
</html>
