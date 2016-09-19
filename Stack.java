/**
 * Created by derek on 9/17/16.
 */
public class Stack<E> implements iStack<E> {
    //Variables
    private int size;
    private int topPos;
    private E[] data;

    //Constructor
    public Stack(){
        this(20);
    }
    public Stack(int size) {
        //Set the size and create the array
        this.size = size;
        this.topPos = -1;
        data = (E[]) new Object[size];
    }

    //Return the top element
    public E getTop() {
        return data[topPos];
    }
    //Return the size of the stack
    public int getSize() {
        return this.size;
    }

    //Push an element onto the top
    public void push(E element) {
        //Is the stack too large?
        if(topPos + 1 >= size){  //The stack is too full, we must create another
            //Create a temporary new stack
            data = replaceStack(data, data.length + size);
            System.out.println("Created new stack with size: " + data.length);
        }

        data[++topPos] = element;
        System.out.println("Pushed: " + element);
    }
    //Remove the top element
    public E pop() throws EmptyStackExcpetion {
        //Check if there is an element to pop
        if(topPos > -1) {
            System.out.println("Popped: " + data[topPos].toString());
            return data[--topPos];
        }else {   //No element to pop, throw exception
            throw new EmptyStackExcpetion();
        }
    }

    @Override
    public String toString(){
        //Loop through the stack and print each element
        String string = "";
        for(int i = 0;i < topPos + 1;i++){
            string += data[i].toString() + "\n";
        }

        return string;
    }

    //Create a stack and import all elements into it
    private E[] replaceStack(E[] oldStack, int size){
        E[] tempData = (E[]) new Object[size];

        //Transfer the elements of the old stack to the new
        for(int i = 0;i < oldStack.length;i++){
            tempData[i] = oldStack[i];
        }

        return tempData;
    }
}
