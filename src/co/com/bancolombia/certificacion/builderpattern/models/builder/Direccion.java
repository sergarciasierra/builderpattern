package co.com.bancolombia.certificacion.builderpattern.models.builder;

public class Direccion {
  private final String dir;
  private final String ciudad;

  public Direccion(Builder builder){
    this.dir = builder.dir;
    this.ciudad = builder.ciudad;
  }

  public String getDir() {
    return dir;
  }

  public String getCiudad() {
    return ciudad;
  }

  @Override
  public String toString() {
    return "Direccion{" +
            "dir='" + dir + '\'' +
            ", ciudad='" + ciudad + '\'' +
            '}';
  }

  public static class Builder{
    private String dir;
    private String ciudad;

    public Builder dir(final String dir){
      this.dir = dir;
      return this;
    }

    public Builder ciudad(final String ciudad){
      this.ciudad = ciudad;
      return this;
    }

    public Direccion build(){
      return new Direccion(this);
    }

  }

}
