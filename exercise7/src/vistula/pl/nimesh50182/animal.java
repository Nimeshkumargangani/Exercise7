package vistula.pl.nimesh50182;

abstract class animal {
    private static String namenimesh50182;
    private static int agenimesh50182;
    private static int weightnimesh50182;

    public animal(String namenimesh50182, int agenimesh50182, int weightnimesh50182) {
        vistula.pl.nimesh50182.animal.namenimesh50182 = namenimesh50182;
        vistula.pl.nimesh50182.animal.agenimesh50182 = agenimesh50182;
        vistula.pl.nimesh50182.animal.weightnimesh50182 = weightnimesh50182;
    }

    public animal(int agenimesh50182) {
        vistula.pl.nimesh50182.animal.agenimesh50182 = agenimesh50182;
    }

    public animal() {
    }

    public abstract void getVoicenimesh50182();

    public String getNamenimesh50182() {
        return namenimesh50182;
    }

    public void setNamenimesh50182(String namenimesh50182) {
        this.namenimesh50182 = namenimesh50182;
    }

    public int getagenimesh50182() {
        return agenimesh50182;
    }

    public void setagenimesh50182(int agenimesh50182) {
        this.agenimesh50182 = agenimesh50182;
    }

    public int getWeightnimesh50182() {
        return weightnimesh50182;
    }

    public void setWeightnimesh50182(int weightnimesh50182) {
        this.weightnimesh50182 = weightnimesh50182;
    }
}
