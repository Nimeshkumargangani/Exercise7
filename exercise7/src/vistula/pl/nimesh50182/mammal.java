package vistula.pl.nimesh50182;

public class mammal extends animal {
    private String ordernimesh50182;

    public mammal() {
        super();
        ordernimesh50182 = "NN";
    }

    public mammal(String namenimesh50182, int agenimesh50182, int weightnimesh50182, String ordernimesh50182) {
        super(namenimesh50182, agenimesh50182, weightnimesh50182);
        this.ordernimesh50182 = ordernimesh50182;
    }

    public mammal(int agenimesh50182, String ordernimesh50182) {
        super(agenimesh50182);
        this.ordernimesh50182 = ordernimesh50182;
    }

    public void drinkMilknimesh50182() {
        System.out.println("Gulp gulp");
    }


    @Override
    public void getVoicenimesh50182() {
        System.out.println("Mammal is making sounds");
    }

    public String getOrdernimesh50182() {
        return ordernimesh50182;
    }

    public void setOrdernimesh50182(String ordernimesh50182) {
        this.ordernimesh50182 = ordernimesh50182;
    }

    @Override
    public String toString() {
        return "mammal{" +
                "ordernimesh50182='" + ordernimesh50182 + '\'' +
                '}';
    }
}
