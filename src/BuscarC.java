import java.util.ArrayList;
import java.util.Scanner;

public class BuscarC {
    public static void buscarCandidato(ArrayList<Candidato> listaCandi) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el nombre del candidato desea buscar: ");
            String buscarC = scanner.nextLine();
            boolean esta = false;

            for (Candidato candidato : listaCandi) {
                if (candidato.getNombre().equals(buscarC)) {
                    System.out.println("El candidato es: " + candidato.getNombre() + ", con ID: " + candidato.getId());
                    esta = true;
                    break;
                }
            }

            if (!esta) {
                System.out.println("Ese candidato no está en la lista.");
            }
        }
    }
}

