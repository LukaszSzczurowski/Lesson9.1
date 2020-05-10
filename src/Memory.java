public class Memory extends Components implements Timing {
    private static final int TEMP_GROW_MEMORY = 15;

    private int memory;
    private int timingMemory;
    private double temperatureMemory;
    private double criticTemperatureMemory;

    public Memory(String name, String producer, String id, int memory, int timingMemory, double temperatureMemory, double criticTemperatureMemory) {
        super(name, producer, id);
        this.memory = memory;
        this.timingMemory = timingMemory;
        this.temperatureMemory = temperatureMemory;
        this.criticTemperatureMemory = criticTemperatureMemory;
    }

    @Override
    public void timingUp() {
        if (temperatureMemory >= criticTemperatureMemory) {
            System.out.println("Osiągnołeś maxymalny stopień podkręcenia karty. Temperatura krytyczna");
            temperatureMemory = criticTemperatureMemory;
        } else {
            temperatureMemory += TEMP_GROW_MEMORY;
            timingMemory += TIMING_UP;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pamięć RAM marki: " + getName() + ", producent: " + getProducer() + ", id: " + getId());
        sb.append(" .Taktowanie: " + timingMemory + ", temperatura: " + temperatureMemory + ", ograniczenie termiczne: " + criticTemperatureMemory + "\n");
        return sb.toString();
    }
}
