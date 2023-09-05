public class Main {
    public static void main(String[] args) {
        Vehicle[] vehiculos = new Vehicle[2];

        vehiculos[0] = new Car(70);
        vehiculos[1] = new Motorbike(100);

        for (Vehicle vehiculo : vehiculos) {
            if (vehiculo instanceof Car) {
                System.out.println("Plazas del coche:  ");
                System.out.println(vehiculo.getPlaces());
                System.out.println("Velocidad del coche: ");
                System.out.println(((Car) vehiculo).getSpeed());
                System.out.println("El coche acelera a: ");
                vehiculo.accelerate(20);
                System.out.println(((Car) vehiculo).getSpeed());
                System.out.println("El coche frena: ");
                vehiculo.stop(40);
                System.out.println("Velocidad del coche: ");
                System.out.println(((Car) vehiculo).getSpeed());
            }
            if (vehiculo  instanceof Motorbike) {
                System.out.println("Plazas de la moto:  ");
                System.out.println(vehiculo.getPlaces());
                System.out.println("Velocidad de la moto: ");
                System.out.println(((Motorbike) vehiculo).getSpeed());
                System.out.println("La moto acelera a: ");
                vehiculo.accelerate(10);
                System.out.println(((Motorbike) vehiculo).getSpeed());
                System.out.println("La moto frena: ");
                vehiculo.stop(30);
                System.out.println("Velocidad de la moto: ");
                System.out.println(((Motorbike) vehiculo).getSpeed());
            }
        }
    }
}