package Main;

import Comunicaciones.*;
import Utils.Utils;
import Modelos.*;

import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class MainFernandPaq {
    public static final Scanner S = new Scanner(System.in);
    public static int op;
    private static Usuarios conductorGeneral;
    private static String emailTeclado, claveTeclado, seguimientoTeclado;
    private static Usuarios userLogueadoDestinatario, userLogueadoConductor;
    private static Paquetes paqueteModificar = null;
    //Inicio MOCK
    private static final Usuarios u1 = null;
    private static final Usuarios u2 = null;
    private static Administrador jefe = new Administrador("admin@gmail.com", "admin", "Elisa");
    private static final Usuarios conductor1 = null;
    private static final Usuarios conductor2 = null;
    private static final Usuarios conductor3 = null;
    private static Usuarios usuarioGeneral = null;
    private static final Destinatarios destinatario = new Destinatarios(u1, u2);
    private static final Conductor conductor = new Conductor(conductor1, conductor2, conductor3);

    //Fin MOCK

    //TODO: MAIN DEL PROGRAMA
    public static void main(String[] args) {
        pintaEntrada();
        System.out.println(insertaDatos(compruebaRespuesta()));
        do {

            //Creamos un menú con opcion de crear una cuenta o iniciar sesión
            try {
                op = pintaMenuPrincipal();
                switch (op) {
                    case 1: //Preguntas para iniciar sesión
                        preguntaInicioSesion();
                        //comprueba la cuenta que se ha logueado y le muestra sus menús
                        compruebaCuentaSesion();
                        break;
                    case 2:
                        //CONTIENE T0D0 EL FUNCIONAMIENTO PARA CREAR UN USUARIO
                        creacionUsuariosMenus();
                        break;
                    case 3:
                        //Seguimiento de un paquete sin iniciar sesión
                        seguimientoPaqueteSinRegistro();
                        break;
                    case 4:
                        Utils.saliendoPrograma();
                        break;
                    default:
                        System.out.println("Esa opción no existe. Por favor elija otra");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("""
                        ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                        │     Error: Debes introducir un número        │
                        └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                        """);
            }


        } while (op != 4);
    }

    //TODO: FUNCIONES DEL PROGRAMA
    //TODO: FUNCIONES QUE PINTAN MENÚS

    //PORTADA DEL PROGRAMA, TODO:MODIFICAR A UNA MÁS BONITA, IGUAL CON LOS MENÚS
    public static void pintaEntrada() {
        System.out.println("""
                ┌─────────────────────────────────────────────────────────────────────────────────────────┐
                │                                                                                         │
                │  ███████╗███████╗██████╗ ███╗   ██╗ █████╗ ███╗   ██╗██████╗  █████╗  █████╗  ██████╗   │
                │  ██╔════╝██╔════╝██╔══██╗████╗  ██║██╔══██╗████╗  ██║██╔══██╗██╔══██╗██╔══██╗██╔═══██╗  │
                │  █████╗  █████╗  ██████╔╝██╔██╗ ██║███████║██╔██╗ ██║██████╔╝███████║███████║██║   ██║  │
                │  ██╔══╝  ██╔══╝  ██╔══██╗██║╚██╗██║██╔══██║██║╚██╗██║██╔═══╝ ██╔══██║██╔══██║██║▄▄ ██║  │
                │  ██║     ███████╗██║  ██║██║ ╚████║██║  ██║██║ ╚████║██║     ██║  ██║██║  ██║╚██████╔╝  │
                │  ╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝     ╚═╝  ╚═╝╚═╝  ╚═╝ ╚══▀▀═╝   │
                │                                                                                         │
                └─────────────────────────────────────────────────────────────────────────────────────────┘""");
    }

    //MENÚ DE INICIO AL ARRANCAR EL PROGRAMA

    public static int pintaMenuPrincipal() {
        System.out.print("""                
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                     Bienvenido a FernanPaaq ¿qué desea hacer?     
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                   █ 1) Iniciar Sesión.
                   █ 2) Crear una cuenta.
                   █ 3) Seguimiento de un paquete con número de referencia.
                   █ 4) Salir.
                   Elige una opción:""");
        return Integer.parseInt(S.nextLine());
    }

    //MENÚ PRINCIPAL DEL USUARIO NORMAL

    public static int pintaMenuUsuario(Usuarios usuarioLogueado) {
        System.out.printf("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                     Bienvenido %s. Siga sus envios en FernanPaaq
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                     █ 1. Seguir mis envíos
                     █ 2. Modificar mis datos de entrega para un envío
                     █ 3. Ver mi perfil
                     █ 4. Modificar mi perfil
                     █ 5. Cerrar sesión
                     Elige una opción:
                """, usuarioLogueado.getNombre());
        return Integer.parseInt(S.nextLine());
    }

    //MENÚ PARA MODIFICAR LOS DATOS DE UN PAQUETE
    //UTILIZADO EN PERFIL DE USUARIO NORMAL OPCION 2

    public static int pintaModificaPaquete(Paquetes paqueteModificar) {
        System.out.printf("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                   Modificar el paquete %s
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                 █ 1. Nombre de destinatario
                 █ 2. Dirección
                 █ 3. Localidad
                 █ 4. Salir
                 Elija una opción:""", paqueteModificar.getNumeroSeguimiento());
        return Integer.parseInt(S.nextLine());
    }

    //MENÚ CON OPCIONES PARA MODIFICAR EL PERFIL DEL USUARIO NORMAL

    public static int pintaMenuModificarUser() {
        System.out.println("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                   Modificar mi perfil
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                    █ 1. Nombre
                    █ 2. Clave
                    █ 3. Telefono
                    █ 4. Salir
                    Elija la opción que desea:""");
        return Integer.parseInt(S.nextLine());
    }

    //MENÚ CON OPCIONES PARA MODIFICAR EL PERFIL DE CONDUCTOR

    public static int pintaMenuModificarCond() {
        System.out.println("""
               ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                  Modificar mi perfil
               └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                      █ 1. Nombre
                      █ 2. Clave
                      █ 3. Telefono
                      █ 4. Provincia
                      █ 5. Salir
                      Elija la opción que desea:""");
        return Integer.parseInt(S.nextLine());
    }

    //MENÚ PRINCIPAL DE UN CONDUCTOR AL LOGUEARSE

    public static int pintaMenuConductor(Usuarios usuarioConductor) {
        System.out.printf("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                     Bienvenido %s. Gestione sus pedidos asignados.
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                          █ 1. Ver la información de mis envíos.
                          █ 2. Cambiar el estado de un envío.
                          █ 3. Ver el histórico de paquetes entregados.
                          █ 4. Modificar mi perfil.
                          █ 5. Cerrar sesión.
                          Elige una opción:""", usuarioConductor.getNombre());
        return Integer.parseInt(S.nextLine());
    }

    //MENÚ DE LOS DISTINTOS ESTADOS QUE PUEDE TENER UN PAQUETE

    public static int pintaMenuEstados(Paquetes paqueteModificar) {
        System.out.printf("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                     Estado del pedido %s
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                      █ 1. En oficina
                      █ 2. En almacén
                      █ 3. En reparto
                      █ 4. Entregado
                      Elija una opción:""", paqueteModificar.getNumeroSeguimiento());
        return Integer.parseInt(S.nextLine());
    }


    //MENÚ QUE SE MUESTRA CUANDO QUEREMOS CREAR UNA CUENTA

    public static int pintaMenuCrearCuentas() {

        System.out.print(""" 
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                   ¿Qué cuenta desea crear?
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                     █ 1. Usuario normal
                     █ 2. Conductor
                     Introduce una opción:""");
        return Integer.parseInt(S.nextLine());
    }

    //MENÚ PARA MODIFICAR EL PERFIL DE ADMIN

    public static int pintaModifAdmin() {
        System.out.println("""
                 ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                    Modificar mi perfil
                 └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                   █ 1. Modificar clave
                   █ 2. Modificar nombre
                   █ 3. Salir
                   Elija la opción que desee:""");
        return Integer.parseInt(S.nextLine());
    }

    //LO USO PARA QUE NO SE FORMEN BUCLES A LA HORA DE PEDIR DATOS
    //O EQUIVOCARTE EN ALGO Y QUERER SALIR DE ESA OPCIÓN

    public static String salirOpcion() {
        System.out.println("¿Desea salir de esta opción?");
        return S.nextLine();
    }

    //TODO: FUNCIONES QUE PIDEN DATOS

    public static int saleOpciones() {
        if (salirOpcionConfirmacion(salirOpcion())) {
            Utils.limpiarPantalla();
            return 6;
        } else {
            Utils.pulsaParaContinuar();
        }
        return 0;
    }

    //PIDE UN NOMBRE
    //USADO PARA MODIFICAR PERFILES DE CONDUCTOR, USUARIOS Y ADMIN
    //TAMBIEN PARA MODIFICAR PAQUETE
    public static String nuevoNombre() {
        String nombre = "";
        do {
            System.out.println("Introduce un nombre");
            nombre = S.nextLine();
            if (nombre.equals(" ") || nombre.equals("")) System.out.println("Noecesitamos conocer un nombre...");
        } while (nombre.equals(" ") || nombre.equals(""));
        return nombre;
    }

    //PIDE UNA DIRECCIÓN
    //USADO PARA MODIFICAR PERFIL DE USUARIO Y MODIFICAR PAQUETES

    public static String nuevaDireccion() {
        String direccion = "";
        do {
            System.out.println("Introduce una direccion");
            direccion = S.nextLine();
            if (direccion.equals(" ") || direccion.equals(""))
                System.out.println("Necesitamos conocer una dirección...");
        } while (direccion.equals(" ") || direccion.equals(""));
        return direccion;
    }

    //PIDE CLAVE
    //USADO EN MODIFICACIONES DE PERFIL, TANTO CONDUCTOR COMO USUARIO Y ADMIN

    public static String nuevaClave() {
        String clave = "";
        do {
            System.out.println("Introduce una clave");
            clave = S.nextLine();
            if (clave.equals(" ") || clave.equals("")) System.out.println("No introduzcas una clave tan corta");
        } while (clave.equals(" ") || clave.equals(""));
        return clave;
    }

    //PIDE UNA LOCALIDAD
    //USADO EN MODIFICACIÓN DEL PERFIL Y MODIFICACION PAQUETE

    public static String nuevaLocalidad() {
        String localidad = "";
        do {
            System.out.println("Introduce una localidad");
            localidad = S.nextLine();
            if (localidad.equals(" ") || localidad.equals(""))
                System.out.println("No saltes este paso, necesitas conocer la localidad!");
        } while (localidad.equals(" ") || localidad.equals(""));
        return localidad;
    }

    //PIDE UNA PROVINCIA
    //LO USO PARA MODIFICAR EL PERFIL, UTILIZADO EN CONDUCTOR Y MODIFICACION PAQUETE

    public static String nuevaProvi() {
        String provincia = "";
        do {
            System.out.println("Introduce una provincia");
            provincia = S.nextLine();
            if (provincia.equals(" ") || provincia.equals(""))
                System.out.println("No saltes este paso, necesitas conocer la provincia!");
        } while (provincia.equals(" ") || provincia.equals(""));
        return provincia;
    }

    //PIDE EL NÚMERO DE TELEFONO
    //LO USO PARA MODIFICAR EL PERFIL Y CAMBIAR EL NÚMERO

    public static int nuevoTel() {
        int telefono = 0, cont;
        do {
            try {
                System.out.println("Introduce un número de teléfono");
                telefono = Integer.parseInt(S.nextLine());
                if (!compruebaTel(telefono)) System.out.println("Por favor, introduce un número válido");

            } catch (NumberFormatException e) {
                System.out.println("""
                        ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                        │  Error: Debes introducir un número de teléfono válido  │
                        └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                        """);
            }
        } while (!compruebaTel(telefono));
        return telefono;
    }

    //FUNCION PARA VERIFICAR EL TELEFONO
    public static int contarDigitos(int numero) {
        // Convertir el número a una cadena de texto para obtener su longitud
        String numeroComoTexto = Integer.toString(numero);
        return numeroComoTexto.length();
    }

    public static boolean compruebaTel(int numero) {
        int longitud = contarDigitos(numero);
        if (longitud != 9) return false;
        return true;
    }

    //PIDE EL NÚMERO DE SEGUIMIENTO DEL PAQUETE, LO UTILIZO MAYORMENTE
    //PARA BUSCAR ALGÚN PAQUETE

    public static String pideNumSeguim() {
        String numSegui = "";
        do {
            System.out.println("Introduce el número de seguimiento");
            numSegui = S.nextLine();
            if (numSegui.equals(" ") || numSegui.equals(""))
                System.out.println("Inválido, introduce un número de seguimiento válido");
        } while (numSegui.equals(" ") || numSegui.equals(""));
        return numSegui;
    }

    //TODO: MENÚ PRINCIPAL
    //OPCION 1
    public static void preguntaInicioSesion() {
        String email, clave;
        System.out.println("Introduzca su email");
        emailTeclado = S.nextLine();
        System.out.println("Introduzca su clave");
        claveTeclado = S.nextLine();
        //Aquí comprueba si existe algun usuario con los valores indicados, si no hay ninguno el resultado es null
        userLogueadoDestinatario = destinatario.verificarInicioSesion(emailTeclado, claveTeclado);
        userLogueadoConductor = conductor.verificarInicioSesion(emailTeclado, claveTeclado);
    }

    //SWITCH DE LOS INICIOS DE SESIÓN
    public static void compruebaCuentaSesion() {
        if (userLogueadoDestinatario != null) {
            //Menú del usuario normal
            menuNormalUser();
        } else if (userLogueadoConductor != null) {
            //Menú del conductor
            do {
                //Pinta el menú de los usuarios conductores
                try {
                    op = pintaMenuConductor(userLogueadoConductor);
                    switch (op) {
                        case 1:
                            //Muestra la informacion de los envios que no ha entregado todavia
                            System.out.println(userLogueadoConductor.mostrarEnvios());
                            Utils.pulsaParaContinuar();
                            Utils.limpiarPantalla();
                            break;
                        case 2:
                            //Cambia el estado de un envio
                            cambiarEstadoEnvio();
                            break;
                        case 3:
                            System.out.println("""
                                    ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                                    │       Historico de paquetes entregados        │
                                    └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘""");
                            System.out.println(userLogueadoConductor.pintaHistoricoConductor());
                            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
                            Utils.pulsaParaContinuar();
                            //Muestra todos los pedidos que tienen de estado "Entregado"
                            break;
                        case 4:
                            do {
                                try {
                                    op = pintaMenuModificarCond();
                                    switch (op) {
                                        case 1: //Cambia el nombre
                                            System.out.println(userLogueadoConductor.cambiaNombre(nuevoNombre()));
                                            break;
                                        case 2: //Cambia la clave
                                            System.out.println(userLogueadoConductor.cambiaClave(nuevaClave()));
                                            break;
                                        case 3: //Cambia el número de telefono
                                            System.out.println(userLogueadoConductor.cambiaTelefono(nuevoTel()));
                                            break;
                                        case 4: //Cambia la provincia
                                            System.out.println(userLogueadoConductor.cambiaProvincia(nuevaProvi()));
                                            break;
                                        case 5: //Sale de este menú
                                            Utils.salirOpcion();
                                            Utils.limpiarPantalla();
                                            op++;
                                            break;
                                        default:
                                            System.out.println("No existe esa opción");
                                            break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("""
                                            ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                                            │  Error: Debes introducir un número  │
                                            └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                                            """);
                                }
                            } while (op != 6);
                            break;
                        case 5: //Cierra sesion y limpia pantalla
                            Utils.cerrarSesion();
                            Utils.limpiarPantalla();
                            break;
                        default:
                            System.out.println("No existe esa opción, por favor elija otra");
                            Utils.pulsaParaContinuar();
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("""
                            ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                            │  Error: Debes introducir un número  │
                            └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                            """);
                }
            } while (op != 5);
        } else if (jefe.verificarInicioSesion(emailTeclado, claveTeclado)) {
            //Menú del admin
            menuLoginAdmin();
        } else { //Si la validación no ha funcionado bien se le indica que ha introducido un login incorrecto
            System.out.println("""
                    ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                    │  Inicio de sesión incorrecto  │
                    └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                    """);
            Utils.pulsaParaContinuar();
        }
    }

    //OPCION 2 DEL MENÚ PRINCIPAL
    public static void creacionUsuariosMenus() {
        //Menú para crear usuarios
        //Primero le preguntamos que tipo de cuenta desea crear
        try {
            op = pintaMenuCrearCuentas();
            switch (op) {
                case 1: //Si ha elegido la opción uno comprobamos si hay hueco y creamos la cuenta
                    creaUser();
                    break;
                case 2: //Si ha elegido la opción dos comprobamos si hay hueco y creamos la cuenta
                    creaConductor();
                    break;
                default:
                    System.out.println("""
                            ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                            │  Error: Esa opción no existe  │
                            └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                            """);
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("""
                    ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                    │  Error: Debes introducir un número   │
                    └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                    """);
        }
        //UNA VEZ ELEGIDO SEGÚN LA OPCION QUE HA ESCOGIDO SE EMPIEZA A CREAR LA CUENTA

    }

    //CREA USUARIO NORMAL
    public static void creaUser() {
        int cont = 0;
        if (destinatario.quedaHueco()) {
            do {
                System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                System.out.println("Introduce un email");
                emailTeclado = S.nextLine();
                if (!destinatario.comprobarEmail(emailTeclado)) {
                    System.out.println("Procesando...");
                    try {
                        ValidarCorreo.enviarToken(emailTeclado);
                        do {
                            System.out.print("""
                                    ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                                    │ Le hemos enviado un correo con un código para verificar su email │
                                    └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                                                    
                                                Por favor, introduzca su código:""");
                            int tokenTeclado = Integer.parseInt(S.nextLine());
                            if (ValidarCorreo.validarToken(tokenTeclado)) {
                                cont = -1;
                                System.out.println(destinatario.insertarUsuario(emailTeclado, nuevaClave(), nuevoNombre(), nuevoTel()));
                                op = 6;
                                Utils.pulsaParaContinuar();
                                Utils.limpiarPantalla();
                            } else {
                                System.out.println("""
                                        »»»»»»»»»»»»»»»»
                                         Código erróneo
                                        ««««««««««««««««""");
                                cont++;
                            }
                        } while (cont != 5 && cont != -1);
                        if (cont == 5) {
                            System.out.println("Esto no es prueba y error, ¡debes de mirar tu correo!. Por ahora, no te crearemos tu cuenta. :(");
                            op = 6;
                        }
                    } catch (RuntimeException e) {
                        System.out.println("""
                                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                                │  El email introducido es incorrecto  │
                                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                                """);
                        op = saleOpciones();
                    }
                } else {
                    System.out.println("""
                            ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                            │  Error: No se ha podido registrar tu email, pruebe con otro.  │
                            └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                            """);
                    if (salirOpcionConfirmacion(salirOpcion())) {
                        op = 6;
                        Utils.limpiarPantalla();
                    } else {
                        Utils.pulsaParaContinuar();
                    }
                }
            } while (op != 6);
        } else {
            System.out.println("""
                    ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                    │  Error: Límite de cuentas alcanzado  │
                    └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                    """);
            Utils.pulsaParaContinuar();
            Utils.limpiarPantalla();
        }

    }

    //CREA CONDUCTOR
    public static void creaConductor() {
        int cont = 0;
        if (conductor.hayHueco()) {
            do {
                System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                System.out.println("Introduce un email");
                emailTeclado = S.nextLine();
                if (!conductor.comprobarEmail(emailTeclado)) {
                    System.out.println("Procesando...");
                    try {
                        ValidarCorreo.enviarToken(emailTeclado);
                        do {
                            System.out.print("""
                                    ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                                    │ Le hemos enviado un correo con un código para verificar su email │
                                    └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                                                    
                                                Por favor, introduzca su código:""");
                            int tokenTeclado = Integer.parseInt(S.nextLine());
                            if (ValidarCorreo.validarToken(tokenTeclado)) {
                                cont = -1;
                                System.out.println(conductor.insertarConductor(emailTeclado, nuevaClave(), nuevaProvi(), nuevoNombre(), nuevoTel()));
                                op = 6;
                                Utils.pulsaParaContinuar();
                                Utils.limpiarPantalla();
                            } else {
                                System.out.println("""
                                        »»»»»»»»»»»»»»»»
                                         Código erróneo
                                        ««««««««««««««««""");
                                cont++;
                            }
                        } while (cont != 5 && cont != -1);
                        if (cont == 5) {
                            System.out.println("Esto no es prueba y error, ¡debes de mirar tu correo!. Por ahora, no te crearemos tu cuenta. :(");
                            op = 6;
                        }
                    } catch (RuntimeException e) {
                        System.out.println("""
                                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                                │ Error: Email no válido   │
                                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                                """);
                        op = saleOpciones();
                    }
                } else {
                    System.out.println("""
                            ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                            │ Error: No se ha podido registrar su email, escoga otro   │
                            └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                            """);
                    if (salirOpcionConfirmacion(salirOpcion())) {
                        op = 6;
                        Utils.limpiarPantalla();
                    } else {
                        Utils.pulsaParaContinuar();
                    }
                }
            } while (op != 6);
        } else {
            System.out.println("""
                    ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                    │     Error: Límite de cuentas alcanzado       │
                    └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                    """);
            Utils.pulsaParaContinuar();
        }
    }

    //Funcion creada para los bucles
    public static boolean salirOpcionConfirmacion(String respuesta) {
        return respuesta.equalsIgnoreCase("Si");
    }

    //OPCION 3
    public static void seguimientoPaqueteSinRegistro() {
        System.out.println("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                │ Seguimiento sin registro de usuario │
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘""");
        seguimientoTeclado = pideNumSeguim();
        if (destinatario.getU1() != null) {
            paqueteModificar = destinatario.getU1().comprobacionSeguimiento(seguimientoTeclado);
        } else if (destinatario.getU2() != null) {
            paqueteModificar = destinatario.getU2().comprobacionSeguimiento(seguimientoTeclado);
        }
        if (paqueteModificar != null) {
            System.out.println(paqueteModificar.pintaSeguimientoSinRegistro());
        } else {
            System.out.println("""
                    ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                    │     Error: No se ha encontrado el paquete    │
                    └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                    """);
        }
    }

    //TODO: MENÚ USUARIO
    public static void menuNormalUser() {
        do {
            try {
                op = pintaMenuUsuario(userLogueadoDestinatario);
                switch (op) {
                    case 1: //Muestra los envios que tiene adjudicados a su cuenta
                        System.out.println(userLogueadoDestinatario.mostrarEnvios());
                        Utils.pulsaParaContinuar();
                        break;
                    case 2: //Modifica los datos de un paquete
                        modificaDatosPaqueteUser();
                        break;
                    case 3: //Muestra la información de su perfil
                        System.out.println(userLogueadoDestinatario.infoUsuarioLogueado());
                        Utils.pulsaParaContinuar();
                        break;
                    case 4:
                        //Modifica el perfil del usuario
                        modificaDatosPerfilUser();
                        break;
                    case 5: //Cierra sesion y limpia pantalla
                        Utils.cerrarSesion();
                        Utils.limpiarPantalla();
                        break;
                    default: //Por si se equivoca de número
                        System.out.println("Esa opción no existe, por favor elija otra.");
                        Utils.pulsaParaContinuar();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("""
                        ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                        │     Error: Debes introducir un número        │
                        └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                        """);
            }
        } while (op != 5);
    }

    //TODO: OPCIONES DEL MENÚ USUARIO
    //OPCION 2 DEL MENÚ USUARIO
    public static void modificaDatosPaqueteUser() {
        do {
            try {
                paqueteModificar = userLogueadoDestinatario.comprobacionSeguimiento(pideNumSeguim());
            } catch (NullPointerException e) {
                System.out.println("""
                        ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                        │     No tienes paquetes para modificar      │
                        └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                        """);
            }
            try {
                op = pintaModificaPaquete(paqueteModificar);
                switch (op) {
                    case 1:
                        //Cambia el nombre del destinatario del paquete
                        paqueteModificar.cambiaNombre(nuevoNombre());
                        break;
                    case 2:
                        //Cambia la direccion de entrega del paquete
                        paqueteModificar.cambiaDireccion(nuevaDireccion());
                        break;
                    case 3:
                        //Cambia la localidad del paquete
                        paqueteModificar.cambiaLocalidad(nuevaLocalidad());
                        break;
                    case 4:
                        Utils.salirOpcion();
                        break;
                    default:
                        System.out.println("No existe esa opción, por favor elija la correcta");
                        break;
                }
            } catch (Exception e) {
                System.out.println("""
                        ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                        │     Error: Debes introducir un número        │
                        └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                        """);
                if (salirOpcionConfirmacion(salirOpcion())) op = 4;
            }
        } while (op != 4);
    }

    //OPCION 4
    public static void modificaDatosPerfilUser() {
        do {
            //Menú que enseña las opciones a modificar del perfil
            try {
                op = pintaMenuModificarUser();
                switch (op) {
                    case 1: //Cambia el nombre del usuario normal
                        System.out.println(userLogueadoDestinatario.cambiaNombre(nuevoNombre()));
                        break;
                    case 2: //Cambia la clave del usuario normal
                        System.out.println(userLogueadoDestinatario.cambiaClave(nuevaClave()));
                        break;
                    case 3: //Cambia el número de telefono del usuario normal
                        System.out.println(userLogueadoDestinatario.cambiaTelefono(nuevoTel()));
                        break;
                    case 4: //Sale de este menú
                        Utils.salirOpcion();
                    default:
                        System.out.println("No existe esa opción");
                }
            } catch (NumberFormatException e) {
                System.out.println("""
                        ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                        │     Error: Debes introducir un número        │
                        └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                        """);
            }
        } while (op != 4);
    }

    //TODO:MENÚ DEL CONDUCTOR

    //TODO:OPCIONES DEL MENÚ CONDUCTOR
    //OPCION 2 DEL CONDUCTOR
    public static void cambiarEstadoEnvio() {
        try {
            System.out.println("""
                    ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                    │     Actualización de envíos     │
                    └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                    """);
            System.out.print(userLogueadoConductor.pintaPaqConductor() + "\n" + "Seleccione el envío a modificar (o pulse 3 para salir): ");
            op = Integer.parseInt(S.nextLine());
            switch (op) {
                case 1:
                    paqueteModificar = userLogueadoConductor.getPaq1();
                    break;
                case 2:
                    paqueteModificar = userLogueadoConductor.getPaq2();
                    break;
                case 3:
                    Utils.salirOpcion();
                    break;
                default:
                    System.out.println("Elija un envio correcto");
                    break;
            }
            if (paqueteModificar != null) {
                System.out.println(paqueteModificar.actualizarEstado(pintaMenuEstados(paqueteModificar)));
                usuarioGeneral = destinatario.comprobarEmailMensaje(paqueteModificar.getEmailDestinatario());
                if (Mensajes.enviarMensaje(usuarioGeneral.getEmail(), "Tu envio tiene actualizaciones",
                        PlantillaCambiaEstado.generaPlantillaCambiaEstado(usuarioGeneral.getNombre(), paqueteModificar.getNumeroSeguimiento(),
                                paqueteModificar.fechaEstimadaCorreo(), paqueteModificar.getEstado(), paqueteModificar.getDireccionEntrega(),
                                paqueteModificar.getLocalidad(), paqueteModificar.getProvincia())))
                    System.out.println("Actualización enviada al destinatario");
                Utils.pulsaParaContinuar();
            }
        } catch (NumberFormatException e) {
            System.out.println("""
                    ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                    │     Error: Debes introducir un número        │
                    └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                    """);
        }
    }

    //TODO: MENÚ DEL ADMIN
    //MENÚ PRINCIPAL DE ADMIN

    public static int pintaMenuAdmin(Administrador jefe) {
        System.out.printf("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                     Bienvenido %s. Administración FernanPaaq. Tiene %d envíos por asignar.
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                
                       █ 1. Registrar un nuevo envío.
                       █ 2. Asignar un envío a un conductor.
                       █ 3. Ver los datos de todos los usuarios registrados.
                       █ 4. Ver los datos de todos los envíos.
                       █ 5. Ver los datos de todos los conductores.
                       █ 6. Modificar el perfil.
                       █ 7. Cerrar sesión.
                       Elige una opción:""", jefe.getNombre(), jefe.incrementaContador());
        return Integer.parseInt(S.nextLine());
    }

    public static void menuLoginAdmin() {
        do {
            try {
                op = pintaMenuAdmin(jefe);

                switch (op) {
                    case 1: //Registra un nuevo paquete
                        creaPaquete();
                        break;
                    case 2:
                        //Asigna un envio a un conductor si este no ha podido ubicarse en uno
                        buscaPaqSinConduct();
                        break;
                    case 3:
                        muestraUsuariosAdmin();
                        //Compueba los datos de todos los usuarios registrados
                        break;
                    case 4:
                        muestraPaquetesAdmin();
                        //Comprueba los datos de todos los envios
                        break;
                    case 5:
                        pintaInfoConductores();
                        //Comprueba todos los datos de los conductores
                        break;
                    case 6: //Modifica el perfil del admin
                        menuModificaAdmin();
                        break;
                    case 7: //Para cerrar sesión, se limpia la pantalla
                        Utils.cerrarSesion();
                        Utils.limpiarPantalla();
                        break;
                    default: //Por si elije otra opción que no esté en el menú
                        System.out.println("No existe esa opción. Por favor elija otra.");
                        Utils.pulsaParaContinuar();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("""
                        ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                        │     Error: Debes introducir un número        │
                        └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                        """);
                Utils.pulsaParaContinuar();
            }
        } while (op != 7);
    }

    //TODO: OPCIONES DEL ADMIN

    //ENVIA CORREO CUANDO ASIGNAN UN PAQUETE
    public static void enviaCorreoCambiaEstado(String nombre, String direccion, String localidad, String provincia) {
        usuarioGeneral = destinatario.comprobarEmailMensaje(emailTeclado);
    }

    //OPCION 1 DEL ADMIN
    public static void creaPaquete() {
        if (jefe.huecoPaquetes()) {
            System.out.println("""
                    ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                    │         Registro de un nuevo envío           │
                    └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                    """);
            System.out.println("Introduce el email del destinatario");
            emailTeclado = S.nextLine();
            if (destinatario.comprobarEmail(emailTeclado)) {
                String nombre = nuevoNombre(), direccion = nuevaDireccion(), localidad = nuevaLocalidad(), provincia = nuevaProvi();
                jefe.addPaquete(emailTeclado, nombre, direccion, localidad, provincia);
                System.out.println("""
                        ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                        │   Procesando...  │
                        └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                        """);
                compruebaNumSeguimiento();
                jefe.cambiaInfo();
                insertaPaqueteCuentas();
                System.out.println("Paquete creado correctamente");
                Utils.pulsaParaContinuar();
                Utils.limpiarPantalla();

            } else {
                System.out.println("""
                        ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                        │   Error: El email indicado no existe o ha alcanzado su límite de espacio  │
                        └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                        """);
                Utils.pulsaParaContinuar();
            }
        }
    }

    //METE AUTOMATICAMENTE EL PAQUETE DONDE CORRESPONDA
    //ASIGNA EL PAQUETE A CONDUCTOR SI TIENE LA MISMA PROVINCIA
    //ASIGNA EL PAQUETE A UN USUARIO SI TIENE EL MISMO EMAIL DE DESTINATARIO
    public static void insertaPaqueteCuentas() {
        insertaPaq1();
        insertaPaq2();
    }

    public static void insertaPaq1() {
        if (destinatario.compruebaRegistroPaquete(jefe.getPaq1())) {
            paqueteModificar = jefe.getPaq1();
            usuarioGeneral = destinatario.registrarPaqueteAuto(jefe.getPaq1());
            if (usuarioGeneral != null) {
                Mensajes.enviarMensaje(usuarioGeneral.getEmail(), "FernanPaaq te avisa",
                        PlantillaAsignaCorreo.generaPlantillaCambiaEstado(usuarioGeneral.getNombre(), paqueteModificar.getNombreDestinatario(), paqueteModificar.getNumeroSeguimiento(),
                                paqueteModificar.fechaEntregaEstimada(4), paqueteModificar.getEstado(), paqueteModificar.getDireccionEntrega(),
                                paqueteModificar.getLocalidad(), paqueteModificar.getProvincia()));
            }
            if (conductor.provinciaSi(jefe.getPaq1().getProvincia())) {
                conductorGeneral = conductor.compruebaProvincia(jefe.getPaq1().getProvincia());
                try {
                    MensajeTelegram.enviaMensajeTelegram(MensajeTelegram.mensajePredeterminado(paqueteModificar.getNumeroSeguimiento(),
                            paqueteModificar.getEstado(), conductorGeneral.getNombre(), paqueteModificar.fechaEstimadaCorreo()));
                } catch (IOException e) {
                    System.out.println("""
                            ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                            │   Se ha producido un error al enviar el aviso a telegram  │
                            └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                            """);
                }
                conductor.asignarPaquetesAutoConductor(jefe.getPaq1());
                jefe.liberarPaquetes();
                jefe.cambiaInfo();

            }
        }
    }

    public static void insertaPaq2() {
        if (destinatario.compruebaRegistroPaquete(jefe.getPaq2())) {
            paqueteModificar = jefe.getPaq2();
            usuarioGeneral = destinatario.registrarPaqueteAuto(jefe.getPaq1());
            if (usuarioGeneral != null) {
                System.out.println("Procesando aviso al conductor y al destinatario");
                Mensajes.enviarMensaje(usuarioGeneral.getEmail(), "FernanPaaq te avisa",
                        PlantillaAsignaCorreo.generaPlantillaCambiaEstado(usuarioGeneral.getNombre(), paqueteModificar.getNombreDestinatario(), paqueteModificar.getNumeroSeguimiento(),
                                paqueteModificar.fechaEntregaEstimada(4), paqueteModificar.getEstado(), paqueteModificar.getDireccionEntrega(),
                                paqueteModificar.getLocalidad(), paqueteModificar.getProvincia()));
            }
            if (conductor.provinciaSi(jefe.getPaq2().getProvincia())) {
                conductorGeneral = conductor.compruebaProvincia(jefe.getPaq1().getProvincia());
                try {
                    MensajeTelegram.enviaMensajeTelegram(MensajeTelegram.mensajePredeterminado(paqueteModificar.getNumeroSeguimiento(),
                            paqueteModificar.getEstado(), conductorGeneral.getNombre(), paqueteModificar.fechaEstimadaCorreo()));
                } catch (IOException e) {
                    System.out.println("""
                            ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                            │ Se ha producido un error al enviar el aviso al conductor  │
                            └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                            """);
                }
                conductor.asignarPaquetesAutoConductor(jefe.getPaq2());
                System.out.println("Aviso procesado correctamente ");
                jefe.liberarPaquetes();
                jefe.cambiaInfo();

            }
        }
    }

    //COMPRUEBA SI UN PAQUETE NO TIENE EL NºSEGUIMIENTO REPETIDO
    public static void compruebaNumSeguimiento() {
        if (jefe.getPaq2() != null) {
            destinatario.comprobarSeguimientoPaq(jefe.getPaq2().getNumeroSeguimiento());
            jefe.comprobarSeguimientoPaq(jefe.getPaq2().getNumeroSeguimiento());
        } else if (jefe.getPaq1() != null) {
            destinatario.comprobarSeguimientoPaq(jefe.getPaq1().getNumeroSeguimiento());
            jefe.comprobarSeguimientoPaq(jefe.getPaq1().getNumeroSeguimiento());
        }
    }
    //OPCION 2 DEL ADMIN

    //BUSCA PAQUETE SIN ASIGNAR A UN CONDUCTOR
    public static void buscaPaqSinConduct() {
        System.out.println(jefe.pintaPaquetesParaAsignar());
        if (!(jefe.pintaPaquetesParaAsignar().equals("No hay paquetes para mostrar"))) {
            try {
                System.out.print("Seleccione el envío a asignar: ");
                op = Integer.parseInt(S.nextLine());
                switch (op) {
                    case 1:
                        if (jefe.getPaq1().getNombreConductor() == null)
                            paqueteModificar = jefe.getPaq1();
                        break;
                    case 2:
                        if (jefe.getPaq2().getNombreConductor() == null)
                            paqueteModificar = jefe.getPaq2();
                        break;
                    default:
                        paqueteModificar = null;
                        System.out.println("""
                                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                                │   Error al seleccionar un envío  │
                                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                                """);
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("""
                        ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                        │   Error: Tienes que introducir un número  │
                        └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                        """);
            }
            System.out.println(conductor.pintaHistoricoConductor1());
            System.out.println(conductor.pintaHistoricoConductor2());
            System.out.println(conductor.pintaHistoricoConductor3());
            System.out.println("Seleccione un conductor: ");
            int opConductor = Integer.parseInt(S.nextLine());
            asignaConductor(opConductor);

        }
    }


    //ASIGNA PAQUETE
    public static void asignaConductor(int opConductor) {
        if (!(conductor.pintaHistoricoConductor1().equals("No hay conductores disponibles"))) {
            switch (opConductor) {
                case 1, 2, 3:
                    userLogueadoConductor = conductor.seleccionarConductor(opConductor);
                    break;
                default:
                    System.out.println("""
                            ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                            │   Error:No se ha podido seleccionar un conductor  │
                            └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                            """);
                    break;
            }
            if (userLogueadoConductor != null) {
                int diasEntrega;
                try {
                    System.out.print("Asignado a " + userLogueadoConductor.getNombre() + ", " +
                                     "indica los dias aproximados para realizar la entrega: ");
                    diasEntrega = Integer.parseInt(S.nextLine());
                    if (paqueteModificar != null) {
                        paqueteModificar.setDiasEntrega(diasEntrega);
                        System.out.println("La entrega estimada será: " + paqueteModificar.fechaEntregaEstimada(diasEntrega));
                    }
                    userLogueadoConductor.addPaqueteConductor(paqueteModificar);
                    System.out.println("Procesando aviso al conductor...");
                    try {
                        MensajeTelegram.enviaMensajeTelegram(MensajeTelegram.mensajePredeterminado(paqueteModificar.getNumeroSeguimiento(),
                                paqueteModificar.getEstado(), userLogueadoConductor.getNombre(), paqueteModificar.fechaEntregaEstimada(diasEntrega)));
                    } catch (IOException e) {
                        System.out.println("""
                                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                                │  Error al enviar mensaje al conductor  │
                                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                                """);
                    }
                    if (paqueteModificar != null) {
                        paqueteModificar.addNombreConductor(userLogueadoConductor.getNombre());
                        destinatario.registrarPaqueteAuto(jefe.getPaq1());
                        destinatario.registrarPaqueteAuto(jefe.getPaq2());
                        System.out.println("Aviso procesado correctamente.");
                        jefe.liberarPaquetes();
                        jefe.cambiaInfo();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("""
                            ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                            │  Error:Debes introducir un número  │
                            └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                            """);
                }
            }
        } else System.out.println("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                │  Error:No hay conductores registrados  │
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                """);
    }

    //OPCION 3
    public static void muestraUsuariosAdmin() {
        System.out.println("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                │ Información sobre los usuarios registrados   │
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                """);
        System.out.println(destinatario.pintaUsuarios());
        System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄ ");
        Utils.pulsaParaContinuar();
    }

    //OPCION 4
    //COMPRUEBA SI HAY PAQUETES GUARDADOS Y LOS MUESTRA
    public static void compruebaPaqMostrar() {
        if (!(jefe.pintaPaqAdmin().equals("No hay paquetes para mostrar"))) {
            System.out.println(jefe.pintaPaqAdmin());
        }
        if (conductor.getConductor() != null) {
            System.out.println(conductor.pintaPaquetesCon1());
        }
        if (conductor.getConductor2() != null) {
            System.out.println(conductor.pintaPaquetesCon2());
        }
        if (conductor.getConductor3() != null) {
            System.out.println(conductor.pintaPaquetesCon3());
        }
        if (jefe.pintaPaqAdmin().equalsIgnoreCase("No hay paquetes para mostrar") && (conductor == null || conductor.pintaHistoricoConductor1().equals(" ")) &&
            (conductor == null || conductor.pintaHistoricoConductor2().equals(" ")) && (conductor == null || conductor.pintaHistoricoConductor3().equals(" "))) System.out.println("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                │  No hay paquetes para mostrar  │
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                """);
    }

    //FUNCIONAMIENTO DE LA OPCION 4
    public static void muestraPaquetesAdmin() {
        System.out.println("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                │  Información sobre los paquetes registrados  │
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                """);
        compruebaPaqMostrar();
        System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄ ");
        Utils.pulsaParaContinuar();
    }

    // OPCION 5
    public static void pintaInfoConductores() {
        System.out.println("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                │     Información sobre los conductores     │
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                """);
        System.out.println(conductor.pintaConductores());
        System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄ ");
        Utils.pulsaParaContinuar();
        Utils.limpiarPantalla();
    }

    //OPCION 6
    public static void menuModificaAdmin() {
        op = pintaModifAdmin();
        switch (op) {
            case 1: //Cambia la clave
                System.out.println(jefe.cambiaClave(nuevaClave()));
                break;
            case 2:
                System.out.println(jefe.cambiaNombre(nuevoNombre()));
                break;
            case 3: //Sale y se dirige al menú de login del admin
                Utils.salirOpcion();
                break;
            default:
                System.out.println("""
                        ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                        │ No existe esa opción   │
                        └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                        """);
                break;
        }
    }

    //TODO: FUNCION QUE PREGUNTA AL CLIENTE SI NECESITA INSERTAR DATOS DE PRUEBA
    public static boolean compruebaRespuesta() {
        String respuesta;
        System.out.println("""
                ┌▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀┐
                │  ¿Quieres datos de prueba? (S para aceptar)  │
                └▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄┘
                """);
        respuesta = S.nextLine();
        if (respuesta.equalsIgnoreCase("s")) return true;
        else return false;
    }

    public static String insertaDatos(boolean compruebaRespuesta) {
        if (compruebaRespuesta) {
            destinatario.insertarUsuario("maariiaa1912@gmail.com", "1234", "Maria", 625178025);
            conductor.insertarConductor("conductor1@gmail.com", "1234", "Jaen", "Paco", 666666666);
            jefe.addPaquete("maariiaa1912@gmail.com", "Maria", "Málaga, 11", "Martos", "Jaen");
            return """
                ┌══════════════════════════════════════════════┐
                   Email usuario normal: maariiaa1912@gmail.com
                   Clave: 1234
                └══════════════════════════════════════════════┘
                ┌══════════════════════════════════════════════┐
                   Email conductor: conductor1@gmail.com
                   Clave: 1234
                └══════════════════════════════════════════════┘
                """;
        }
        return "No se han añadido datos de prueba";
    }
}