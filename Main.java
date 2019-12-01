import static org.junit.Assert.*;
import org.junit.Test;


public class Main {
      @Test
      public void testConstructors() {

            try {
                  Stack<Integer> stk = new Stack<Integer>();
                  for (int i = 0; i < 20; i++) {
                        stk.push(i);
                  }
                  stk = new Stack<Integer>(25);
                  for (int i = 0; i < 25; i++) {
                        stk.push(i);
                  }
            } catch (Exception e) {
                  fail(e.getMessage());
            }
      }
	  
      @Test
      public void testPushPop() {
            Stack<Integer> stack = new Stack<Integer>();
			
            try {
                  for (int i = 1; i <= 5; i++) {
                        stack.push(i);
                  }
                  for (int i = 5; i >= 1; i--) {
                        assertEquals(i, (int) stack.pop());
                  }
            }
			catch (Exception e) {
                  fail(e.getMessage());
            }
            try {
                  stack.pop();
                  fail("Should cause exception when pop is called on empty stack");
            }
			catch (EmptyStackException e) {
                  // test passed
            }
            stack = new Stack<Integer>(3);
            try {
                  for (int i = 0; i < 10; i++) {
                        stack.push(i);
                  }
                  fail("Should cause exception when push is called on full stack");
            }
			catch (FullStackException e) {
                  // test passed
            }
      }
	  
      @Test
      public void testPeek() {
            Stack<Integer> stack = new Stack<Integer>();
            for (int i = 0; i < 5; i++) {
                  try {
                        stack.push(i);
                        assertEquals(i, (int) stack.peek());
                  }
				  catch (Exception e) {
                        fail(e.getMessage());
                  }
            }
      }
	  
      @Test
      public void testEmpty() {
            Stack<Integer> stack = new Stack<Integer>();
            assertEquals(stack.empty(), true);
            try {
                  stack.push(1);
            }
			catch (FullStackException e) {
                  fail(e.getMessage());
            }
            assertEquals(stack.empty(), false);
      }
}