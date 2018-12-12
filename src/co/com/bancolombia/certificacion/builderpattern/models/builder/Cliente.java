package co.com.bancolombia.certificacion.builderpattern.models.builder;

public class Cliente {
  private final String nombre;
  private final String apellido;
  private final Direccion direccion;

  private Cliente(Builder builder) {
    this.nombre = builder.nombre;
    this.apellido = builder.apellido;
    this.direccion = builder.direccion;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public Direccion getDireccion() {
    return direccion;
  }

  @Override
  public String toString() {
    return "Cliente{" +
            "nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", direccion=" + direccion +
            '}';
  }

  public static class Builder {
    private String nombre;
    private String apellido;
    private Direccion direccion;

    public Builder nombre(final String nombre) {
      this.nombre = nombre;
      return this;
    }

    public Builder apellido(final String apellido) {
      this.apellido = apellido;
      return this;
    }

    public Builder direccion(final Direccion direccion) {
      this.direccion = direccion;
      return this;
    }

    public Cliente build() {
      return new Cliente(this);

    }

  }

}
