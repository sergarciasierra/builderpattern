package co.com.bancolombia.certificacion.builderpattern.main;

import co.com.bancolombia.certificacion.builderpattern.models.builder.*;

public class Main {

  public static void main(String[] args) {
    Cliente c1;
        c1 = new Cliente.Builder()
                .nombre("Sergio")
                .apellido("Garcia")
                .direccion(new Direccion.Builder()
                            .dir("Calle 2")
                            .ciudad("Envigado")
                            .build())
                .build();

    System.out.println(c1);
  }
}
