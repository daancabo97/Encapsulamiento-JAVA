
package test;

import dominio.Carro;

public class CarroPrueba {
    public static void main(String[] args) {
        Carro carro1 = new Carro(3.0, "mazda", "rojo", 4 );
        System.out.println("marca de carro = " + carro1.getMarca());
        carro1.setMarca("Fiat");
        //
        System.out.println("Marca de carro cambiada = " + carro1.getMarca());
        System.out.println("------------------------------------------");
        System.out.println("color de carro = " + carro1.getColor());
        System.out.println("cilindros de carro = " + carro1.getCilindros());
        System.out.println("motor de carro = " + carro1.getMotor());
    }
    
}
