<!-- first set env files;JAVA_HOME:jdk/bin & JRE_HOME:jdk -->
<!-- create project folder inside Tcat/bin/webapps/PROJECT -->
<!-- create a.jsp file: open with vscode -->
<!-- run server: goto Tcat/bin -->
<!-- open cmd -->
<!-- write: startup -->
<h1>Hello</h1>

<% 
    int a = 5;
    int b = 10;
    int c = 12;

    c= a+b;
    out.println(c);
%>

<!-- proper way -->
<%!
    int a =5;
    int b =5;
    int c;

%>

<% c= a+b; %>

<!-- output dekhauna chai direct variable ko naam dine -->
<p>    
    <%= c %>
</p>

<%-- comment lekhne tarika --%>