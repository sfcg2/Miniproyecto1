import java.util.ArrayList;

public class Eliminar {

public Eliminar(){}

App pp = new App();
    
public void eliminar(){     
        
        ArrayList<Candidato> listaC = Insertar.getInscritos();   
        
        boolean val4 = false;
        Candidato cc = new Candidato();
        System.out.println("\n[Ingrese 0 para salir]\n");

        while(val4 == false){

            System.out.print("Eliminar Candidato -> ");
            cc.setCedula();

            if (cc.getCedula().equals("0")){
                return;

            }else if(cc.getCedula() != "0"){

                for(int i = 0; i<listaC.size(); i++){ 
                    
                    if(cc.getCedula().equalsIgnoreCase(listaC.get(i).getCedula())){
                        val4 = true;
                        listaC.remove(i);
                        System.out.println("\nCandidato Eliminado Exitosamente.");
                    }

                }if(val4 == false){
                        System.out.println("\nCandidato NO encontrado, vuelva a ingresar la cedula.\n");
                        pp.esperarSegundos(1650);
                        pp.limpiarPantalla();
                        System.out.println("[Ingrese 0 para salir]\n");
                } 
            }
        }
    }

}




