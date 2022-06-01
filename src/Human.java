public class Human {
    String name;
    String forename;
    public Human(String a, String b){
        forename = a;
        name = b;
    }
    public String getName() {
        return name;
    }
    public String getForename() {
        return forename;
    }
    public String toString() {
        return forename + " " + name;
    }
    // public static void main(String[] args) {
    //     Human juergen = new Human( "Juergen", "Staub" );
    //     System.out.println("This is " + juergen + ".");
    // }
}