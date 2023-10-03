import java.util.ArrayList;

public class Actualizar {
    
    public Actualizar(){}

    Insertar ins = new Insertar();
    ArrayList <Candidato> inscritos1 = ins.insertar();

    public void actualizar(){
    
        for(int i=0; i<inscritos1.size();i++){
            System.out.println("\nCANDIDATO #" + (i+1));
            System.out.println(inscritos1.get(i));
        }
        
        boolean val4 = false;
        Candidato cc = new Candidato();
        System.out.print("Que candidato desea actualizar -> ");
        cc.setCedula();
        for(int i = 0; i<inscritos1.size(); i++){ 
            
            if(cc.getCedula().equalsIgnoreCase(inscritos1.get(i).getCedula())){
                val4 = true;
                inscritos1.remove(i);
                ins.insertar();
            }

        }if(val4 == false){
                System.out.println("Candidato NO encontrado, vuelva a ingresar la cedula");
                return;
        }

        for(int i=0; i<inscritos1.size();i++){
            System.out.println("\nCANDIDATO #" + (i+1));
            System.out.println(inscritos1.get(i));
        } 
    }
}
