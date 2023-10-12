import java.util.ArrayList;
import java.util.Scanner;

public class Insertar {

    private static ArrayList<Candidato> inscritos = new ArrayList<>(); // lo inicializo
    private Scanner scanner = new Scanner(System.in);

    public Insertar() {
    } // constructor

    public void insertar() {
        System.out.print("Ingrese el número de candidatos que desea insertar: ");
        int numCandidatos = scanner.nextInt();

        for (int i = 0; i < numCandidatos; i++) {
            System.out.println("\nCANDIDATO #" + (i + 1));
            Candidato candidato = new Candidato();

            boolean val = false;
            candidato.setNombre();
            candidato.setCedula();

            for (int j = 0; j < inscritos.size(); j++) {
                if (candidato.getCedula().equals(inscritos.get(j).getCedula())) {
                    val = true;
                    System.out.println("Candidato Existente");
                    System.out.println("Ingrese los datos nuevamente");
                    insertar();
                }
            }

            if (!val) {
                boolean val1 = false;
                while (!val1) {
                    candidato.setCiudad();

                    for (CiudadOrigen cor : CiudadOrigen.values()) {
                        if (candidato.getCiudad().equalsIgnoreCase(cor.name())) {
                            val1 = true;
                            break;
                        }
                    }

                    if (!val1) {
                        System.out.println("\nVálido solo para ciudades del Valle del Cauca");
                        System.out.println("Vuelva a ingresar la ciudad");
                    }
                }

                boolean val3 = false;
                while (!val3) {
                    candidato.setIdeologia();

                    if (candidato.getIdeologia().equalsIgnoreCase("DERECHA")) {
                        candidato.setPartido_P();
                        for (PartidoDer pd : PartidoDer.values()) {
                            if (candidato.getPartido_P().equalsIgnoreCase(pd.name())) {
                                val3 = true;
                                candidato.setPromesas();
                                inscritos.add(candidato);
                                break;
                            }
                        }
                        if (!val3) {
                            System.out.println("\nPartido no válido");
                            System.out.println("Vuelva a ingresar ideología + partido");
                        }
                    } else if (candidato.getIdeologia().equalsIgnoreCase("IZQUIERDA")) {
                        candidato.setPartido_P();
                        for (PartidoIzq pz : PartidoIzq.values()) {
                            if (candidato.getPartido_P().equalsIgnoreCase(pz.name())) {
                                val3 = true;
                                candidato.setPromesas();
                                inscritos.add(candidato);
                                break;
                            }
                        }
                        if (!val3) {
                            System.out.println("\nPartido no válido");
                            System.out.println("Vuelva a ingresar ideología + partido");
                        }
                    } else {
                        System.out.println("\nIdeologías válidas -> DERECHA o IZQUIERDA");
                    }
                }
            }
        }

        System.out.println("\nCandidatos ingresados:");
        for (int i = 0; i < inscritos.size(); i++) {
            System.out.println("\nCANDIDATO #" + (i + 1));
            System.out.println(inscritos.get(i));
        }
    }

    public static ArrayList<Candidato> getInscritos() {
        return inscritos;
    }
}



    