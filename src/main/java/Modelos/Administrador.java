package Modelos;

public class Administrador {
    //Atributos
    private Paquetes paq1;
    private Paquetes paq2;
    private String email;
    private String clave;
    private String nombre;
    //Constructor

    public Administrador(String email, String clave, String nombre) {
        this.email = email;
        this.clave = clave;
        this.nombre = nombre;
    }


    //Getter y setters

    public String getNombre() {
        return nombre;
    }

    public Paquetes getPaq1() {
        return paq1;
    }

    public Paquetes getPaq2() {
        return paq2;
    }

    //Otros métodos


    //Creación de paquete y asignacion segun comprobacion a conductor y usuario
    public void addPaquete(String emailDestinatario, String nombreDestinatario, String direccionEntrega, String localidad, String provincia) {
        Paquetes paquete = new Paquetes(emailDestinatario, nombreDestinatario, direccionEntrega, localidad, provincia);
        addPaqueteAdmin(paquete);
    }

    private void addPaqueteAdmin(Paquetes paquete) {
        if (paq1 == null) paq1 = paquete;
        else if (paq2 == null) paq2 = paquete;
    }

    public String cambiaNombre(String nombreNuevo) {
        nombre = nombreNuevo;
        return "Modificado con éxito";
    }

    //Modificar clave
    public String cambiaClave(String claveNueva) {
        clave = claveNueva;
        return "Modificado con éxito";
    }

    public boolean huecoPaquetes() {
        if (paq1 == null) return true;
        else if (paq2 == null) return true;
        else return false;
    }
    public boolean comprobarSeguimientoPaq(String numSeguimiento){
        if (paq2 != null && paq2.getNumeroSeguimiento().equals(numSeguimiento)) return true;
        else if (paq1 != null && paq1.getNumeroSeguimiento().equals(numSeguimiento)) return true;
        return false;
    }

    public boolean verificarInicioSesion(String emailTeclado, String claveTeclado) {
        if (email != null && clave != null) {
            if (email.equals(emailTeclado) && clave.equals(claveTeclado)) return true;

        }
        return false;
    }

    public void liberarPaquetes() {
        if (paq1 != null && paq1.getNombreConductor() != null) paq1 = null;
        if (paq2 != null && paq2.getNombreConductor() != null) paq2 = null;
    }

    public void cambiaInfo() {
        if (paq1 == null && paq2 != null) {
            paq1 = paq2;
            paq2 = null;
        }
    }

    public int incrementaContador() {
        int contadorPaquetesSinAsignacion = 0;
        if (paq1 != null && paq1.getNombreConductor() == null) contadorPaquetesSinAsignacion++;
        if (paq1 == null && contadorPaquetesSinAsignacion >= 1) contadorPaquetesSinAsignacion--;
        if (paq2 != null && paq2.getNombreConductor() == null) contadorPaquetesSinAsignacion++;
        if (paq2 == null && contadorPaquetesSinAsignacion > 1) contadorPaquetesSinAsignacion--;
        return contadorPaquetesSinAsignacion;
    }


    public String pintaPaquetesParaAsignar() {
        String resultado = "";
        if (paq1 != null) resultado += incrementaContador() + " - " + paq1.pintaParaAsignacion() + "\n";
        if (paq2 != null) resultado += incrementaContador() + " - " + paq2.pintaParaAsignacion() + "\n";
        if (resultado.equals("")) resultado += "No hay paquetes para asignar";
        return resultado;
    }
    public String pintaPaqAdmin(){
        String resultado = "";
        if (paq1 != null) resultado += incrementaContador() + " - " + paq1.pintaPaqueteinfo() + "\n";
        if (paq2 != null) resultado += incrementaContador() + " - " + paq2.pintaPaqueteinfo() + "\n";
        if (resultado.equals("")) resultado += "";
        return resultado;
    }
}
