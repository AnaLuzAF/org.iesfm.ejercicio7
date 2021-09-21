package org.iesfm.ejecicio7;

//Realiza un programa que compruebe si se tiene acceso de ejecución y lectura a un fichero(pasado como argumento)
// y después modifique sus atributos denegando estos permisos.

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


import java.io.File;

public class Ejercicio7 {
    private final static Logger log = LoggerFactory.getLogger(Ejercicio7.class);

    public static void main(String[] args) {
        String sFichero = "/home/analuz/Documentos/Ana.txt";
        File f = new File(sFichero);

        if (f.canExecute()){
            log.info("El fichero tiene acceso a ejecucion");
        }else{
            log.error("No tiene acceso");
        }

        if (f.canRead()){
            log.info("El fichero no tiene acceso a lectura");
        }else{
            log.error("No tiene acceso");
        }
    }
}
