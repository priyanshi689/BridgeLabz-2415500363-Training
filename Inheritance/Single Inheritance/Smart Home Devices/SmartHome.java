public class SmartHome {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("T101", "ON", 22.5);
        Thermostat t2 = new Thermostat("T102", "OFF", 18.0);

        t1.displayStatus();
        t2.displayStatus();
    }
}