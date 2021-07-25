package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    private List<Object> elements = new ArrayList<>();

    public Object pop() {
        if (elements.isEmpty()){
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() -1);
    }

    public void push(String element) {
        elements.add(element);
    }
}
