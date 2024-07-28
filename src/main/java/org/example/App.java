package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringConverter convert = new StringConverter();
        try{
            int result = convert.convertToInt("234");
            System.out.println(result);
        }catch(NumberFormatException e){
            System.out.println("Error en llamada: La cadena de texto tiene que tener formato numero entero");
        }

        try{
            int result = convert.convertToInt("Hola");
            System.out.println(result);
        }catch(NumberFormatException e){
            System.out.println("Error en llamada: La cadena de texto tiene que tener formato numero entero");
        }

    }
}
