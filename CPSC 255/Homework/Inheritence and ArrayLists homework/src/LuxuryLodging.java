
public class LuxuryLodging extends Lodging {

    private int numberOfSpas = 1;

    public LuxuryLodging(String brand, int numberOfRooms) {
        super(brand, numberOfRooms);
    }
    public LuxuryLodging(String brand, int numberOfRooms, int numberOfSpas) {
        super(brand, numberOfRooms);
        this.numberOfSpas = numberOfSpas;
    }
    
    public void addSpa() {
        numberOfSpas ++;
    }
    
    public int getNumberOfSpas() {
        return numberOfSpas;
    }

    public void setNumberOfSpas(int num) {
        numberOfSpas = num;
    }
    

}
