class CelestialBody {
    private String name;
    private int coordinateX;
    private int coordinateY;

    public CelestialBody(String name, int coordinateX, int coordinateY) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
}

class Planet extends CelestialBody {
    public Planet(String name, int coordinateX, int coordinateY) {
        super(name, coordinateX, coordinateY);
    }
}

class SpaceStation extends CelestialBody {
    public SpaceStation(String name, int coordinateX, int coordinateY) {
        super(name, coordinateX, coordinateY);
    }
}