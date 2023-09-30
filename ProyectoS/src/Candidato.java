public class Candidato extends Ciudadano {

    private String ideologia; //-> derecha (v) e izquierda(f)
    private PartidoPolitico partido_P;
    
    public Candidato (String ideologia, PartidoPolitico partido_P, 
    String nombre, String cedula, CiudadOrigen ciudad){
        //super(nombre, cedula, ciudad);
        
        this.ideologia = ideologia;
        this.partido_P = partido_P;
    }
   
    public String getIdeologia() {
        return ideologia;
    }
    public void setIdeologia(String ideologia) {
        this.ideologia = ideologia;
    }
    public PartidoPolitico getPartido_P() {
        return partido_P;
    }
    public void setPartido_P(PartidoPolitico partido_P) {
        this.partido_P = partido_P;
    }
    @Override
    public void Cedula(String cedula) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void Ciudad(CiudadOrigen ciudad) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void Nombre(String nombre) {
        // TODO Auto-generated method stub
        
    }

    
}
