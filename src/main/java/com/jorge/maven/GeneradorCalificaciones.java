

package com.jorge.maven;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class GeneradorCalificaciones {

    static ArrayList<Calificacion> ggg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public static ArrayList<Calificacion> ggg(){
        ArrayList<Calificacion> us=new ArrayList<Calificacion>();
        Evaluacion u1=new Evaluacion("Petra","58");
          Evaluacion u2=new Evaluacion("José","74");
            Evaluacion u3=new Evaluacion("Roberta","86");
        
        us.add(u1);
        us.add(u3);
        us.add(u2);
        return us;
    
}
}
