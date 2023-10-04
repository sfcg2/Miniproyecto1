import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListicaC {

    private List<Candidato> listaCandidatos;

    public ListicaC() {
        listaCandidatos = new ArrayList<>();
    }

    public void agregarCandidato(Candidato candidato) {
        listaCandidatos.add(candidato);
    }

    public void eliminarCandidato(int id) {
        Iterator<Candidato> iterator = listaCandidatos.iterator();
        while (iterator.hasNext()) {
            Candidato candidato = iterator.next();
            if (candidato.getId() == id) {
                iterator.remove();
                System.out.println("Candidato con ID " + id + " eliminado.");
                return;
            }
        }
        System.out.println("No se encontró ningún candidato con el ID " + id + ".");
    }

    public void mostrarCandidatos() {
        System.out.println("Lista de candidatos:");
        for (Candidato candidato : listaCandidatos) {
            System.out.println(candidato);
        }
    }

    public static void main(String[] args) {
        ListicaC lista = new ListicaC();
        lista.agregarCandidato(new Candidato(1, "John"));
        lista.agregarCandidato(new Candidato(2, "Doe"));
        lista.agregarCandidato(new Candidato(3, "Alice"));
        lista.mostrarCandidatos();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el ID del candidato que deseas eliminar: ");
        int idEliminar = scanner.nextInt();
        scanner.nextLine(); // Limpiar el tin

        lista.eliminarCandidato(idEliminar);
        lista.mostrarCandidatos();

        scanner.close(); // se cierra el scanner pa que funcione bien porque hay varios scanner
    }
}



