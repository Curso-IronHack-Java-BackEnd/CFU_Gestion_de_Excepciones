package org.example;

public class Main {
    public static void main( String[] args ){
        String firstName = "Jhon";
        String lastName = "Doe";
        System.out.println(concat("Juan", "Rodriguez"));

        try{
            System.out.println(concat("", "Rodriguez"));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(concat("Juan", null));
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

        try{
            System.out.println(concat("Pedro", "Sainz"));
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

    }
    public static String concat(String firstName, String lastName) throws IllegalArgumentException {
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Nombres y apellidos no pueden ser nulos ni estar vacios");
        }
        return firstName+" "+lastName;
    }
}
