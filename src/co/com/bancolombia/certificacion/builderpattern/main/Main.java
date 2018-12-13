package co.com.bancolombia.certificacion.builderpattern.main;

import co.com.bancolombia.certificacion.builderpattern.models.builder.*;

public class Main {

  public static void main(String[] args) {
    Cliente cliente1 = new Cliente.Builder()
                                  .nombre("Sergio")
                                  .apellido("Garcia")
                                  .direccion(new Direccion.Builder()
                                          .dir("Calle 2")
                                          .ciudad("Envigado")
                                          .build())
                                  .build();

    System.out.println("Primer cliente:\n" + cliente1);

    Direccion dir= new Direccion.Builder()
                                .dir("Calle 28")
                                .ciudad("Medellin")
                                .build();
    Cliente cliente2 = new Cliente.Builder()
            .nombre("Juan")
            .direccion(dir)
            .build();
    System.out.printf("Segundo cliente:\n" + cliente2);
  }
}
