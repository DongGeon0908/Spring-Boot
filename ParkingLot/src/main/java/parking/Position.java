public class Position {
    private final Floor floor;
    private final Size size;
    private final Spot spot;

    public Position(Floor floor, Size size, Spot spot) {
        this.floor = floor;
        this.size = size;
        this.spot = spot;
    }

    public Size size() {
        return size;
    }
}
