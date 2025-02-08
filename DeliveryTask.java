class DeliveryTask {
    private CelestialBody origin;
    private CelestialBody destination;
    private Cargo cargo;
    private Drone assignedDrone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo, Drone assignedDrone) {
        this.origin = origin;
        this.destination = destination;
        this.cargo = cargo;
        this.assignedDrone = assignedDrone;
    }
}