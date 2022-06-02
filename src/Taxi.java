public class Taxi {
    Human driver;
    Human[] passengers = new Human[4]; //just a test one

    public String getDriverName() {
        return driver.toString();
    }

    public void add(Human one) {
        if (passengers[3] != null) {
            System.out.println("We sorry!" + one.toString() + " not in!");
            return;
        }
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = one;
                System.out.println(one.toString() + " gets in!");
                return;
            };
        }
    }

    public String toString() {
        String pass_info = "";
        
        if (passengers[0] == null) {
            pass_info = "nobody";
        } else {
            int n = 0;
            for (int i = passengers.length - 1; i >= 0; i--) {
                if (passengers[i] != null) {
                    if (n == 1) {
                        pass_info = " and " + pass_info;
                    }
                    if (n > 1) {
                        pass_info = ", " + pass_info;
                    }
                    pass_info = passengers[i].toString() + pass_info;
                    n ++;
                }
            }
        }
        
        return "This is the Taxi of " + driver.toString() + ". He takes " + pass_info + " along.";
    }

    public static void main(String[] args) {
    Taxi onetaxi = new Taxi();
    onetaxi.driver = new Human("KK", "Alow");
    onetaxi.add(new Human("Pul", "Jin"));
    onetaxi.add(new Human("Ben", "Dog"));
    onetaxi.add(new Human("Ali", "Toa"));
    // System.out.println(onetaxi.getDriverName());
    // System.out.println(onetaxi.passengers[0].toString());
    System.out.println(onetaxi.toString());
    }
}