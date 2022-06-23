//import java.util.Stack;
//
//public class bracketFind {
//    private String brackets;
//    int index;
//    int number;
//
//    bracketFind(int number, String brackets) {
//        //charAt() 메서드는 인덱스 값을 매개변수로 사용하고 문자열의 해당 인덱스에 있는 문자를 반환
//        this.brackets = brackets;
//        this.number = number;
//    }
//
//    int find() {
//        Stack<Character> stackB = new Stack<>();
//        if(brackets.charAt(number) == ')') {
//            return 0;
//        }
//
//        for (int i = 0; i < brackets.length(); ++i) {
//            char brack = brackets.charAt(i);
//            stackB.push(brack);
//        }
//
//        return index+1;
//    }
//    public static void main(String[] args) {
//        String temp = "))()(())";
//
//        bracketFind a = new bracketFind(2, temp);
//        System.out.println(a.find());
//    }
//}
