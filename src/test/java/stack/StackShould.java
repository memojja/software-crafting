package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class StackShould {

    public static final String TEST = "test";
    public static final String TEST_2 = "test2";

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
        stack.push(TEST);
        stack.push(TEST_2);
        //when
        //then
        Assertions.assertEquals(stack.pop(),TEST_2);
    }

    @Test
    void pop_the_elements_reverse_order_they_were_pushed() {
        //given
        stack.push(TEST);
        stack.push(TEST_2);
        //when
        //then
        Assertions.assertEquals(stack.pop(), TEST_2);
        Assertions.assertEquals(stack.pop(),TEST);
    }
}
