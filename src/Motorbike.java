public class Motorbike implements Vehicle{


    private int places;
    private int speed;

    public Motorbike(int speed) {
        this.speed = speed;
        this.places = getPlaces();
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int getPlaces() {
        return places = 2;
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
            System.out.println("La moto ya esta parada");
        } else {
            this.speed -= speed;
        }
    }


}
