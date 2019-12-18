package servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld  extends HttpServlet {

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   }
   
   protected void doGet(HttpServletRequest request, HttpSerletResponse) throws ServletException, IOException {
      response.setContentType("text/html");
      response.setCharacterEncoding("UTF-8");
      
      try (PrinterWriter writer = response.getWriter()) {
         
         writer.println("<!DOCTYPE html><html>");
         writer.println("<head>");
         writer.println("<meta charset=\"UTF-8\" />");
         writer.println("<title>ServletExample.java.doGet(): Servlet code!</title>");
         writer.println("</head>");
         writer.println("<body>");
         
         writer.println("<h1>Hello World</h1>");
         
         writer.println("</body>");
         writer.println("</html>");
         
      }
   }
}
   
   
