class Drone {
    private String id;
    private int cargoCapacity;
    private int currentCargoWeight;

    public Drone(String id, int cargoCapacity) {
        this.id = id;
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = 0;
    }

    public boolean canCarry(int weight) {
        return currentCargoWeight + weight <= cargoCapacity;
    }

    public void loadCargo(int weight) {
        if (canCarry(weight)) {
            currentCargoWeight += weight;
        }
    }
}

class LightDrone extends Drone {
    public LightDrone(String id) {
        super(id, 50);
    }
}

class HeavyDrone extends Drone {
    public HeavyDrone(String id) {
        super(id, 200);
    }
}