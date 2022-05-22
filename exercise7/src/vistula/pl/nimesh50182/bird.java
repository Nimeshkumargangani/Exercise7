package vistula.pl.nimesh50182;

public class bird extends animal {
    private String featherColornimesh50182;


    public bird() {
        super();
        featherColornimesh50182 = "NN";

    }

    public bird(String namenimesh50182, int agenimesh50182, int weightnimesh50182, String featherColornimesh50182) {
        super(namenimesh50182, agenimesh50182, weightnimesh50182);
        this.featherColornimesh50182 = featherColornimesh50182;
    }

    public bird(int agenimesh50182, String featherColornimesh50182) {
        super(agenimesh50182);
        this.featherColornimesh50182 = featherColornimesh50182;
    }

    public void takingflightnimesh50182() {
        System.out.println("Flap flap");
    }

    @Override
    public void getVoicenimesh50182() {
        System.out.println("bird is making sounds");
    }

    public String getFeatherColornimesh50182() {
        return featherColornimesh50182;
    }

    public void setFeatherColornimesh50182(String featherColornimesh50182) {
        this.featherColornimesh50182 = featherColornimesh50182;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColornimesh50182='" + featherColornimesh50182 + '\'' +
                '}';
    }
}
