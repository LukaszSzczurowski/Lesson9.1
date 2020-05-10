public class Computer {
    private Procesor procesor;
    private Memory memory;
    private HardDisc hardDisc;

    public Computer(Procesor procesor, Memory memory, HardDisc hardDisc) {
        this.procesor = procesor;
        this.memory = memory;
        this.hardDisc = hardDisc;
    }

    @Override
    public String toString() {
        return "" + procesor + memory + hardDisc;
    }
}
