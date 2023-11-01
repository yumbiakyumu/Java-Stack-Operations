import java.util.Stack;
class stackexample{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(15);
        stack.push(45);
        stack.push(54);
        stack.push(1);
        stack.push(2);
        stack.push(78);
        System.out.println("The elements in the stack are:" + stack);
        int size=stack.size();  //Size of the stack
        System.out.println("Size of the stack is: "+size);

        // Use pop() method to remove elements from the stack
        System.out.println("Poped out:"+stack.pop());
        System.out.println("Poped out:"+stack.pop());
        System.out.println("Poped out:"+stack.pop());
        // Display the stack after poping some elements
        System.out.println("After popping, The remaining elements in the stack are:"+stack);
        // Displaying the top element in the stack
        System.out.println("Top most element in the stack:"+stack.peek());
        // Check if the stack is empty or not
        boolean check=stack.empty();
        if (check==true){
            System.out.println("The stack is Empty");
            }else{
                System.out.println("The stack is Not Empty");
            }
        //or use a simpler method of checking if stack is empty
        System.out.println("Is empty:"+stack.empty());
        //Use push() method to add more elements into the stack
        stack.push(90);
        System.out.println("Added another element to the stack"+"\n"+ "New Elements in the stack:"+stack);
        //To check postion of new added element
        System.out.println("The element 90 is in position:"+stack.search(90));

    
    }
}