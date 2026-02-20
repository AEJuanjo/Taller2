package Taller2;

import java.security.Policy;

public class Variables {
    public static void main(String[] args) {
        
        int edad = 18;
        double estatura = 1.70;
        float peso = 65f;
        short codigoPostal = 050001;
        int poblacionCiudad = 1500000;
        long areaColombia = 1141748L;
        byte temperaturaMinima = -12;
        int temperaturaMax = 45;
        float precioProducto = 19999.99f;
        double pi = 3.1415926535;
        float saldoCuenta = 150000.50f;
        double promedioNotas = 4.3;
        char inicialNombre = 'J';
        char simboloMoneda = '$';
        boolean esMayorEdad = true;
        boolean tienePlata = false;
        String nombreCompleto = "Juan Andres";
        String materia = "Lógica de programación";
        String emailUsuario = "juanandres190507@gmail.com";
        String universidad = "UPB";
        double nota = 4.5;


        //Reasignación
        inicialNombre = simboloMoneda;
        nota = promedioNotas;
        nombreCompleto = emailUsuario;
        temperaturaMax = temperaturaMinima;

        //Hard coded
        pi = promedioNotas;
        edad = 18;
        estatura = 1.80;
        peso = 62f;
        codigoPostal = 050016;
        poblacionCiudad = 4500000;
        areaColombia = 65400000;
        precioProducto = 150000;
        saldoCuenta = 85000.03f;
        esMayorEdad = false;
        tienePlata = true;
        materia = "Cálculo";
        universidad = "ITM";
        nota = 3.8;
    }
}
