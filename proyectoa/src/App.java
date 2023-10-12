import java.util.Scanner;

public class App {

    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try (Scanner scanner = new Scanner(System.in)) {


            //Menu    
            
            System.out.println( "                         - - - - E L E C C I O N E S - - - - \n");

            int opcion;
            do{
                System.out.println("\nINDICACIONES");
                System.out.println("-> Ingresar cedula sin puntos");
                System.out.println("-> Si tiene mas de una promesa de campana, favor de ingresarlas juntas separadas con coma");
                System.out.println("\n1. Insertar Candidato");
                System.out.println("2. Actualizar Candidato");
                System.out.println("3. Eliminar Candidato");
                System.out.println("4. Buscar Candidato");
                System.out.println("5. Lista de Candidatos");
                System.out.println("6. Votar");
                System.out.println("7. ver votos totales");
                System.out.println("0. No seguir haciendo CRUD");

                System.out.print("candidato elija una opcion: ");
                opcion = scanner.nextInt();
                System.out.println();

                Insertar obj1 = new Insertar();
                Actualizar obj2 = new Actualizar();
                Eliminar obj3 = new Eliminar();
                Buscar obj4 = new Buscar();
                ListaCandidatos obj5 = new ListaCandidatos();
                Votar obj6  = new Votar();
                PMasC obj7 = new PMasC();
                Ciudadestop3 obj8 = new Ciudadestop3();

                switch (opcion) {

                    case 1: obj1.insertar();break;
                    case 2: obj2.actualizar();break;
                    case 3: obj3.eliminar();break;
                    case 4: obj4.buscar();break;
                    case 5: obj5.listaCandidatos();break;
                    case 6: obj6.votar();break;
                    case 7: obj6.VotosTotales();break;
                    
                    case 0: obj7.pMasC();obj8.ciudadestop3();break;

                    default:
                        System.out.println("Opcion No Valida");
                        break;
                }
            }while(opcion!=0);
        }
    }
}
    