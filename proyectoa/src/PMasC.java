//Partido con mas candidatos
    
public class PMasC{

    public PMasC(){};

    public void pMasC(){

        int contDr = 0;
        int contIz = 0;

        for (PartidoDer pd : PartidoDer.values()){

            contDr = contDr + pd.getSumaDr();
                
            }

            for (PartidoIzq pz : PartidoIzq.values()){

                contIz = contIz + pz.getSumaIz();
                
            }

            if (contDr > contIz){

                System.out.println("\n> PARTIDO CON MAS CANDIDATOS -> Partido de Derecha\n");
                System.out.println("  Con un Total de " + contDr + " Candidato/s.\n");
            }

            else if (contDr < contIz){

                System.out.println("\n\n> El Partido Con Mas Candidatos Es -> El Partido de Izquierda\n");
                System.out.println("  Con Un Total De " + contIz + "Candidato/s.\n");

            }else if(contDr == contIz){

                System.out.println("\n\n> PARTIDOS EMPATADOS");
                System.out.println("Con Un Total De " + contIz + " Candidatos En Cada Partido.\n");
            }
        
    }
}
