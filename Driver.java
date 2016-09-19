/**
 * Created by derek on 9/17/16.
 */
public class Driver {
    //The main driver of the program
    public static void main(String args[]){
        //Create the stack
        Stack stack = new Stack<Coordinate>(1);

        //Add the elements
        stack.push(new Coordinate(0, 0));
        stack.push(new Coordinate(0, 1));
        stack.push(new Coordinate(2, 0));

        //Show the stack
        System.out.print(stack.toString());

        //Pop the top element
        try {
            stack.pop();
        }catch(EmptyStackExcpetion ese){
            System.out.println("Exception: " + ese.getMessage());
        }

        //Show the stack
        System.out.print(stack.toString());
    }

}
