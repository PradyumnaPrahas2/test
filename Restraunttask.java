public class Restraunttask {
    public static void main(String[] args) {
        Item[] items = new Item[3];
        items[0] = new Item("Manchurian", 200, 3);
        items[1] = new Item("Paneer Tikka", 350, 2);
        items[2] = new Item("Red Velvet", 160, 3);

        Restaraunt r = new Restaraunt("Mariott", items, 4.4f);
        r.showBill();
    }
}
class Item {
    String name;
    float price;
    int quantity;

    public Item(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void getDetails() {
        System.out.println(name + " - " + price + " x " + quantity);
    }

    public float getPrice() {
        return price * quantity;
    }
}

class Restaraunt {
    private String name;
    private float stars;
    private Item[] items;

    public Restaraunt(String name, Item[] items, float stars) {
        this.name = name;
        this.stars = stars;
        this.items = items;
    }

    public void showBill() {
        System.out.println("**** " + name + " (" + stars + ") ****");

        double total = 0;
        for (Item item : items) {
            item.getDetails();
            total += item.getPrice();
        }
        System.out.println("Total bill is: " + total);
    }
}