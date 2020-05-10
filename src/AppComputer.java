public class AppComputer {
    public static void main(String[] args) {
        Memory memory=new Memory("DDR3","Cat","940343",4000, 400,50,100);
        Procesor procesor = new Procesor("i5","Intel","32323",3500,60,100);
        HardDisc hardDisc = new HardDisc("Baracuda","Segate","0232",1500);

        Computer computer =new Computer(procesor,memory,hardDisc);
        System.out.println(computer);

        procesor.timingUp();
        procesor.timingUp();
        procesor.timingUp();
        procesor.timingUp();
        procesor.timingUp();
        System.out.println(computer);
    }
}
