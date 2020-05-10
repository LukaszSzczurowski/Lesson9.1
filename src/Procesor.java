public class Procesor extends Components implements Timing {

    private static final int TEMP_GROW_PROC = 10;

    private int timingProc;
    private double temperaturProc;
    private double criticTemperaturProc;

    public Procesor(String name, String producer, String id, int timingProc, double temperaturProc, double criticTemperaturProc) {
        super(name, producer, id);
        this.timingProc = timingProc;
        this.temperaturProc = temperaturProc;
        this.criticTemperaturProc = criticTemperaturProc;
    }

    @Override
    public void timingUp() {
        if (temperaturProc >= criticTemperaturProc) {
            System.out.println("Osiągnołeś maxymalny stopień podkręcenia procesora. Temperatura krytyczna");
            temperaturProc = criticTemperaturProc;
        } else {
            temperaturProc += TEMP_GROW_PROC;
            timingProc += TIMING_UP;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Procesor marki: " + getName() + ", producent: " + getProducer() + ", id: " + getId());
        sb.append(" .Taktowanie: " + timingProc + ", temperatura: " + temperaturProc + ", ograniczenie termiczne: " + criticTemperaturProc + "\n");
        return sb.toString();
    }
}
