package Clases;

public class Persona {


    String nombre;
    String apellido;
    Double edad;
    String ocupacion;
    String fechaDeNacimiento;

    public Persona(String nombre, String apellido, Double edad, String ocupacion, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Double getEdad() {
        return edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}
//crear una clase persona que tengan los siguientes atributos:nombre, apellido, edad, ocupacion, fecha de nacimiento
//luego sumar las edades y calcular el promedio. ambos numeros tienen que salir en pantalla (la suma y el promedio)
