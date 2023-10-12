import java.util.ArrayList;
import java.util.Scanner;

class Votar {

    public void votar() {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Candidato> listaCandidatos = Insertar.getInscritos();

            System.out.println("Número de candidatos inscritos: " + listaCandidatos.size());

            for (int i = 0; i < listaCandidatos.size(); i++) {
                System.out.println("\nCANDIDATO #" + (i + 1));
                System.out.println(listaCandidatos.get(i));
            }

            boolean candidatoEncontrado = false;

            while (!candidatoEncontrado) {
                System.out.print("\nIngrese la posición del candidato que desea votar: ");
                int posicionCandidato = scanner.nextInt();

                if (posicionCandidato > 0 && posicionCandidato <= listaCandidatos.size()) {
                    candidatoEncontrado = true;
                    listaCandidatos.get(posicionCandidato - 1).sumarVotos();
                    System.out.println("Voto registrado para el candidato " + listaCandidatos.get(posicionCandidato - 1).getNombre());
                } else {
                    System.out.println("Posición de candidato no válida. Intente nuevamente.");
                }
            }
        }
    }

    public void VotosTotales() {
        ArrayList<Candidato> listaCandidatos = Insertar.getInscritos();

        System.out.println("Votos para cada candidato:");

        int maxVotos = Integer.MIN_VALUE;
        Candidato candidatoMasVotado = null;

        for (Candidato candidato : listaCandidatos) {
            System.out.println("Candidato: " + candidato.getNombre() + ", Votos: " + candidato.getVotos());
            if (candidato.getVotos() > maxVotos) {
                maxVotos = candidato.getVotos();
                candidatoMasVotado = candidato;
            }
        }

        if (candidatoMasVotado != null) {
            System.out.println("Candidato más votado: " + candidatoMasVotado.getNombre() + " con " + maxVotos + " votos.");
        } else {
            System.out.println("No hay candidatos registrados o no se han registrado votos.");
        }
    }
}
