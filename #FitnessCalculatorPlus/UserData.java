//Boo!!

package #FitnessCalculatorPlus;

public class UserData {
    private boolean weightAvailable;
	private double weight;
	private boolean heightAvailable;
	private double height;
	private boolean hipAvailable;
	private double hip;
	private boolean waistAvailable;
	private double waist;
	private boolean chestAvailable;
	private double chest;

    public void resetAvailability(){
        weightAvailable = false;
        heightAvailable = false;
        hipAvailable = false;
        waistAvailable = false;
        chestAvailable = false;
    }

    public boolean isWeightAvailable() {
        return weightAvailable;
    }

    public void setWeightAvailable(boolean weightAvailable) {
        this.weightAvailable = weightAvailable;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHeightAvailable() {
        return heightAvailable;
    }

    public void setHeightAvailable(boolean heightAvailable) {
        this.heightAvailable = heightAvailable;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHipAvailable() {
        return hipAvailable;
    }

    public void setHipAvailable(boolean hipAvailable) {
        this.hipAvailable = hipAvailable;
    }

    public double getHip() {
        return hip;
    }

    public void setHip(double hip) {
        this.hip = hip;
    }

    public boolean isWaistAvailable() {
        return waistAvailable;
    }

    public void setWaistAvailable(boolean waistAvailable) {
        this.waistAvailable = waistAvailable;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public boolean isChestAvailable() {
        return chestAvailable;
    }

    public void setChestAvailable(boolean chestAvailable) {
        this.chestAvailable = chestAvailable;
    }

    public double getChest() {
        return chest;
    }

    public void setChest(double chest) {
        this.chest = chest;
    }
}
