public interface Vehicle {

    double MAX_SPEED = 120;

    int getPlaces();

    void accelerate(double speed);
    void stop(double speed);
}
