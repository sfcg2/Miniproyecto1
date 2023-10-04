import java.util.ArrayList;

public class Buscar {
        
    public Buscar(){}
    
    public void buscar(){

        ArrayList<Candidato> listaC = Insertar.getInscritos();   

            System.out.println(listaC.size());

            for(int i=0; i<listaC.size();i++){
                System.out.println("\nCANDIDATO #" + (i+1));
                System.out.println(listaC.get(i));
            }
            
            boolean val4 = false;
            Candidato cc = new Candidato();
            System.out.print("Que candidato desea buscar -> ");
            cc.setCedula();
            for(int i = 0; i<listaC.size(); i++){ 
                
                if(cc.getCedula().equalsIgnoreCase(listaC.get(i).getCedula())){
                    val4 = true;
                    System.out.println(listaC.get(i));
                    System.out.println("\nCandidato Eliminado Exitosamente");
                }

            }if(val4 == false){
                    System.out.println("Candidato NO encontrado, vuelva a ingresar la cedula");
                    return;
            } 
            
    }

}

