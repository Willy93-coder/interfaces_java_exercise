public class Car implements Vehicle{

    private int places;
    private int speed;

    public Car(int speed) {
        this.places = getPlaces();
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int getPlaces() {
        return places = 5;
    }

    @Override
    public void accelerate(double speed) {
        if (this.speed > MAX_SPEED) {
            System.out.println("La velocidad maxima ha sido superada!!");
        } else {
            this.speed += speed;
        }
    }

    @Override
    public void stop(double speed) {
        if (this.speed == 0){
            System.out.println("El coche ya esta parado");
        } else {
            this.speed -= speed;
        }
    }


}
