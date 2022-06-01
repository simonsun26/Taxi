public class Taxi {
    Human driver;
    Human[] passengers = new Human[4]; //just a test one

    public String getDriverName() {
        return driver.toString();
    }

    public void add(Human one) {
        if (passengers[3] != null) {
            System.out.println("We sorry!" + one.toString() + "!");
            return;
        }
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = one;
                System.out.println(one.toString() + "gets in!");
                return;
            };
        }
    }

    public String toString() {
        String toprint;
        String driver_mess = "This is the Taxi of " + driver.toString() + ". ";
        String pass_info = "";

        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                if (i == 0) {
                    pass_info = "nobody ";
                } else {
                    pass_info = pass_info + passengers[i].toString();
                }
            } else {
                pass_info = "nobody ";
            }
            

        //     if (passengers[0] == null) {
        //         pass_info = "nobody ";
        //         break;
        //     } else {
        //         if (passengers[i] != null) {
        //             if (i != 0) {
        //                 pass = pass + ", ";
        //             }
        //             pass = pass + passengers[i].toString();
        //         }
        //     }
        }
        return "This is the Taxi of " + driver.toString() + "He takes " + "along.";
    }

    public static void main(String[] args) {
       // 数组大小
       int size = 10;
       // 定义数组
       double[] myList = new double[size];
       myList[0] = 5.6;
       myList[1] = 4.5;
       myList[2] = 3.3;
       myList[3] = 13.2;
       myList[4] = 4.0;
       myList[5] = 34.33;
       myList[6] = 34.0;
       myList[7] = 45.45;
       myList[8] = 99.993;
       myList[9] = 11123;
       // 计算所有元素的总和
       double total = 0;
       for (int i = 0; i < size; i++) {
          total += myList[i];
       }
       System.out.println("总和为： " + total);
    }
 }