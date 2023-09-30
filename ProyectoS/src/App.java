import java.util.Scanner;

public class App {
    
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        //Menu    
        Candidato candidato;
    
        System.out.println( "                         - - - - E L E C C I O N E S - - - - \n");
        System.out.println("1. Insertar Candidato\n2. Actualizar Candidato\n3. Eliminar Candidato\n4. Buscar Candidato\n5. Lista de Candidatos\n");
        System.out.print("Para incribir/modificar un candidato elija una opcion: ");
        int opc = scanner.nextInt();
        
        switch (opc) {
            case 1: //llamar las fucniones
            break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            default:
                System.out.println("Numero No Valido");
                break;
        }
    }

    Scanner scanner = new Scanner(System.in);

    public void insertar(){

            System.out.print("Nombre: ");
            String opc1 = scanner.nextLine();

            System.out.print("Cedula: ");
            String opc2 = scanner.nextLine();

            System.out.print("Ciudad de origen: ");
            String opc3 = scanner.nextLine();

            
    }
}