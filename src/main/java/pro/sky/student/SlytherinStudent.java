package pro.sky.student;

public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int ambition;
    private int powerLust;
    private int decisiveness;
    private int resourcefulness;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int ambition, int powerLust, int decisiveness, int resourcefulness) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.ambition = ambition;
        this.powerLust = powerLust;
        this.decisiveness = decisiveness;
        this.resourcefulness = resourcefulness;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    @Override
    public String toString() {
        return getName() + ": magicPower=" + getMagicPower() +
                " transgressionDistance="+ getTransgressionDistance() +
                " cunning=" + cunning +
                " ambition=" + ambition +
                " powerLust=" + powerLust +
                " decisiveness=" + decisiveness +
                " resourcefulness=" + resourcefulness
                ;
    }
}
