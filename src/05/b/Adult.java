public class Adult extends Person {
    Adult(String name, int money) {
        super(name, money);
    }

    int getFee() {
        return  220;
    }
}
