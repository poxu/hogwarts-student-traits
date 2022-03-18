package pro.sky.student;

public class RavenclawStudent extends HogwartsStudent {
    private int intelligence;
    private int wisdom;
    private int smartness;
    private int creativity;

    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int smartness, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.smartness = smartness;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return getName() + ": magicPower=" + getMagicPower() +
                " transgressionDistance="+ getTransgressionDistance() +
                " intelligence=" + intelligence +
                " wisdom=" + wisdom +
                " smartness=" + smartness +
                " creativity=" + creativity
                ;
    }
}
