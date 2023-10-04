
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candidato extends Ciudadano {
    private String ideologiaP;
    private String partidoP;
    private List<String> promesas;

    public Candidato(String nombre, String cedula, String ciudad, String ideologiaP, String partidoP) {
        super(nombre, cedula, ciudad);
        this.ideologiaP = ideologiaP;
        this.partidoP= partidoP;
        this.promesas = new ArrayList<>();
    }

    public static Candidato insertarC() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nombre del candidato: ");
            String nombre = scanner.nextLine();

            System.out.print("Cédula del candidato: ");
            String cedula = scanner.nextLine();

            System.out.print("Ciudad de origen del candidato: ");
            String ciudadOrigen = scanner.nextLine();

            System.out.print("Posición política del candidato: ");
            String posicionPolitica = scanner.nextLine();

            System.out.print("Partido político del candidato: ");
            String partidoPolitico = scanner.nextLine();

            return new Candidato(nombre, cedula, ciudadOrigen, posicionPolitica, partidoPolitico);
        }
    }

    // Métodos para añadir, obtener y mostrar promesas esto lo saque de int no se no me pregunte
    public void addPromesa(String promesa) {
        this.promesas.add(promesa);
    }

    public List<String> getPromesas() {
        return promesas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPosición política='" + ideologiaP +
                ", Partido político='" + partidoP + '\'' +
                ", Promesas de campaña=" + promesas;
    }
}
