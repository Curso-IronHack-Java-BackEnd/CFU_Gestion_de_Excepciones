package org.example;

public class StringConverter {

// 1a PARTE DEL EJERCICIO (EXCEPCIONES)
//    public int convertToInt(String cadena) {
//        try{
//            int cadenaToInt = Integer.parseInt(cadena);
//            return cadenaToInt;
//        } catch (NumberFormatException e){
//            System.err.println("Error en metodo: La cadena de texto tiene que tener formato numero entero");
//            return 0;
//        }
//    }


// 2a PARTE DEL EJERCICIO REFACTORIZANDO EL CODIGO (THROWS)
    public int convertToInt(String cadena) throws NumberFormatException{
        int cadenaToInt = Integer.parseInt(cadena);
        return cadenaToInt;
    }
}
