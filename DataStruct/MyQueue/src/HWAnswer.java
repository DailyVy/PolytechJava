import java.util.EmptyStackException;
import java.util.Stack;

// Homework 교수님 답안
public class HWAnswer {
    public static void main(String[] args) {
        String inputString = "((())))))";
        int n = 3;
        int ans = 0;

        // Stack이 필요합니다.
        Stack<Integer> stack = new Stack<>();
        // charAt(i) 말고 다른 걸 써봅시다.
        // toCharArray() : char 배열로 바꿔줌
        char[] inputArray = inputString.toCharArray(); // inputString을 char 배열로 바꿈

        int count = 0; // 열린괄호 count

        // 예외 발생할 수 있는 상황을 try문에 집어 넣는다.
        try {
            for(int i = 0; i < inputArray.length; ++i) {
                // 열린 괄호인지 닫힌 괄호인지 보고싶다.
                // 열린 괄호 나오면 push
                if(inputArray[i] == '(') {
                    stack.push(++count);
                }
                // 닫힌 괄호 나오면 pop
                else if (inputArray[i] == ')') {
                    int temp = stack.pop();
                    // 이 temp가 n 과 같으면 우리가 찾는 열린괄호다
                    if (temp == n) {
                        ans = i + 1; // 인덱스는 0부터 시작했으니까 ans = i + 1이지
                    }
                }
            }
        }
        // 예외를 잡으면 catch로~
        catch (EmptyStackException e) {
            // 에러 나면 ans는 0
            ans = 0;
        }
        // 예외가 발생하든 발생하지 않았든 finally는 돌게 되어있다.
        finally {
            // stack의 size가 0이상이면 ans는 0
            if (stack.size() > 0) ans = 0;
        }

        System.out.println("answer = " + ans);
    }
}
