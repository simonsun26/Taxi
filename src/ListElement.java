public class ListElement {
    private String content;
    private ListElement next;

    public ListElement(String a) {
        if (a == null || a.equals("")) {
            throw new IllegalArgumentException("content must not be null");
        }
        this.content = a;
    }

    public String getContent() {
        return content;
    }

    public ListElement getNext() {
        return next;
    }

    public void setContent(String a) {
        if (a == null || a.equals("")) {
            throw new IllegalArgumentException("content must not be null or empty");
        }
        this.content = a;
    }

    public void setNext(ListElement a) {
        this.next = a;
    }
}
