<%@ page import="bmc.shapes.*" %>
<!-- cwd ma bmc folder banena vane Rectangle.java lai jdk/bin ma lagera compile garne  -->

<%!
    Rectangle r = new Rectangle(5,10); 
%>

<%
    out.println(r.getArea());
%>