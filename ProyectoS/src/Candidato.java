public class Candidato extends Ciudadano {

    private String ideologia; //-> derecha (v) e izquierda(f)
    private PartidoPolitico partido_P;
    
    public Candidato(){}; /*(String ideologia, PartidoPolitico partido_P, 
    String nombre, String cedula, CiudadOrigen ciudad){
        super(nombre, cedula, ciudad);
        
        this.ideologia = ideologia;
        this.partido_P = partido_P;
    }*/
   
    public String getIdeologia() {
        return ideologia;
    }
    public void setIdeologia() {
        this.ideologia = ideologia;
    }
    public PartidoPolitico getPartido_P() {
        return partido_P;
    }
    public void setPartido_P() {
        this.partido_P = partido_P;
    }

    @Override
    public String getCedula() {
        return super.getCedula();
    }

    @Override
    public String getCiudad() {
        return super.getCiudad();
    }

    @Override
    public String nombre() {
        return super.nombre();
    }

    @Override
    public void setCedula() {
        super.setCedula();
    }

    @Override
    public void setCiudad() {
        super.setCiudad();
    }

    @Override
    public void setNombre() {
        super.setNombre();
    }

    
    
}
