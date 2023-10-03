import java.util.ArrayList;
import java.util.Scanner;


public class App {
    
    ArrayList<Candidato> inscritos = new ArrayList<Candidato>();
    Scanner scanner = new Scanner(System.in);
    ArrayList <String>promesasC = new ArrayList<String>();
    

    public void insertar(){
        
        Candidato candidato = new Candidato();
        candidato.setNombre();
        candidato.setCedula();
        candidato.setCiudad(); 
        
        boolean validacion = false;

        for (CiudadOrigen cor : CiudadOrigen.values()){

            if(candidato.getCiudad().toUpperCase().equals(cor.name().toUpperCase())){
                validacion = true;
                break;
            }
        }if(validacion == false){
            System.out.println("Valido solo para ciudades del Valle del Cauca");
            System.out.println("Vuelva a Insertar al Candidato");
            return;
        }

        candidato.setIdeologia();
        boolean validacion1 = false;
        if(candidato.getIdeologia().equalsIgnoreCase("DERECHA")){

            candidato.setPartido_P();
        
            for (PartidoDer pd : PartidoDer.values()){

                if(candidato.getPartido_P().toUpperCase().equals(pd.name().toUpperCase())){
                    validacion1 = true;
                    candidato.setPromesas();
                    
                    inscritos.add(candidato);
                    break;
                }
            }if(validacion1 == false){
                System.out.println("Partido no Valido");
                System.out.println("Vuelva a Insertar al Candidato");
                return;
            }
                
        }else if(candidato.getIdeologia().equalsIgnoreCase("IZQUIERDA")){

            candidato.setPartido_P();

            for (PartidoIzq pz : PartidoIzq.values()){

                if(candidato.getPartido_P().toUpperCase().equals(pz.name().toUpperCase())){
                    validacion1 = true;
                    candidato.setPromesas();
                    inscritos.add(candidato);
                    break;  
                }
            }if(validacion1 == false){
                System.out.println("Partido no Valido");
                System.out.println("Vuelva a Insertar al Candidato");
                return;
            }
        }else{
            System.out.println("Ideologias Validas -> Derecha o Izquierda");
            insertar();
        }
    }

    public void actualizar(){
        
        for(int i=0; i<inscritos.size();i++){
            System.out.println("\nCANDIDAT@ #" + (i+1));
            System.out.println(inscritos.get(i));
        }
        
        boolean r = false;
        Candidato cc = new Candidato();
        System.out.print("Que candidato desea actualizar -> ");
        cc.setNombre();
        for(Candidato c1 : inscritos){
            
            if(cc.getNombre().equalsIgnoreCase(c1.getNombre())){
                r = true;
                inscritos.remove(c1);
            }

        }insertar();
        
        if(r == false){
                System.out.println("Candidato no Encontrado, vuelva a ingresar el nombre");
                return;
        }
        for(int i=0; i<inscritos.size();i++){
            System.out.println("\nCANDIDAT@ #" + (i+1));
            System.out.println(inscritos.get(i));
        } 
    }


    
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try (Scanner scanner = new Scanner(System.in)) {
            App obj = new App();
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

                    case 1: obj.insertar();break;
                    case 2: obj.actualizar();break;
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

    

    
}