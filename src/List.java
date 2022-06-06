public class List {
    private ListElement head;

    public void append(String a) {
        if (a == null || a.equals("")) {
            throw new IllegalArgumentException("content must not be null");
        }
        if (head == null) {
            head = new ListElement(a);
            return;
        }
        ListElement temp = head;
        while (true) {
            if (temp.getNext() == null) {
                break;
            } else {
                temp = temp.getNext();
            }
        }
        ListElement toset = new ListElement(a);
        temp.setNext(toset);
    }

    public String remove(String a) {
        if (a == null || a.equals("")) {
            throw new IllegalArgumentException("content must not be null");
        }
        if (head == null) {
            return null;
        }
        if (head.getContent() == a && head.getNext() == null) {
            head = null;
            return a;
        }
        ListElement temp = head;
        boolean flag = false;
        while (true) {
            if (temp.getNext() == null) {
                break;
            }
            if (temp.getNext().getContent() == a) {
                flag = true;
                break;
            }
            temp = temp.getNext();
        }

        if (flag) {
            ListElement toset = temp.getNext().getNext();
            temp.setNext(toset);
            return a;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        List mylist = new List();
        mylist.append("A");
        System.out.println(mylist.head.getContent());
    }
}
