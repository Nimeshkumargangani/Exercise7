package vistula.pl.nimesh50182;

public class fish extends animal {
    private String scaleColornimesh50182;

    public fish(Object o) {
        super();
        scaleColornimesh50182 = "NN";
    }

    public fish(String namenimesh50182, int agenimesh50182, int weightnimesh50182, String scaleColornimesh50182) {
        super(namenimesh50182, agenimesh50182, weightnimesh50182);
        this.scaleColornimesh50182 = scaleColornimesh50182;
    }

    public fish(int agenimesh50182, String scaleColornimesh50182) {
        super(agenimesh50182);
        this.scaleColornimesh50182 = scaleColornimesh50182;
    }

    public void drinkWaternimesh50182() {
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoicenimesh50182() {
        System.out.println("fish is making sounds");
    }

    public String getScaleColornimesh50182() {
        return scaleColornimesh50182;
    }

    public void setScaleColornimesh50182(String scaleColornimesh50182) {
        this.scaleColornimesh50182 = scaleColornimesh50182;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColornimesh50182='" + scaleColornimesh50182 + '\'' +
                '}';
    }
}
