<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "0");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Teacher</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/teacher-view.css">
</head>
<body>
<%@ include file="header.jsp"%>

        <div class="container">
            <h1>Στοιχεία Καθηγητή</h1>
            <div class="d-flex">
                <div>
<form method="GET" action="${pageContext.request.contextPath}/school-app/view/teacher?id=}">

                    <p><strong>Όνομα: </strong><span value="${requestScope.teacher.firstname}"> </span></p><br>
                    <p><strong>ΑΦΜ: </strong>152896542</p><br>
                    <p><strong>Αριθμός τηλεφώνου: </strong>6951557599</p><br>
                    <p><strong>Οδός: </strong>Διοχαρους</p><br>
                    <p><strong>ΤΚ: </strong>11528</p><br>
                </div>
                <div>
                    <p><strong>Επώνυμο: </strong>Περιστερη</p><br>
                    <p><strong>Όνομα Πατρός: </strong>Ιωαννης</p><br>
                    <p><strong>Email: </strong>eva@aueb.gr</p><br>
                    <p><strong>Αριθμός: </strong>12</p><br>
                    <p><strong>Πόλη: </strong>Αθήνα</p><br>
                </div>
            </div>
            <div class="d-flex">
                <button class="btn-size">
                    <a class="btn" href="${pageContext.request.contextPath}/school-app/teachers/view">Επιστροφή</a>
                </button>

                <button class="btn-size">
                    <a class="btn" href="${pageContext.request.contextPath}/school-app/teachers/update?id=${teacher.id}">Ενημέρωση</a>
                </button>
            </div>
        </div>


<%@ include file="footer.jsp"%>
</body>
</html>