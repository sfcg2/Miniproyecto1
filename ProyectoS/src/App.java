import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    static ArrayList<Candidato> inscritos = new ArrayList<Candidato>();
    static Scanner scanner = new Scanner(System.in);

    public static void insertar(){
        
        Candidato candidato = new Candidato();
  
        candidato.setNombre();
        candidato.setCedula();
        candidato.setCiudad(); 
        
        boolean validacion = false;

        for (CiudadOrigen cor : CiudadOrigen.values()){

            if(candidato.getCiudad().toUpperCase().equals(cor.name().toUpperCase())){
                validacion = true;
            }
        }if(validacion == false){
            System.out.println("Valido solo para ciudades del Valle del Cauca");
            insertar();
        }
        candidato.setIdeologia();
        boolean validacion1 = false;
        if(candidato.getIdeologia().equalsIgnoreCase("DERECHA") || candidato.getIdeologia().toUpperCase().equals("IZQUIERDA")){
            
            candidato.setPartido_P();
        
            for (PartidoPolitico pp : PartidoPolitico.values()){

                if(candidato.getPartido_P().toUpperCase().equals(pp.name().toUpperCase())){
                    validacion1 = true;
                    inscritos.add(candidato);
                }
            }if(validacion1 == false){
                System.out.println("Partido no Valido");
                insertar();
            }
        }else{
            System.out.println("Ideologias Validas -> Derecha o Izquierda");
            insertar();
        }

        candidato.setNum_promesas();
        String[] promesasC = new String[candidato.getNum_promesas()];

        for(String pr : promesasC){
            System.out.println();

        }

    }

    public static void actualizar(){

        //System.out.println("Que candidato desea actualizar: ");
        //String resp = scanner.nextLine();

        for(int i=0; i<inscritos.size();i++){
            System.out.println("\nCandidat@ #" + (i+1));
            System.out.println(inscritos.get(i));
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
                case 2: actualizar();break;
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