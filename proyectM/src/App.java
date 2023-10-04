import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ListicaC lista = new ListicaC();  // Corregido el nombre de la clase

        lista.agregarCandidato(new Candidato(123, "yessenia"));
        lista.agregarCandidato(new Candidato(234, "yeison"));
        lista.agregarCandidato(new Candidato(345, "tomate"));
        lista.mostrarCandidatos();  // Corregido el nombre del método

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el ID del mentiroso que deseas eliminar: ");
        int idEliminar = scanner.nextInt();
        scanner.nextLine();

        lista.eliminarCandidato(idEliminar);  // Corregido el nombre del método
        lista.mostrarCandidatos();

        scanner.close();
    }
}


