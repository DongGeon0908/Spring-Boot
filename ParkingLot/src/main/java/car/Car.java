public class Car {
    private final Size size;
    private final Number number;

    public Car(Size size, Number number) {
        this.size = size;
        this.number = number;
    }

    public Size size() {
        return size;
    }
}
