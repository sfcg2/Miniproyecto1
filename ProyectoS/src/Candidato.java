public class Candidato extends Ciudadano {

    private String ideologia; //-> derecha (v) e izquierda(f)
    private String partido_P;
    private String promesas;
    
    public Candidato(){}; /*(String ideologia, PartidoPolitico partido_P, 
    String nombre, String cedula, CiudadOrigen ciudad){
        super(nombre, cedula, ciudad);
        
        this.ideologia = ideologia;
        this.partido_P = partido_P;
    }*/
   
    public String getIdeologia() {
        return ideologia.toUpperCase();
    }
    public void setIdeologia() {
        System.out.print("Ideologia: ");
        ideologia = scanner.nextLine();
    }
    public String getPartido_P() {
        return partido_P.toUpperCase();
    }
    public void setPartido_P() {
        System.out.print("Partido Politico: ");
        partido_P = scanner.nextLine();
    }
    @Override
    public String getCedula() {
        return super.getCedula();
    }
    @Override
    public String getCiudad() {
        return super.getCiudad().toUpperCase();
    }
    @Override
    public String getNombre() {
        return super.getNombre().toUpperCase();
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
    
    @Override
    public String toString() {
        return "\nNombre: " + getNombre() + "\nCedula: " + getCedula() + "\nCiudad: " + getCiudad()
        + "\nIdeologia: " + getIdeologia() + "\nPartido Politico: " + getPartido_P() +"\nPromesas: " 
        + getPromesas();
    }

    public String getPromesas() {
        return promesas;
    }
    public void setPromesas() {
        System.out.print("Promesa: ");
        promesas = scanner.nextLine();
    }
  
    
    
}
