package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class StackShould {

    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void throw_stack_empty_exception_if_popped_when_empty() {
        //given
        //when
        //then
        Assertions.assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void pop_the_last_element_pushed() {
        //given
        stack.push("test");
        stack.push("test2");
        //when
        //then
        Assertions.assertEquals(stack.pop(),"test2");
    }
}
