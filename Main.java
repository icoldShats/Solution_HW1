class Main {
    public static void main(String[] args) {
        Drone drone1 = new LightDrone("1");
        Drone drone2 = new HeavyDrone("2");

        CelestialBody earth = new Planet("Earth", 0, 0);
        CelestialBody mars = new Planet("Mars", 100, 200);
        CelestialBody station = new SpaceStation("Alpha Station", 50, 75);

        Cargo cargo1 = new Cargo(30, "Medical Supplies");
        Cargo cargo2 = new Cargo(150, "Construction Materials");

        DeliveryTask task1 = new DeliveryTask(earth, mars, cargo1, drone1);
        DeliveryTask task2 = new DeliveryTask(station, earth, cargo2, drone2);
    }
}