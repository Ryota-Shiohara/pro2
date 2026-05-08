public abstract class Person {
    private String name;
    private int money;

    Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    };

    public int getMoney() {
        return money;
    };

    public void changeMoney(int usedMoney) {
        money -= usedMoney;
    };

    public void print() {
        System.out.println(name + " now has " + money + " yen");
    };

    abstract int getFee();
    
}
