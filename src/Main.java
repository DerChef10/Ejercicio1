import Clases.Persona;

public class Main {
    public static void main(String[] args) {
        /*
        crear una clase persona que tengan los siguientes atributos:nombre, apellido, edad, ocupacion, fecha de nacimiento
        imprimir por pantalla los valores de la primera persona...con salto de linea y titulos
        luego sumar las edades y calcular el promedio. ambos numeros tienen que salir en pantalla (la suma y el promedio)
         */

        Persona persona1=new Persona("Valeria","Caballero",20.00,"Hija","10-09-2002");
        int edadEnEntero=(int)Math.round(persona1.getEdad());

        Persona persona2=new Persona("Cristopher","Caballero",8.00,"Hijo","10-09-2014");
        int edadEnEnteroPersona2=(int)Math.round(persona2.getEdad());




        System.out.println("Nombre: "+persona1.getNombre()+" \nApellido: "+persona1.getApellido()+" " +
                " \nEdad: "+edadEnEntero +" \nOcupacion: "+persona1.getOcupacion()+" \nFecha de Nacimiento: "+persona1.getFechaDeNacimiento());

        System.out.println("--------------------------------");

        System.out.println("Nombre: "+persona2.getNombre()+" \nApellido: "+persona2.getApellido()+" " + " \nEdad: " +
                ""+edadEnEnteroPersona2 +" \nOcupacion: "+persona2.getOcupacion()+" \nFecha de Nacimiento: "+persona2.getFechaDeNacimiento());

        System.out.println("----------------Suma De Las Edades-----------------");

        double suma = persona1.getEdad() + persona2.getEdad();
        System.out.println(Math.round(suma));

        System.out.println("----------------PROMEDIO-----------------");

        double promedio = suma / 2;
        System.out.println(suma / 2);


    }
}