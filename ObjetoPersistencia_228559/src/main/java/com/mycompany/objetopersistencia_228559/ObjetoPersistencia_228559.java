package com.mycompany.objetopersistencia_228559;

import com.mycompany.objetopersistencia_228559.CustomExceptions.Exceptions;

/**
 *
 * @author Castheum
 */

public class ObjetoPersistencia_228559 {
    public static void main(String[] args) throws Exceptions, Exception {
        MaterialMaps mapas = new MaterialMaps();
        mapas.newMaterial("Llave1", "titulo", "D", "PDF", 1);
        mapas.newMaterial("Llave2", "titulo", "F", "IMP", 1);
        
    }
}
