public class Human {
    boolean humanHaveSoul;
    int attractivenessScore;
    double strength;

    public Human(boolean humanHaveSoul, int attractivenessScore, double strength){
        this.humanHaveSoul = humanHaveSoul;
        this.attractivenessScore = attractivenessScore;
        this.strength = strength;
    }

    public Human(int attractivenessScore, double strength){
        this.attractivenessScore = attractivenessScore;
        this.strength = strength;
        humanHaveSoul = true;
    }

    public String info() {
        return humanHaveSoul + "\n" + attractivenessScore + "\n" + strength + "\n";

    }


}
