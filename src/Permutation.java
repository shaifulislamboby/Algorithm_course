import edu.princeton.cs.algs4.StdIn;

/**
 * Created by spec on 21.04.2017.
 */
public class ResizingArrayStackOfStrings {
String[] s;

    public ResizingArrayStackOfStrings() {
        s = new String[1];
    }

    public void push(String item) {

        if (N == s.length) resize(2 * s.length);
        s[N++] = item;
    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++) copy[i] = s[i];
        s = copy;
    }
}