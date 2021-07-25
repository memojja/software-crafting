# Software Crafting Training Notes

These notes taken from Sandro Mancuso's training who author of The Software Craftsman: Professionalism, Pragmatism, Pride.
This course includes flowing contents

+ TDD Lifecycle and Naming
+ Classicist TDD
+ Outside-In TDD
+ Acceptance tests
+ Testing & Refactoring Legacy Code

## Tdd - Stack Kata

1. ####Test Names

```java 
    @Test
    void pop_the_last_element_pushed();
    
    @Test
    void pop_the_elements_reverse_order_they_were_pushed();
    
    @Test
    void throw_stack_empty_exception_if_popped_when_empty();
````
+  The test names describe the behavior of the class, from a `client's` perspective.  They do not describe `internal behavior` ( i.e. add item to tge top of the list, removing item from the list etc.)
+  Test names clearly explain the behavior of a Stack, even for those who are not so technical.
+  Domain language used in the name of the methods: pop and push. They are both used as verb.

2. #### Exception Name

```java 
if (elements.isEmpty()){
     throw new EmptyStackException();
}
````

+  Exceptions are part of the contract. It allows client to understand what went wrong.
+  Exceptions should be clear enough to avoid to developers to have to debug the code. They should not look inside our code in order to understand what went wrong.
3. #### Constants & Clean Tests

````java
    public static final String TEST = "test";
    public static final String TEST_2 = "test2";
````

+  Constants are used to clarify intent, not optimise the code.
+  Variable declarations are removed from the test method. They crate a lot of noise.
+  Only code that is important for the test remains in the test. Everything else is removed.
+  Tests must tell a story and be very focused.

4. #### Consistency
+ **Elements:** Name of parameters, constants, internal attributes uses the same language.

5. #### How many tests?

+ Enough so that you and your pair are confident you have all the functionality covered and a bug cannot be introduced without breaking a test.
+ Push 2, pop 3: This test should go green if introduced now. Every time a test goes green we should ask if we need the test. In doubt, write the test.
+ Don't over do it. We can make the last test to create random elements and then pop, instead of using only 2 elements. It is worthy? What is the likelihood of someone having the wrong implementation with the existing solution?


## Tdd - Roman Numerals Converter Kata
## Tdd with Mocks - Payment Service Kata
## Acceptance Tests - Bank Kata
