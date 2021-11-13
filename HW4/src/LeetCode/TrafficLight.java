package LeetCode;
// traffic light controlled intersection
public class TrafficLight {
    int isGreen;
    public TrafficLight() {
        this.isGreen = 1;
    }
    public void carArrived(
            int carId,
            int roadId,
            int direction,
            Runnable turnGreen,
            Runnable crossCar
    ) {
        synchronized(this) {
            if (isGreen != roadId) {
                turnGreen.run();
                isGreen = roadId;
            }
            crossCar.run();
        }
    }
}
