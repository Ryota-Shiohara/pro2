public class Bus extends Car {
    public Person[] passengers;
    private int totalFee;
    private int maxPassengers;
    private int passengersNum;
    
    Bus(int maxPassengers) {
        this.passengers = new Person[maxPassengers];
        this.maxPassengers = maxPassengers;
        this.passengersNum = 0;
    }

    private boolean canGetOn(int fee, int money) {
        if (fee > money) return false;
        if (passengersNum + 1 > maxPassengers) return false;
        return true;
    }

    private boolean isOnBus(Person person) {
        for (int i = 0; i < passengersNum; i++) {
            if (passengers[i] == person) return true;
        }
        return false;
    }

    public int getBusNum() {
        return num;
    }

    public void getOn(Person newPassenger) {
        int fee = newPassenger.getFee();
        int money = newPassenger.getMoney();
        String name = newPassenger.getName();
        if (!canGetOn(fee, money)) {
            System.out.println(name + " could not get on the bus");
            return;
        }
        totalFee += fee;
        newPassenger.changeMoney(fee);
        passengers[passengersNum] = newPassenger;
        passengersNum++;
        newPassenger.print();
        return;
    }

    public void getOff(Person getOffPassenger) {
        String name = getOffPassenger.getName();
        if (!isOnBus(getOffPassenger)) {
            System.out.println(name + " was not on the bus");
            return;
        }
        int i = 0;
        for (; passengers[i] != getOffPassenger; i++) {}
        for (; i + 1 < maxPassengers; i++) {
            passengers[i] = passengers[i+1];
        }
        passengersNum--;
        System.out.println(name + "got off the bus");
        return;
    }

    public void printAllPassengers() {
        String name;
        Person passenger;
        for (int i = 0; i < passengersNum; i++) {
            passenger = passengers[i];
            name = passenger.getName();
            System.out.println(name);
        }
    }

    public void printTotalFee() {
        System.out.println(totalFee);
    }

}
