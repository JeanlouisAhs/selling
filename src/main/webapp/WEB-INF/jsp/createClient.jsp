<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Person List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<%--	  <script src="https://cdn.tailwindcss.com"></script>--%>
  </head>
  <body>
    <h3>Enregistrement d'un client</h3>
   	
   	<div class="container">
   		<form:form method="post" action="/client/save" modelAttribute="client">

	  <div class="form-group">
	    <form:label path="raisonSocial">Raison Social</form:label>
	    <form:input type="text" path="raisonSocial" />

	  </div>

	<div class="form-group">
	    <form:label path="ifu">Numéro Ifu</form:label>
	    <form:input type="number" path="ifu" />
	    
	  </div>

	  <div class="form-group">
	    <form:label path="adresse">Adresse</form:label>
	    <form:input path="adresse" />
	  </div>

	  <form:button>Submit</form:button>

	</form:form>
   	</div>
   	

  </body>
 
</html>