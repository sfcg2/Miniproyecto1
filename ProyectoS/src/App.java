import java.util.ArrayList;
import java.util.Scanner;


public class App {
    
    static ArrayList<Candidato> inscritos = new ArrayList<Candidato>();
    static Scanner scanner = new Scanner(System.in);
    //static ArrayList <String>promesasC = new ArrayList<String>();
    

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
        if(candidato.getIdeologia().equalsIgnoreCase("DERECHA")){

            candidato.setPartido_P();
        
            for (PartidoDer pd : PartidoDer.values()){

                if(candidato.getPartido_P().toUpperCase().equals(pd.name().toUpperCase())){
                    validacion1 = true;
                    System.out.print("¿Cuantas Promesas de Campana tiene?: ");
                    int n = scanner.nextInt();
                    
                    for(int i = 0; i<n; i++){
                        candidato.setPromesas();

                        //System.out.print("Promesa #" + (i+1) + " : ");
                        //String resp = scanner.nextLine();
                        //promesasC.add(resp);
                        
                    }inscritos.add(candidato);
                }
            }if(validacion1 == false){
                System.out.println("Partido no Valido");
                insertar();
            }
                
        }else if(candidato.getIdeologia().toUpperCase().equalsIgnoreCase("IZQUIERDA")){

            candidato.setPartido_P();
        
            for (PartidoIzq pz : PartidoIzq.values()){

                if(candidato.getPartido_P().toUpperCase().equals(pz.name().toUpperCase())){
                    validacion1 = true;
                    System.out.print("¿Cuantas Promesas de Campana tiene?: ");
                    int n = scanner.nextInt();
        
                    for(int i = 0; i<n; i++){

                        candidato.setPromesas();
                        
                        //System.out.print("Promesa #" + (i+1) + " : ");
                        //String resp = scanner.nextLine();
                        //promesasC.add(resp);
                        
                    }inscritos.add(candidato);
                    
                }
            }if(validacion1 == false){
                System.out.println("Partido no Valido");
                insertar();
            }

        }else{
            System.out.println("Ideologias Validas -> Derecha o Izquierda");
            insertar();
        }
    }

    public static void actualizar(){

        //System.out.println("Que candidato desea actualizar: ");
        //String resp = scanner.nextLine();

        for(int i=0; i<inscritos.size();i++){
            System.out.println("\nCANDIDAT@ #" + (i+1));
            System.out.println(inscritos.get(i));
        }/* 
        System.out.println("\nPROMESAS DE CAMPANA");
        for(int i = 0; i<promesasC.size(); i++){
            System.out.print("Promesa #" + (i+1) + " : ");
            System.out.println(promesasC.get(i));
        }*/


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