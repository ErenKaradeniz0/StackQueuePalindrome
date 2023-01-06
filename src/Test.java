
public class Test {
    public static void main(String[] args) {
    System.out.println(isPalindrome("aba"));
    }

    static boolean isPalindrome(String str) {
        Queue<Character> aQueue = new Queue<Character>();
        Stack<Character> aStack = new Stack<Character>();
        int len = str.length();
        for (int i = 0;i<=len-1;i++){
            char nextChar = str.charAt(i);
            aQueue.enqueue(nextChar);
            aStack.push(nextChar);
        }
        boolean charactersAreEqual = true;
        while (!aQueue.isEmpty() && charactersAreEqual){
            char queueFront = aQueue.front();
            char stackTop = aStack.top();
            if (queueFront==stackTop){
                aQueue.dequeue();
                aStack.pop();
            }

            else charactersAreEqual = false;
        }
        return charactersAreEqual;
    }
}