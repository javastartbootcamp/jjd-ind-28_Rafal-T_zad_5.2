package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(16, 60, 22);
        System.out.println(room.getRoomStatus());
        cooldownRoomAndGetStatus(room);
        System.out.println("Montujemy klimę");
        room.mountAirConditioner();
        cooldownRoomAndGetStatus(room);
        cooldownRoomAndGetStatus(room);
        System.out.println("Odmontuwujemy klimę");
        room.unmountAirConditioner();
        cooldownRoomAndGetStatus(room);
        System.out.println("Montujemy klimę");
        room.mountAirConditioner();
        cooldownRoomAndGetStatus(room);
        cooldownRoomAndGetStatus(room);
        cooldownRoomAndGetStatus(room);
        cooldownRoomAndGetStatus(room);
        cooldownRoomAndGetStatus(room);
    }

    private static void cooldownRoomAndGetStatus(Room room) {
        System.out.println(room.cooldownTemperatureInRoom());
        System.out.println(room.getRoomStatus());
    }
}
