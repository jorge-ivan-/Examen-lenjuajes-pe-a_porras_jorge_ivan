/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jorge.maven;

/**
 *
 * @author T107
 */

import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/servicio-usuario")
public class Controlador {
    
    @RequestMapping(value="/todos", method=RequestMethod.GET,headers={"Accept=text/html"})
    public @ResponseBody String buscarTodos(){
        String mensaje="La calificacion es";
        return mensaje;
        
    }
    @RequestMapping(value="/usuario", method=RequestMethod.GET,headers={"Accept=Application/json"})
    @ResponseBody ArrayList<Calificacion> mijason(){
        
        ObjectMapper mapeadorjson=new ObjectMapper();
        return GeneradorCalificaciones.ggg();
    }
}