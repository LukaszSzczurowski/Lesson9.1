public class HardDisc extends Components {
    private int capacity;

    public HardDisc(String name, String producer, String id, int capacity) {
        super(name, producer, id);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dysk " + getName() + ", marki " + getProducer() + ", id " + getId() + ", pojemność " + capacity + "\n");

        return sb.toString();
    }
}
