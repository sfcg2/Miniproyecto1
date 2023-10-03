import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListicaC {

    private List<Ciudadano> listaCiudadanos;

    public ListicaC() {
        listaCiudadanos = new ArrayList<>();
    }

    public void agregarCiudadano(Ciudadano persona) {
        listaCiudadanos.add(persona);
    }

    public void eliminarPersonaPorId(int id) {
        Iterator<Ciudadano> iterator = listaCiudadanos.iterator();
        while (iterator.hasNext()) {
            Ciudadano persona = iterator.next();
            if (persona.getId() == id) {
                iterator.remove(); // Elimina la persona
                System.out.println("Persona con ID " + id + " eliminada.");
                return; 
            }
        }
        System.out.println("No se encontró ninguna persona con ID " + id + ".");
    }

    public void agregarPersona(Ciudadano ciudadano) {
    }

}

