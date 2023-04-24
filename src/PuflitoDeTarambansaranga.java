import java.util.Scanner;

public class PuflitoDeTarambansaranga {

    public static void main(String[] args) {
        final String[] incidente = { "vehículo", "lesiones", "materiales" };

        // crea un objeto de clase Scanner para captar el input del usuario

        Scanner input = new Scanner(System.in);

        // información del denunciante
        // nombre y apellido, número de DNI, teléfono, correo.

        System.out.print("Nombre:");
        String nombre = input.nextLine();
        System.out.print("\nApellido:");
        String apellido = input.nextLine();
        System.out.print("N° de documento:");
        long dni = Long.parseLong(input.nextLine());
        System.out.print("\nTeléfono de contacto:");
        long telefono = Long.parseLong(input.nextLine());
        System.out.print("\nCorreo:");
        String correo = input.nextLine();

        // informacion vehiculo asegurado
        // marca, modelo, año y patente

        System.out.print("\nMarca:");
        String marca = input.nextLine();
        System.out.print("\nModelo:");
        String modelo = input.nextLine();
        System.out.print("\nAño:");
        int anio = Integer.parseInt(input.nextLine());
        System.out.print("\nPatente:");
        String patente = input.nextLine();

        // informacion del accidente
        // fecha, hora, lugar, descripcion y daños

        System.out.print("\nFecha del siniestro:");
        int fecha = Integer.parseInt(input.nextLine());
        System.out.print("\nHora del siniestro:");
        int hora = Integer.parseInt(input.nextLine());
        System.out.print("\nLugar del hecho:");
        String lugar = input.nextLine();
        System.out.print("\nDescripción del hecho:");
        String descripcion = input.nextLine();
        System.out.print("\nDescripción de los daños:");
        String danos = input.nextLine();

        // Información del tipo de daño
        // Vehículo (daños producidos a vehículos), Daños materiales (producidos a
        // vehículos) , lesiones (daños corporales producidos por terceros)

        Scanner incidentType = new Scanner(System.in);

        System.out.println("Seleccione Tipo de incidente");

        int incidentOpt = Integer.parseInt(incidentType.nextLine());

        System.out.println("El denunciante, señor/a " + nombre + " " + apellido +
                ", DNI N°: " + dni + ". A ser contactado mediante el teléfono: " + telefono +
                " o la dirección de correo: " + correo
                + ", denuncia un siniestro ocurrido en relación a su vehículo marca: " +
                marca + ", modelo " + modelo + " año " + anio + " patente " + patente);

        System.out.println("Dicho vehículo se vio involucrado en un siniestro de tipo " + 
        incidente[incidentOpt] + " el día " + fecha + " a las " + hora + " en la localidad " +
        lugar);

        System.out.println("El hecho ocurrió de la siguiente manera, según descripto por el denunciante: " +
        "\"" + descripcion + "\" y ocasionó los siguientes daños, según la misma descripción" + " \"" + danos +
        "\"");

        incidentType.close();
        input.close();
    }
}