package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class StackShould {

    @Test
    void throw_stack_empty_exception_if_popped_when_empty() {
        //given
        //when
        //then
        Assertions.assertThrows(EmptyStackException.class, () -> new Stack().pop());
    }
}
