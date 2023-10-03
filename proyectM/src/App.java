
public class App {
    public static void main(String[] args) throws Exception {
        ListicaC lista = new ListicaC();
        lista.agregarPersona(new Ciudadano(123, "yessenia"));
        lista.agregarPersona(new Ciudadano(234, "yeison"));
        lista.agregarPersona(new Ciudadano(345, "cayetana"));
        
        
        lista.eliminarPersonaPorId(123);
    }
    
    
}

