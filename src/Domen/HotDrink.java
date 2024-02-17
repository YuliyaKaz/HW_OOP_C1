package Domen;

public class HotDrink extends Product {
    private int temperature;

    //Конструкторы
    public HotDrink(int price, int place, String name, long id) {
        super(price, place, name, id);
        this.temperature = 0;
    }

    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntemperature=" + this.temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
