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
                System.out.println("0. No seguir haciendo CRUD");

                System.out.print("Para incribir/modificar un candidato elija una opcion: ");
                opcion = scanner.nextInt();
                System.out.println();
                Insertar obj1 = new Insertar();
                Actualizar obj2 = new Actualizar();
                
            
                switch (opcion) {

                    case 1: obj1.insertar();break;
                    case 2: obj2.actualizar();break;
                    case 3: break;
                    case 4: break;
                    case 5: break;
                    case 0: break;
                    default:
                        System.out.println("Opcion No Valida");
                        break;
                }
            }while(opcion!=0);
        }
    }
}
    
/*----------------------------------------------------------------------------------------------------------- */
    /*ArrayList<Candidato> inscritos = new ArrayList<Candidato>();
    Scanner scanner = new Scanner(System.in);
    public void insertar(){

        System.out.println(inscritos.size());
        Candidato candidato = new Candidato();

        boolean val = false;
        candidato.setNombre();
        candidato.setCedula();
        
        for(int i = 0; i<inscritos.size(); i++){ 
            
            if(candidato.getCedula().equals(inscritos.get(i).getCedula())){
                val = true;
                System.out.println("Candidato Existente");
                System.out.println("Ingrese los datos nuevamente");
                insertar();
            }
        }if(val == false){      
            boolean val1 = false;

            while(val1 == false){
                candidato.setCiudad();

                for (CiudadOrigen cor : CiudadOrigen.values()){

                    if(candidato.getCiudad().equals(cor.name().toUpperCase())){
                        val1 = true;
                        break;
                    }
                }if(val1 == false){
                    System.out.println("\nValido solo para Ciudades del Valle del Cauca");
                    System.out.println("Vuelva a ingresar la ciudad");
                }
            }

            boolean val3 = false;
            while(val3 == false){

                candidato.setIdeologia();
        
                if(candidato.getIdeologia().equalsIgnoreCase("DERECHA")){
                    
                    candidato.setPartido_P();
            
                    for (PartidoDer pd : PartidoDer.values()){

                        if(candidato.getPartido_P().equals(pd.name().toUpperCase())){
                            val3 = true;
                            candidato.setPromesas();
                            inscritos.add(candidato);
                            break;
                        }
                    }if(val3 == false){
                        System.out.println("\nPartido no Valido");
                        System.out.println("Vuelva a ingresar ideologia + partido");
                    }             
                }else if(candidato.getIdeologia().equalsIgnoreCase("IZQUIERDA")){

                    candidato.setPartido_P();

                    for (PartidoIzq pz : PartidoIzq.values()){

                        if(candidato.getPartido_P().toUpperCase().equals(pz.name().toUpperCase())){
                            val3 = true;
                            candidato.setPromesas();
                            inscritos.add(candidato);
                            break;  
                        }
                    }if(val3 == false){
                        System.out.println("\nPartido no Valido");
                        System.out.println("Vuelva a ingresar ideologia + partido");
                    }

                }else{
                    System.out.println("\nIdeologias Validas -> Derecha o Izquierda");
                    
                }
            }
        }
    }*/
/*----------------------------------------------------------------------------------------------------------- 
    public void actualizar(){
        
        for(int i=0; i<inscritos.size();i++){
            System.out.println("\nCANDIDATO #" + (i+1));
            System.out.println(inscritos.get(i));
        }
        
        boolean val4 = false;
        Candidato cc = new Candidato();
        System.out.print("Que candidato desea actualizar -> ");
        cc.setCedula();
        for(int i = 0; i<inscritos.size(); i++){ 
            
            if(cc.getCedula().equalsIgnoreCase(inscritos.get(i).getCedula())){
                val4 = true;
                inscritos.remove(i);
                insertar();
            }

        }if(val4 == false){
                System.out.println("Candidato NO encontrado, vuelva a ingresar la cedula");
                return;
        }

        for(int i=0; i<inscritos.size();i++){
            System.out.println("\nCANDIDATO #" + (i+1));
            System.out.println(inscritos.get(i));
        } 
    }*/
 /*----------------------------------------------------------------------------------------------------------- */

    //public void eliminar(){}
