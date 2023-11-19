package pl.javastart.task;

public class Room {
    private final int minTemperature;
    private final int size;
    private int actualTemperature;
    private boolean airConditioner;

    public Room(int minTemperature, int size, int actualTemperature) {
        this.minTemperature = minTemperature;
        this.size = size;
        this.actualTemperature = actualTemperature;
    }

    public void mountAirConditioner() {
        this.airConditioner = true;
    }

    public void unmountAirConditioner() {
        this.airConditioner = false;
    }

    private boolean isAirConditionerMounted() {
        return airConditioner;
    }

    private boolean cooldownTemperature() {
        if (isAirConditionerMounted() && actualTemperature > minTemperature) {
            actualTemperature = actualTemperature - 1;
            return true;
        }
        return false;
    }

    public String cooldownTemperatureInRoom() {
        if (cooldownTemperature()) {
            return "Obniżono temperature o 1";
        } else {
            if (isAirConditionerMounted()) {
                return "Nie można obniżyć temperatury - osiągnięto minimalną temperaturę pokoju";
            } else {
                return "Nie można obniżyć temperatury - nie ma klimatyzatora";
            }
        }
    }

    public String getRoomStatus() {
        return "W pokoju o powierzchni " + this.size + " temperatura wynosi " + this.actualTemperature;
    }

}
