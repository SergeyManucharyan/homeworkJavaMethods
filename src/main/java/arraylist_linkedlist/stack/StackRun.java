package arraylist_linkedlist.stack;

public class StackRun {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        for (Integer el: stack.getList()) {
            System.out.print(el+" ");
        }
        System.out.println();
        stack.pop();
        stack.pop();
        for (Integer el: stack.getList()) {
            System.out.print(el+" ");
        }
        System.out.println();
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());

    }
}
