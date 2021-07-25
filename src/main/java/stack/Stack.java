package stack;

import java.util.EmptyStackException;

public class Stack {
    private Object object = null;
    public Object pop() {
        if (object == null){
            throw new EmptyStackException();
        }
        return object;
    }

    public void push(String element) {
        this.object = element;
    }
}
