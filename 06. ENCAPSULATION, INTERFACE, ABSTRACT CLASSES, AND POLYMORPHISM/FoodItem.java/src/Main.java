interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    private double discountAmount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - discountAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discountAmount = (getPrice() * getQuantity()) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: ₹" + discountAmount;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 30.0; // fixed additional charge per item
    private double discountAmount = 0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + nonVegCharge) * getQuantity();
        return total - discountAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discountAmount = ((getPrice() + nonVegCharge) * getQuantity()) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: ₹" + discountAmount;
    }
}

class OnlineFoodDeliverySystem {

    public static void processOrder(FoodItem item, double discountPercent) {
        item.getItemDetails();
        if (item instanceof Discountable) {
            ((Discountable) item).applyDiscount(discountPercent);
            System.out.println(((Discountable) item).getDiscountDetails());
        }
        System.out.println("Total Price after discount: ₹" + item.calculateTotalPrice());
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 180, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 220, 1);

        processOrder(vegItem, 10);     // 10% discount
        processOrder(nonVegItem, 5);   // 5% discount
    }
}
