

package com.jorge.maven;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletExamen extends HttpServlet {

    
    protected void DoGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Calificacion calificacion;
        calificacion = new Calificacion();
        calificacion.setNombre("Ana, Tu calificacion es 7");
        Evaluacion x=new Evaluacion();
        x.setCalificacion(calificacion);
        request.setAttribute("presentacion", x);
        RequestDispatcher despa=request.getRequestDispatcher("/presentacion.jsp");
        despa.forward(request, response); 
        
        
   
       
        }
    }

    

