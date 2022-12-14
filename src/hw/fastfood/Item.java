package hw.fastfood;

// James Ding
public abstract class Item {

    private final double price, calories;

    public Item(double price, double calories) {
        this.price = price;
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", calories=" + calories +
                '}';
    }

}
