<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Registration</title>
            <style>
                .error {
                    color: #ff0000;
                }

                .errorblock {
                    color: 000;
                    background-color: #ffeeee;
                    border: 3px solid #ff0000;
                    padding: 8px;
                    margin: 16px;
                }
            </style>
        </head>

        <body>

            <h1>Registration</h1>
            <form:form modelAttribute="registration">
                <form:errors path="*" cssClass="errorblock" element="div" />
                <table>
                    <tr>
                        <td>
                            <spring:message code="name" />
                        </td>
                        <td>
                            <form:input path="name" />
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Add Registration">
                        </td>
                    </tr>
                </table>
            </form:form>

        </body>

</html>