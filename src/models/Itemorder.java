package models;

public class Itemorder {
    Item it;
    int quantity;

    public Itemorder(Item it, int quantity) {
        this.it = it;
        this.quantity = quantity;
    }

    public Item getIt() {
        return it;
    }

    public void setIt(Item it) {
        this.it = it;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
