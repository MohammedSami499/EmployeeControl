<%-- 
    Document   : updateEmployee
    Created on : Jul 24, 2022, 7:13:51 AM
    Author     : Mohammmed Sami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Employee</title>
    </head>
    <body>
        <div>



            <center>
                <font size="5" color="${color}">
                <p> ${message}</p>
                </font>
                <font size="3" color="black">

                <div>
                    <table Border="10" Align="center">
                        <tr><th>Please Insert Your Data To Be Updated</th></tr>
                    </table>

                    <table style="margin-top: 10px" border="10" Align="center">

                        <form action="${pageContext.request.contextPath}/UpdateEmployeeServlet" method="Post">
                            <tbody>
                                <tr>
                                    <td style="font-weight: bold">Employee Id</td>
                                    <td> <input type="text" name="id" /></td>
                                </tr>
                                <tr >
                                    <td style="font-weight: bold">First Name </td>
                                    <td><input type="text" name="first" /></td>
                                </tr>
                                <tr>
                                    <td style="font-weight: bold">Last Name </td>
                                    <td><input type="text" name="last" /></td>
                                </tr>
                                <tr>
                                    <td style="font-weight: bold">Position </td>
                                    <td><input type="text" name="position" /></td>
                                </tr>
                                <tr>
                                    <td style="font-weight: bold">Salary </td>
                                    <td><input type="text" name="salary" /></td>
                                </tr>

                                <tr align="center" >
                                    <td align="center" ><button type="submit">Update</button></td>
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
