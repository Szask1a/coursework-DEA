<%-- 
    Document   : eroor
    Created on : 22-Aug-2020, 13:06:50
    Author     : Rishxn
--%>

<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>

<%
Connection con=null;
ResultSet rs=null;
PreparedStatement psmt=null;
FileInputStream fis;

try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/website","root","");
File image=new File("image");
psmt=con.prepareStatement("insert into seller(image) values(?)");
fis=new FileInputStream(image);
psmt.setBinaryStream(4, (InputStream)fis, (int)(image.length()));
int s = psmt.executeUpdate();
if(s>0) {
%>
<b><font color="Blue">
<% out.println("Image Uploaded successfully !"); %>
</font></b>
<%
}
else {
out.println("unsucessfull to upload image.");
}
con.close();
psmt.close();
}catch(Exception ex){
out.println("Error in connection : "+ex);
}
%>
