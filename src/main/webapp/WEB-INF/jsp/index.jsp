<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">	
	<h1>Please add the feedback</h1>
	<form action="formSubmission" method="post">
	<table>		
		<tr>			
			<td>Comment: </td>
			<td><input type="text" name="feedback" value=${feedback}></td>									
		</tr>
		<tr>
			<td>Product: </td>
			<td><SELECT size=1 name='product'>
				<OPTION value=""></OPTION>
				<OPTION value="Wet Shaver">Wet Shaver</OPTION>
				<OPTION value="Dry Shaver">Dry Shaver</OPTION>
				<OPTION value="Trimmer">Trimmer</OPTION>
				<OPTION value="Ear Phones">Ear Phones</OPTION>
				<OPTION value="TV">TV</OPTION>
				<OPTION value="Freeze">Freeze</OPTION>
			</SELECT>				
			</td>
		</tr>
		<tr>
			<td>Source: </td>
			<td><SELECT size=1 name='source'>
				<OPTION value=""></OPTION>
				<OPTION value="Amazon">Amazon</OPTION>
				<OPTION value="Flip Kart">Flip Kart</OPTION>
				<OPTION value="Chroma">Chroma</OPTION>
				<OPTION value="EBay">EBay</OPTION>
				<OPTION value="Alibaba">Alibaba</OPTION>
				<OPTION value="Jio">Jio</OPTION>
				<OPTION value="Others">Others</OPTION>
			</SELECT>
			</td>			
		</tr>				
	</table><br>
	<span style="color:red">${errorMessages}</span><br/>	
	<table>							
		<tr>
			<input type="submit" value="Submit"/>			
		</tr>		
	</table>
	</form>
	</div>

</body>
</html>