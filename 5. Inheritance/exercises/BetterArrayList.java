package exercises;

import java.util.ArrayList;

public class BetterArrayList<T> extends ArrayList<T> {

    public T pop() {
        if(this.size() > 0) {
            T item = this.get(this.size() - 1);
            this.remove(this.size() - 1);
            return item;
        }
        return null;
    }

    public String printList() {
        String str = "";
        if(this.size() > 0) {
            for(T item : this) {
                str += item + "\n";
            }
        } else {
            str = "List is empty. There is nothing to print";
        }

        return str;
    }
}
