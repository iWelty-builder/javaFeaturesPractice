package CheckOut.CheckOut;

import java.util.LinkedList;
import java.util.Queue;

public class Checkout  {
    Queue<Integer> shopQueue = new LinkedList<Integer>();

    public Checkout() {

    }

    public int get_max() {
        if (shopQueue.isEmpty()) {
            return -1;
        }
        int max = shopQueue.peek();
        for (Integer i : shopQueue) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public void add(int value) {
        shopQueue.add(value);
    }

    public int remove() {
        if (shopQueue.isEmpty()) {
            return -1;
        }
        return shopQueue.remove();
    }

}

/*
  Your Checkout object will be instantiated and called as such:
  Checkout obj = new Checkout();
  int param_1 = obj.get_max();
  obj.add(value);
  int param_3 = obj.remove();
 */
