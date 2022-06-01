public class Leet {
    public static String[] normal = new String[] {"elite", "cool", "!", "ck", "ers", "er", "en", "e", "t", "o", "a"};
    public static String[] leet = new String[] {"1337", "k3wl", "!!!11", "xx", "0rz", "0rz", "n", "3", "7", "0", "@"};

    public static String toLeet(String a) {
        String b = "";
        b = a;
        for (int j = 0; j < 11; j++) {
            b = b.replace(normal[j], leet[j]);
        }
        return b;
    }
    
    public static String[] allToLeet(String[] normals) {
        String[] norm_temp = new String[normals.length];
        for (int i = 0; i < normals.length; i++) {
            String c = "";
            c = normals[i];
            for (int j = 0; j < 11; j++) {
                c = c.replace(normal[j], leet[j]);
            }
            norm_temp[i] = c;
        }
        return norm_temp;
    }

    public static void main(String[] args) {
        String[] test1 = {"!", "elite", "ers"};
        System.out.println(allToLeet(test1)[2]);
    }
    
}
