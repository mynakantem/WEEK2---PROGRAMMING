class RestPerson {
    String name;
    int id;

    public RestPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends RestPerson implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is cooking delicious dishes.");
    }
}

class Waiter extends RestPerson implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    // Implementing the performDuties method
    @Override
    public void performDuties() {
        System.out.println(getName() + " is serving food to customers.");
    }
}

class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Creating objects of Chef and Waiter
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Alice", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
