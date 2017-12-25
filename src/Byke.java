/**
 * Created by nibesh on 4/5/17.
 */
public abstract class Byke {
    protected int gears;
    protected String breakeType;
    protected String bykeName;
    protected double hornStrength;
    protected final int tyers=2;

    protected abstract void drive(double toKilometer);

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getBreakeType() {
        return breakeType;
    }

    public void setBreakeType(String breakeType) {
        this.breakeType = breakeType;
    }

    public String getBykeName() {
        return bykeName;
    }

    public void setBykeName(String bykeName) {
        this.bykeName = bykeName;
    }

    public double getHornStrength() {
        return hornStrength;
    }

    public void setHornStrength(double hornStrength) {
        this.hornStrength = hornStrength;
    }

    public int getTyers() {
        return tyers;
    }

    protected void displayByke(){

        System.out.println("Byke name is"+bykeName);
    }
}
