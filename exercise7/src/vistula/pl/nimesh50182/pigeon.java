package vistula.pl.nimesh50182;

public class pigeon extends bird {
    private String speciesnimesh50182;

    pigeon() {
        super();
        speciesnimesh50182 = "NN";
    }

    public pigeon(String namenimesh50182, int agenimesh50182, int weightnimesh50182, String featherColornimesh50182, String speciesnimesh50182) {
        super(namenimesh50182, agenimesh50182, weightnimesh50182, featherColornimesh50182);
        this.speciesnimesh50182 = speciesnimesh50182;
    }

    public pigeon(int agenimesh50182, String featherColornimesh50182, String speciesnimesh50182) {
        super(agenimesh50182, featherColornimesh50182);
        this.speciesnimesh50182 = speciesnimesh50182;
    }

    public void peckingWoodnimesh50182() {
        System.out.println("The pigeon is pecking wood");
    }

    @Override
    public void getVoicenimesh50182() {
        System.out.println("The pigeon chirps");
    }

    public String getSpeciesnimesh50182() {
        return speciesnimesh50182;
    }

    public void setSpeciesnimesh50182(String speciesnimesh50182) {
        this.speciesnimesh50182 = speciesnimesh50182;
    }

    @Override
    public String toString() {
        return "pigeon{" +
                "speciesnimesh50182='" + speciesnimesh50182 + '\'' +
                '}';
    }
}
