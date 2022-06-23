import java.util.Arrays;
import java.util.Stack;
// todo. Queue로도 해보기

// Stack에 행, 열을 넘겨주기 위한 Position class 작성
class Position {
    int row;
    int col;

    Position() {
        this.row = 0;
        this.col = 0;
    }

    Position(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class main0511 { // DFS, BFS 실습
    // dfs(start 행, start 열, 입력할 배열, 방문했는지 확인, 채울 숫자
    static void dfs(int startRow, int startCol, int[][] input,
                    int[][] visit, int n_group) {
        // 여기서 바뀌면 메인에서도 바뀜
        // visit배열이 복사되서 넘어가는게 아니고 레퍼런스가 넘어가서 그래
        // 확인해보자
        // visit[0][0] = 999;

        // 행과 열을 저장할 수 있는 클래스를 하나 만들어서
        // 그 객체를 stack이든 queue든 집어넣을 것이다. ==> class Position
        // 왜? int 두 개를 stack(or queue)에 동시에 담을 수 없기 때문에

        Stack<Position> stack = new Stack<>(); // Position을 담을 수 있는 스택을 하나 만들었다.
        Position start = new Position(startRow, startCol); // start 객체 하나 생성(행, 열)
        stack.push(start); // start Position을 stack에 집어넣고 시작

        // stack이 empty가 될 때까지 돌릴거야
        while(stack.empty() == false) {
            // 스택에서 하나 꺼내고
            Position curPos = stack.pop();

            // 방문 처리하고 ==> visit 배열에 값을 써주는게 방문 처리
            // visit[curPos.row][curPos.col] = n_group; // 길어서 변수 선언해서 씀..
            int row = curPos.row;
            int col = curPos.col;
            visit[row][col] = n_group;

            // 연결된 노드가 있으면 넣는다. ==> 상하좌우 다 체크해야함
            // 상 : row - 1, col ==> row가 0보다 작아지면 안돼(out of range) ==> 예외처리
            if (row - 1 >= 0) {
                if (input[row-1][col] == 1 && visit[row-1][col] == 0) {
                    // 위에 집도 있고 방문도 안했으면 stack에 넣어준다.
                    stack.push(new Position(row - 1, col));
                }
            }
            // 하 : row + 1, col ==> input의 length (== mapSize, visit.length)넘어가면 안돼
            if (row + 1 < input.length) {
                if (input[row+1][col] == 1 && visit[row+1][col] == 0){
                    stack.push(new Position(row + 1, col));
                }
            }
            // 좌 : row, col - 1
            if (col - 1 >= 0) {
                if (input[row][col - 1] == 1 && visit[row][col - 1] == 0){
                    stack.push(new Position(row, col - 1));
                }
            }
            // 우 : row, col + 1
            if (col + 1 < input.length) {
                if (input[row][col + 1] == 1 && visit[row][col + 1] == 0){
                    stack.push(new Position(row, col + 1));
                }
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int mapSize = 7;
        int [][] input = {
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0}
        };

        // input 이랑 똑같은 크기의 배열이 필요하다.
        int [][] visit = new int[mapSize][mapSize];
        // 채울 수 ==> 단지의 수
        int n_group = 0; // n_group 은 증가하면서 칠해줄거야

        // i가 행, j가 열
        for (int i = 0; i < mapSize; ++i){
            for (int j = 0; j < mapSize; ++j) {
                if (input[i][j] == 1 && visit[i][j] == 0) {
//                    System.out.println(i + " " + j + "에서 탐색 시작");
                    dfs(i, j, input, visit, ++n_group);
                }
            }
        }
        // 2차원 행렬 찍을 때 deepToString 하면 2차원 배열 그대로 찍어줌
        // 2차원 배열의 경우 만약 Arrays.toString 하면 각 행의 주소가 찍힘
        // dfs(0, 0, input, visit, 0); // dfs 에서 visit[0][0] = 999로 바꿔 놨었음
        // System.out.println(Arrays.deepToString(visit));

        for (int i = 0; i < mapSize; ++i) {
            System.out.println(Arrays.toString(visit[i]));
        }
    }
}
