public class ListElement {
    private String content;
    private String next;
    public ListElement(String a){
        if (a == null) {
            throw new IllegalArgumentException("content must not be null");
        }
        content = a;
    }

    public String getContent() {
        return content;
    }

    public String getNext() {
        return next;
    }

    public void setContent(String a) {
        content = a;
    }

    public void setNext(String a) {
        next = a;
    }

}
