/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author PROFESOR
 */

@WebServlet("/registro")
public class Registro extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String[] tecnologias = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String profesion = request.getParameter("profesion");
        String[] musicas = request.getParameterValues("musica");
        String comentario = request.getParameter("comentarios");
        
        
        // Incluimos la respuesta al cliente
        
        PrintWriter out = response.getWriter();
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title> Resultado del servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parámetros procesados por el Servlet:</h1>");
        out.print("<table border='1'>");
        
        out.print("<tr>");
            out.print("<td>");
            out.print("Usuario");
            out.print("</td>");
            out.print("<td>");
            out.print(usuario);
            out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
            out.print("<td>");
            out.print("Password");
            out.print("</td>");
            out.print("<td>");
            out.print(password);
            out.print("</td>");
        out.print("</tr>");  
        
        out.print("<tr>");
            out.print("<td>");
            out.print("Tecnologías");
            out.print("</td>");
            out.print("<td>");
            for(String tecnologia: tecnologias){
                out.print(tecnologia);
                out.print(" / ");
            }
            out.print("</td>");
        out.print("</tr>");        

        out.print("<tr>");
            out.print("<td>");
            out.print("Genero");
            out.print("</td>");
            out.print("<td>");
            out.print(genero);
            out.print("</td>");
        out.print("</tr>");  

        out.print("<tr>");
            out.print("<td>");
            out.print("Profesión");
            out.print("</td>");
            out.print("<td>");
            out.print(profesion);
            out.print("</td>");
        out.print("</tr>");  
 
        out.print("<tr>");
            out.print("<td>");
            out.print("Música favorita");
            out.print("</td>");
            out.print("<td>");
            for(String musica: musicas){
                out.print(musica);
                out.print(" / ");
            }
            out.print("</td>");
        out.print("</tr>");        

        out.print("<tr>");
            out.print("<td>");
            out.print("Comentarios");
            out.print("</td>");
            out.print("<td>");
            out.print(comentario);
            out.print("</td>");
        out.print("</tr>"); 
        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
        
        out.close();
        
    }
    
}
