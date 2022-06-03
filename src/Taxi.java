public class Taxi {
    Human driver;
    Human[] passengers = new Human[4]; 

    public Taxi(Human one) {
        driver = one;
    }

    public String getDriverName() {
        return driver.toString();
    }

    public void add(Human one) {
        if (passengers[3] != null) {
            System.out.println("We are sorry, " + one.toString() + ". The taxi is full.");
            return;
        }
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = one;
                System.out.println(one.toString() + " gets in.");
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
        
        return "This is the taxi of " + driver.toString() + ". He takes " + pass_info + " along.";
    }

    public Human[] allGetOut() {
        if (passengers[0] == null) {
            Human[] temp_empty = new Human[0];
            return temp_empty;
        }
        int n = 0;
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                n = i;
            }
        }
        Human[] temp_getout = new Human[n+1];
        for (int i = 0; i < temp_getout.length; i++) {
            temp_getout[i] = passengers[i];
        }
        passengers = new Human[4];
        return temp_getout;
    }

    public static void main(String[] args) {
        Human juergen = new Human("Juergen", "Staub");

        Human andrea = new Human("Andrea", "Bora");
        Human franzi = new Human("Franzi", "Ada");
        Human leah = new Human("Leah", "Posh");
        Human susi = new Human("Susi", "Fresh");
        Human lucky = new Human("Lucky", "Fuke");
        
        Taxi taxi = new Taxi(juergen);
        
        taxi.add(andrea);
        taxi.add(franzi);
        taxi.add(leah);
        taxi.add(susi);
        taxi.add(lucky);
        
        System.out.println(taxi);
    }
}