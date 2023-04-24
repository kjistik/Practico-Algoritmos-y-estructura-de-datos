import java.util.Scanner;

public class parteII {

    public static void main(String[] args) {
        final String[] incidente = { "vehículo", "lesiones", "materiales" };

        // crea un objeto de clase Scanner para captar el input del usuario

        Scanner input = new Scanner(System.in);


        // información del denunciante
        // nombre y apellido, número de DNI, teléfono, correo.

        String nombre = input.nextLine();
        String apellido = input.nextLine();
        long dni = input.nextLong();
        long teléfono = input.nextLong();
        String correo = input.nextLine();



        // informacion vehiculo asegurado
        // marca, modelo, año y patente

        String marca = input.nextLine();
        String modelo = input.nextLine();
        int año = input.nextInt();
        String patente = input.nextLine();

        // informacion del accidente
        // fecha, hora, lugar, descripcion y daños
        
        int fecha = input.nextInt();
        int hora = input.nextInt();
        String lugar = input.nextLine();
        String descripcion = input.nextLine();
        String daños = input.nextLine();

        // Información del tipo de daño
        // Vehículo (daños producidos a vehículos), Daños materiales (producidos a
        // vehículos) , lesiones (daños corporales producidos por terceros)

        Scanner incidentType = new Scanner(System.in);

        System.out.println("Seleccione Tipo de incidente");

        String incedentOpt = incidentType.nextLine();

        switch (incedentOpt) {
            case ("vehículo"):
                String notaDeFranquicia = incidentType.nextLine();
                String licenciaDeConducir = incidentType.nextLine();
                String tarjetaVerde = incidentType.nextLine();
                String fotosDelVehiculo = incidentType.nextLine();
                String PresupuestosDeReparacion = incidentType.nextLine();
                boolean seguro = incidentType.nextBoolean();
                if (seguro) {
                    String denunciaInterna = incidentType.nextLine();
                    String certCobertura = incidentType.nextLine();
                }
                break;
            case ("lesiones"):
                break;
            case ("materiales"):
            default:
                System.out.println("Opción invalida");
        }
        incidentType.close();
    }
}