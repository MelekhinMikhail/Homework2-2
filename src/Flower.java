import java.text.DecimalFormat;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = (flowerColor.isEmpty() || flowerColor.isBlank() || flowerColor == null) ? "белый" : flowerColor;
        this.country = (country.isEmpty() || country.isBlank() || country == null) ? "Россия" : country;
        this.cost = (cost <= 0) ? 1 : cost;
        this.lifeSpan = (lifeSpan <= 0) ? 3 : lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor(String flowerColor) {
        this.flowerColor = (flowerColor.isEmpty() || flowerColor.isBlank() || flowerColor == null) ? "белый" : flowerColor;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = (country.isEmpty() || country.isBlank() || country == null) ? "Россия" : country;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = (cost <= 0) ? 1 : cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = (lifeSpan <= 0) ? 3 : lifeSpan;
    }

    @Override
    public String toString() {
        return "Цветок: "+flowerColor+" , страна: "+country+" , цена: "+cost+" руб. , срок стояния: "+lifeSpan+" дней.";
    }
}
