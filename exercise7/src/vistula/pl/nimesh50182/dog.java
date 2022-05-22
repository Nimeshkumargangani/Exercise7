package vistula.pl.nimesh50182;

public class dog extends mammal {
    private String breednimesh50182;

    dog() {
        super();
        breednimesh50182 = "NN";
    }

    public dog(String namenimesh50182, int agenimesh50182, int weightnimesh50182, String rzadnimesh50182, String breednimesh50182) {
        super(namenimesh50182, agenimesh50182, weightnimesh50182, rzadnimesh50182);
        this.breednimesh50182 = breednimesh50182;
    }

    public dog(int agenimesh50182, String rzadnimesh50182, String breednimesh50182) {
        super(agenimesh50182, rzadnimesh50182);
        this.breednimesh50182 = breednimesh50182;
    }

    public void sportnimesh50182() {
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void drinkMilknimesh50182() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoicenimesh50182() {
        System.out.println("The dog is barking.");
    }

    public String getBreednimesh50182() {
        return breednimesh50182;
    }

    public void setBreednimesh50182(String breednimesh50182) {
        this.breednimesh50182 = breednimesh50182;
    }

    @Override
    public String toString() {
        return "dog{" +
                "breednimesh50182='" + breednimesh50182 + '\'' +
                '}';
    }
}
