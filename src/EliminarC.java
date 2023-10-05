import java.util.Iterator;
import java.util.Scanner;

public class EliminarC {

    public EliminarC() {
    }

    public void eliminarCandidatoPorCedula() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cédula del candidato que desea eliminar: ");
            String cedula = scanner.nextLine();

            Iterator<Candidato> iterator = InsertarC.listaCandidatos.iterator();
            while (iterator.hasNext()) {
                Candidato candidato = iterator.next();
                if (candidato.getId().equals(cedula)) {
                    iterator.remove();
                    System.out.println("Candidato con cédula " + cedula + " eliminado.");
                    return;
                }
            }
            System.out.println("No se encontró ningún candidato con la cédula " + cedula + ".");
        }
    }

    public void mostrarCandidatos() {
        System.out.println("Lista de candidatos:");
        for (Candidato candidato : InsertarC.listaCandidatos) {
            System.out.println(candidato);
        }
    }
}




