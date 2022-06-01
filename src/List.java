public class List {
    public ListElement head;
    public ListElement[] list_itself;

    public void append(String a) {
        if (a == null) {
            throw new IllegalArgumentException("content must not be null");
        }
        if (list_itself.length == 0) {
            // ListElement[] list_temp = new ListElement[list_itself.length+1];
            System.out.println("list_itself.length is 0!");
        }
        // head.setContent(a);
    }

    public static void main(String[] args) {
        List mylist = new List();
        mylist.append("A");
        // System.out.println(mylist.list_itself.length);
    }
}
