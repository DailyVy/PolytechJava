// 괄호 짝 맞추기
public class Homework {


    int answer(String bracket, int num) {
        ArrayStack<Integer> openStack = new ArrayStack<>(bracket.length());
        char open = '(';
        char close = ')';
        int open_hit = 0;
        int location = 0;
        int numPop;
        int result = 0;

        for(int i = 0; i < bracket.length(); i++) {
            if (bracket.charAt(i) == open) {
                openStack.push(++open_hit); // 열린 괄호가 나오면 숫자를 1부터 push한다.
                ++location; // return할 값인 location은 한칸씩 이동한다(열린 괄호든 닫힌 괄호든)
            }
            else if (bracket.charAt(i) == close) {
                try{
                    numPop = openStack.pop(); // 닫힌 괄호가 나오면 숫자를 pop 한다.
                    ++location; // return할 값인 location은 한칸씩 이동한다(열린 괄호든 닫힌 괄호든)
                    if(numPop == num) { // pop한 숫자가 우리가 원하는 열린괄호의 위치와 같으면
                        result = location; // 그 때의 location을 result로 받는다.
                    }
                }
                catch (NullPointerException e) {
                    // push한 열린괄호보다 pop하는 닫힌 괄호가 많아 pop을 할 수 없다면,
                    // 또는 맨 처음 나오는게 닫힌 괄호라면 pop을 할 수 없으니
                    return 0; // 0을 리턴한다.
                }

            }
        }
        if (openStack.isEmpty()) return result; // pop을 끝낸 stack이 비어있다면 result를 리턴한다.
        else return 0; // 만약 stack이 비어있지 않다면, 즉 열린괄호의 수가 닫힌 괄호의 수보다 많다면 0을 리턴한다.

    }


    public static void main(String[] args) {
        String temp1 = "()((()()))"; // 3번째 "("(여기서 4번째)는 9번째와 짝이된다. => return 9
        String temp2 = "))()(())"; // 짝이 맞지 않으므로 무효 => return 0
        String temp3 = "((())((()))(()))"; // 4번째 "("는  return 11
        String temp4 = "((()))(((";
        String temp5 = "))((";
        String temp6 = "((()))()()";
        String temp7 = "(())";

        Homework answer1 = new Homework();
        Homework answer2 = new Homework();
        Homework answer3 = new Homework();
        Homework answer4 = new Homework();
        Homework answer5 = new Homework();
        Homework answer6 = new Homework();
        Homework answer7 = new Homework();

        System.out.println(answer1.answer(temp1, 3));
        System.out.println(answer2.answer(temp2, 4));
        System.out.println(answer3.answer(temp3, 4));
        System.out.println(answer4.answer(temp4, 4));
        System.out.println(answer5.answer(temp5, 2));
        System.out.println(answer6.answer(temp6, 4));
        System.out.println(answer7.answer(temp7,1));
        System.out.println(answer1.answer(temp7,1)); // 이건 왜 9가 나오는거지? ==> 멤버변수라서 그렇다.

    }
}
