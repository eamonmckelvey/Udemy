package AbstractClasses;

public class NodeItem extends Node {

    public NodeItem(Object data) {
        super(data);
    }

    @Override
    Node nextItem() {

        // next item to the right
        return this.next;
    }

    @Override
    Node setNextItem(Node item) {

        // set right link to item passed
        this.next = item;
        return this.next;
    }

    @Override
    Node previousItem() {

        // item to the left (previous)
        return this.previous;
    }

    @Override
    Node setPreviousItem(Node item) {

        // set previous to item passed
        this.previous = item;
        return this.previous;
    }

    @Override
    int compareTo(Node item) {
        if (item != null) {
            return ((String) super.getData()).compareTo((String) item.getData());
        } else {
            return -1;
        }
    }

}