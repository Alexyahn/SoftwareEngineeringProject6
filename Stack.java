// Stack.java

public class Stack<E> {
      private E array[];
      private int size;
      public Stack() {
            array = (E[]) new Object[20];
            size = 0;
      }

      // constructor taking an initial capacity
      public Stack(int capacity) {
            if (capacity < 0) {
                  array = (E[]) new Object[20];
            } 
			else {
                  array = (E[]) new Object[capacity];
            }
            size = 0;
      }

      // removes and returns the current top element
      public E pop() throws EmptyStackException {
            if (size == 0) {
                  throw new EmptyStackException();
            }
            E data = array[size - 1];
            size--;
            return data;
      }

      public E peek() throws EmptyStackException {
            if (size == 0) {
                  throw new EmptyStackException();
            }
            return array[size - 1];
      }

      // adds an element to the top
      public void push(E item) throws FullStackException {
            if (size == array.length) {
                  throw new FullStackException();
            }
            array[size] = item;
            size++;
      }

      public boolean empty() {
            return size == 0;
      }
}

class FullStackException extends Exception {
      public FullStackException() {
            super("Stack is full!");
      }
}

class EmptyStackException extends Exception {
      public EmptyStackException() {
            super("Stack is empty!");
      }
}