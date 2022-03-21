<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Person List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
  <body>
    <h3>Liste des clients</h3>
   	<table class="table table-stripped">
   		<thead class="table-info">
	   		<tr>
	   			<th>ID</th>
	   			<th>Raison Sociale</th>
	   			<th>Numéro Ifu</th>
	   			<th>Adresse </th>
	   			<th>Nombre de Livraison</th>
	   		</tr>
   		</thead>
   		
   		<tbody>
   			<c:forEach  items="${clients}" var ="clients">
	   			<tr>
	   				<td>${clients.id}</td>
	   				<td>${clients.raisonSocial}</td>
	   				<td>${clients.ifu}</td>
					<td>${clients.adresse}</td>
	   				<td>${fn:length(clients.livraisons)}</td>
	   			</tr>
   			
   			</c:forEach>
   		
   		</tbody>
   	
   	</table>
    <br/><br/>
    <div>
      
    </div>
  </body>
 
</html>