public class PruebaHotel {
    public static void main(String[] args) {
        Habitacion habitacion1 = new HabitacionIndividual(101, 120.0, true);
        Habitacion habitacion2 = new HabitacionDoble(202, 180.0, 2);
        Suite suite1 = new Suite(501, 280.0, true);
        HabitacionFamiliar habitacionFamiliar1 = new HabitacionFamiliar(455, 130.0, 5);

        System.out.println("Information of the first room:");
        habitacion1.mostrarInformacion();

        System.out.println("Information of the second room:");
        habitacion2.mostrarInformacion();

        System.out.println("Suite information:");
        suite1.mostrarInformacion();

        System.out.println("Family room information:");
        habitacionFamiliar1.mostrarInformacion();

        int numNoches = 5;
        System.out.println("Total cost of stay in a single room per " + numNoches + " nights: $" + calcularCostoTotal(numNoches, habitacion1));
    }

    // Method to calculate the total cost of stay (Encapsulation)
    public static double calcularCostoTotal(int numNoches, Habitacion habitacion) {
        return numNoches * habitacion.getPrecioPorNoche();
    }
}


