public class Ciudadano {

    private int id;
    private String nombre;

    public Ciudadano(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ciudadano{id=" + id + ", nombre='" + nombre + "'}";
    }
    
}
