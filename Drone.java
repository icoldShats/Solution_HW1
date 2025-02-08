package Dron;

abstract class Drone {
    private String id;
    private String status;
    private int cargoCapacity;
    private int currentCargoWeight;

    public Drone(String id, int cargoCapacity) {
        this.id = id;
        this.status = "IDLE";
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = 0;
    }

    public String getStatus() {
        return status;
    }

    public boolean loadCargo(int weight) {
        if (currentCargoWeight + weight > cargoCapacity) {
            return false;
        }
        currentCargoWeight += weight;
        return true;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract int calculateFlightTime();
}
