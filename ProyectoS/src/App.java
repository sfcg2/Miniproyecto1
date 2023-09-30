import java.util.Scanner;

public class App {
    
    static Candidato candidato = new Candidato();
    static Scanner scanner = new Scanner(System.in);
    
    public static void insertar(){

        candidato.setNombre();
        candidato.setCedula();
        candidato.setCiudad();   
        boolean validacion = false;
        
        CiudadOrigen[] co = CiudadOrigen.values();
        
        for(int i=0; i<co.length;i++){
            if(candidato.getCiudad().equals(co[i].toString())){
                validacion = true;
                System.out.println("hola");
            }
        }if(validacion == false){
                System.out.println("Valido solo para ciudades del Valle del Cauca");
                insertar();
            }
    }

    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        //Menu    
        
    
        System.out.println( "                         - - - - E L E C C I O N E S - - - - \n");

        int opcion;
        do{
            System.out.println("\n1. Insertar Candidato");
            System.out.println("2. Actualizar Candidato");
            System.out.println("3. Eliminar Candidato");
            System.out.println("4. Buscar Candidato");
            System.out.println("5. Lista de Candidatos\n");

            System.out.print("Para incribir/modificar un candidato elija una opcion: ");
            opcion = scanner.nextInt();
            System.out.println();
            
        
            switch (opcion) {

                case 1: insertar();break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                default:
                    System.out.println("Opcion No Valida");
                    break;
            }
        }while(opcion!=0);
    }

    

    
}