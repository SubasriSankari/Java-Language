<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script>
	function read(){
		
		var xmlHttp = new XMLHttpRequest();
		/*if(window.XMLHttpRequest)
		{
			xmlHttp = new XMLHttpRequest();
		}
		else
		{
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}*/
		
		xmlHttp.onreadystatechange = function(){
			if(xmlHttp.readyState == 4)
			{
				document.getElementById("result").innerHTML = xmlHttp.responseText;
			}
		}
		xmlHttp.open("GET", "hello.txt", true);
		xmlHttp.send();
	}
</script>

<title>Read from File</title>
</head>
<body>
	<input type="button" value = "click to read.." onclick="read()"><br>
	<div id="result">Result...</div>
</body>
</html>