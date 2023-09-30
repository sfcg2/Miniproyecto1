public abstract class Ciudadano {

    private String nombre;
    private String cedula;
    private CiudadOrigen ciudad;

    public Ciudadano(String nombre,String cedula, CiudadOrigen ciudad){
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudad = ciudad;
    }
    public abstract void Nombre(String nombre); 
    public abstract void Cedula(String cedula);
    public abstract void Ciudad(CiudadOrigen ciudad);
  
}
