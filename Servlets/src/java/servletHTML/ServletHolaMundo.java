 //Primer   Servlet.
//Muy   sencillo.
package servletHTML;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet(name = "ServletHolaMundo", urlPatterns = {"/ServletHolaMundo"})
public class ServletHolaMundo extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = new PrintWriter(res.getOutputStream());
        out.println("<html>");
        out.println("<head>\n" +
"        <meta charset=\"utf-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <meta name=\"description\" content=\"\">\n" +
"    <meta name=\"author\" content=\"\">\n" +
"    <link rel=\"shortcut icon\" href=\"ico/favicon.png\">\n" +
"        <title>Hola mundo Servlet</title>\n" +
"        \n" +
"       <!-- Bootstrap core CSS -->\n" +
"        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n" +
"\n" +
"        <!-- Custom styles for this template -->\n" +
"        <link href=\"css/main.css\" rel=\"stylesheet\">\n" +
"	<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n" +
"\n" +
"        <script src=\"js/jquery.min.js\"></script>\n" +
"	<script src=\"js/Chart.js\"></script>\n" +
"	<script src=\"js/modernizr.custom.js\"></script>\n" +
"        \n" +
"    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic' rel='stylesheet' type='text/css'>\n" +
"    <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,700' rel='stylesheet' type='text/css'></head>");
        out.println("<body>");
        out.println("<h1><center>Hola   Mundo   desde   el   servidor WEB</center></h1>");
        out.println("</body></html>");
        out.close();
    }

    public String getServletInfo() {
        return "Crea   una   página   HTML   que   dice   HolaMundo";
    }
}
