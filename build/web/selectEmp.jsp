<%-- 
    Document   : selectEmp
    Created on : Jul 31, 2022, 2:16:41 PM
    Author     : Mohammmed Sami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Select Employee </title>
    </head>
    <body>
        <div>
            <center>



                <font size="3" color="black">
                <div>
                    <table Border="10" Align="center">
                        <form action="${pageContext.request.contextPath}/SelectEmployeeServlet" method="Post">
                            <tr>
                                <td style="font-weight: bold">Enter Id or Name</td>
                                <td><input type="text" name="data" /></td>
                                <td> <input type="submit" name="submit"></td>
                                 
                            </tr>
                           
                        </form>

                    </table>

                    <table style="margin-top: 10px" border="10" Align="center">

                        <form>
                            <thead>
                                <tr>
                                    <th style="font-weight: bold">Employee Id</th>
                                    <th style="font-weight: bold">First Name</th>
                                    <th style="font-weight: bold">Last Name</th>
                                    <th style="font-weight: bold">Position</th>
                                    <th style="font-weight: bold">Salary</th>
                                </tr>
                            </thead>
                            <tbody>

                                
                                <tr >
                                    <th>${E.getEmpId()}</th>
                                    <th><p>${E.getFirstName()}</p></th>
                                    <th><p>${E.getLastName()}</p></th>
                                    <th><p>${E.getPosition()}</p></th>
                                    <th><p>${E.getSalary()}</p></th>
                                </tr>
                            </tbody>
                        </form>
                    </table>
                </div>

                </font>


            </center>



        </div>
    </body>
</html>
