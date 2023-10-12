import java.util.ArrayList;
import java.util.Scanner;

public class Votar {

    public void votar() {
        ArrayList<Candidato> listaCandidatos = Insertar.getInscritos();

        System.out.println("Número de candidatos inscritos: " + listaCandidatos.size());

        for (int i = 0; i < listaCandidatos.size(); i++) {
            System.out.println("\nCANDIDATO #" + (i + 1));
            System.out.println(listaCandidatos.get(i));
        }

        boolean candidatoEncontrado = false;
        try (Scanner scanner = new Scanner(System.in)) {
            while (!candidatoEncontrado) {
                System.out.print("\nIngrese la cédula del candidato que desea votar: ");
                String cedulaABuscar = scanner.nextLine();

                for (int i = 0; i < listaCandidatos.size(); i++) {
                    if (cedulaABuscar.equalsIgnoreCase(listaCandidatos.get(i).getCedula())) {
                        candidatoEncontrado = true;
                        System.out.println("\nCANDIDATO #" + (i + 1));
                        System.out.println(listaCandidatos.get(i));
                        break;
                    }
                }

                if (!candidatoEncontrado) {
                    System.out.println("\nCandidato no encontrado. Intente nuevamente.");
                }
            }
        }
    }

    public void VotosTotales() {
        ArrayList<Candidato> listaCandidatos = Insertar.getInscritos();

        System.out.println("Votos para cada candidato:");

        for (Candidato candidato : listaCandidatos) {
            System.out.println("Candidato: " + candidato.getNombre() + ", Votos: " + candidato.getVotos());
        }
    }
}


