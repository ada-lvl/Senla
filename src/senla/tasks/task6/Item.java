package senla.tasks.task6;

public class Item {
    private int Weight;
    private  int Value;

    public Item(int weight, int value) {
        Weight = weight;
        Value = value;
    }

    public Item() {
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }
}
