import java.util.ArrayList;
import java.util.Scanner;
public class Insertar {
    private static ArrayList<Candidato> inscritos = new ArrayList<>(); //lo inicializo
    Scanner scanner = new Scanner(System.in);
    
    
    public Insertar(){} //constructor
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
                            pd.setSumaDr();
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
                            pz.setSumaIz();
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
        for(int i=0; i<inscritos.size();i++){
            System.out.println("\nCANDIDATO #" + (i+1));
            System.out.println(inscritos.get(i));

        } //-> me devuelve la lista, y poder acceder a ella desde otras clases
        }
    
    public static ArrayList<Candidato> getInscritos() {
        return inscritos;
    }

}




    