package Modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paquetes {
    //Atributos
    private String numeroSeguimiento;
    private String emailDestinatario;
    private String nombreDestinatario;
    private String direccionEntrega;
    private String nombreConductor;
    private String localidad;
    private String provincia;
    private String estado = "en oficina de origen"; //Puede estar en almacen, en reparto o entregado
    private LocalDate fechaEnvio;
    private int diasEntrega;
    private int contPaquetes;
    //Constructor

    //Constructor para crear un paquete
    public Paquetes(String emailDestinatario, String nombreDestinatario, String direccionEntrega, String localidad, String provincia) {
        this.emailDestinatario = emailDestinatario;
        this.nombreDestinatario = nombreDestinatario;
        this.direccionEntrega = direccionEntrega;
        this.localidad = localidad;
        this.provincia = provincia;
        nombreConductor = null;
        this.contPaquetes++;
        this.fechaEnvio = LocalDate.now();
        generarNumeroSeguimiento();
    }

    public Paquetes() {
    }
    //Getter y setters

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public void setDiasEntrega(int diasEntrega) {
        this.diasEntrega = diasEntrega;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public int getContPaquetes() {
        return contPaquetes;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public String getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getEstado() {
        return estado;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String getLocalidad() {
        return localidad;
    }
    //Otros métodos

    // Método para obtener la fecha de envío formateada como cadena en formato "dd/MM/yyyy"

    public String obtenerFechaEnvioFormateada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaEnvio.format(formatter);
    }
    public void addNombreConductor(String nombreConductor){
        this.nombreConductor = nombreConductor;
    }
    private void generarNumeroSeguimiento() {
        // Sumar el día y el mes de la fecha de envío
        int sumaDiaMes = fechaEnvio.getDayOfMonth() + fechaEnvio.getMonthValue();
        // Obtener las dos primeras letras del nombre del destinatario (asumiendo que el nombre tiene al menos dos letras)
        String dosPrimerasLetras = nombreDestinatario.substring(0, 2).toUpperCase();
        // Combina las partes para formar el número de seguimiento
        long numAleatorio = (int) (Math.random() * 100001) + 1;
        numeroSeguimiento = sumaDiaMes + dosPrimerasLetras + contPaquetes++ + numAleatorio;
    }
    public String actualizarEstado(int opcion){
        if (opcion == 1) estado = "en oficina de origen";
        if (opcion == 2) estado = "en almacén";
        if (opcion == 3) estado = "en reparto";
        if (opcion == 4) estado = "entregado";
        return estado;
    }
    public String fechaEntregaEstimada(int dias){
        this.diasEntrega = dias;
        LocalDate fechaEstimada = fechaEnvio.plusDays(diasEntrega);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      return fechaEstimada.format(formatter);
    }
    public String fechaEstimadaCorreo(){
        LocalDate fechaEstimada;
        if (estado.equals("en reparto")) fechaEstimada = LocalDate.now();
        else fechaEstimada = fechaEnvio.plusDays(diasEntrega);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaEstimada.format(formatter);
    }

    //Métodos para modificar los artributos
    public String cambiaNombre(String nombreNuevo){
        nombreDestinatario = nombreNuevo;
        return "Modificado con éxito";
    }
    //Modificar clave
    public String cambiaDireccion(String direccionTeclado){
        direccionEntrega = direccionTeclado;
        return "Modificado con éxito";
    }
    //Modificar telefono
    public String cambiaLocalidad(String localidadTeclado){
        localidad = localidadTeclado;
        return "Modificado con éxito";
    }


    @Override
    public String toString() {
        return "Paquetes{" +
               "numeroSeguimiento=" + numeroSeguimiento +
               ", emailDestinatario='" + emailDestinatario + '\'' +
               ", nombreDestinatario='" + nombreDestinatario + '\'' +
               ", direccionEntrega='" + direccionEntrega + '\'' +
               ", localidad='" + localidad + '\'' +
               ", provincia='" + provincia + '\'' +
               ", estado='" + estado + '\'' +
               ", fechaEnvio='" + fechaEnvio + "\n";
    }
    public String pintaSeguimientoRegistro(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐\n" +
               "       Envío con número de seguimiento: " + numeroSeguimiento + "   \n" +
               "└▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘\n" +
               "     Estado: " + estado + "\n" +
               "     Destinatario: " + nombreDestinatario + "\n" +
               "     Dirección: " + direccionEntrega + "\n" +
               "     Localidad: " + localidad + "\n" +
               "     Provincia: " + provincia + "\n" +
               "     Fecha de envío: " + fechaEnvio.format(formatter) + "\n" +
               "     Fecha de entrega estimada: " + fechaEntregaEstimada(diasEntrega) + "\n" +
               " ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄ ";

    }
    public String pintaSeguimientoSinRegistro(){
        return "┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐\n + " +
               "│                 Consulta de envío sin registro                    │\n " +
               "└▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘\n" +
               "     Número de seguimiento: " + numeroSeguimiento + "\n" +
               "     Estado: " + estado + "\n" +
               "     Destinatario: " + nombreDestinatario + "\n" +
               "     Dirección: " + direccionEntrega + "\n" +
               "     Localidad: " + localidad + "\n" +
               "     Provincia: " + provincia + "\n" +
               "     Fecha de envío: " + fechaEnvio + "\n" +
               "     Fecha de entrega estimada: " + fechaEntregaEstimada(diasEntrega) + "\n" +
               "▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄";
    }
    public String pintaParaAsignacion(){
        return  numeroSeguimiento + " - " + localidad + "(" + provincia + ")" + " - " + obtenerFechaEnvioFormateada() + "\n";
    }
    public String pintaEntregado(){
        return numeroSeguimiento + " - " + direccionEntrega + " - " + estado + "\n";
    }
    public String pintaPaqueteinfo(){
        return numeroSeguimiento + " - "  + nombreDestinatario + " - " + direccionEntrega + "," + localidad + "(" + provincia + ")" + " - " + estado  + "\n";
    }
}
