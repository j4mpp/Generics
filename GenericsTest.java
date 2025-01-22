public class GenericsTest {
    public static void main(String[] args) throws StackEmptyException, StackFullException {
        GenericsStack<String> stack = new GenericsStack();
        stack.push("Hallo");
        stack.push("Tschüss");
        System.out.println(stack.get(1));
        stack.pop();
        System.out.println(stack.get(1));

        GenericsStack<Integer> stack2 = new GenericsStack();
        stack2.push(1);
        stack2.push(2);
        String number = String.valueOf(stack2.get(0));
        System.out.println(number);
    }

}
