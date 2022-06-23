import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    // 2. Queue에 집어넣을(또는 Stack) 좌표 클래스를 만들어요
    private class Position {
        int row, col;
        Position() {
            row = 0; col = 0;
        }
        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    // 3. bfs 짭시다.
    // bfs 한 다음에 몇 개의 픽셀이 연결되었는지를 리턴할 것임
    //  어디서 시작했는지, row, col, 이미지, visit[][], 방문표시(뭘로 치리할건지)==n_group
    int bfs(Position start, int m, int n, int [][] picture, int [][] visit, int color) {
        int n_connect = 0; // 연결이 얼마나 됐는지 알아야겠지 ==> 리턴

        // start 좌표를 queue에 넣는다.
        // 4. Queue를 만듭시다.
        //  자바에서 Queue는 구현 안되어있대.. LinkedList로 해야한대
        //  Queue가 abstract 라서 그냥 사용할 수 없다고
        Queue<Position> q = new LinkedList<>();
        q.add(start);

        // 6. 상, 하, 좌, 우 순서로 볼 것
        int [] dy = {-1, 1, 0, 0};
        int [] dx = {0, 0, 1, -1};

        // 5. queue 가 빌 때까지~ 집어넣고 빼고 방뭄ㄴ처리하고
        while (!q.isEmpty()) { // q.isEmpty() == false
            // q에서 꺼내면 Position이 나오지
            // poll : 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환하고, 해당 요소를 큐에서 제거합니다
            Position curPos = q.poll();
            // 방문처리하기전에 예외처리 해주겠습니다.
            //  큐에 이미 있는데 방문 안해서 또 방문처리를 할 수 있단 말이야
            if (visit[curPos.row][curPos.col] != 0) continue; // 방문한거는 pass~

            // 첨 본것은 방문처리
            visit[curPos.row][curPos.col] = color; // color로 칠해준다.
            ++n_connect;

            // 연결된 것을 queue에 넣는다.
            //  연결이란? picture의 pixel값이 같은 것 ==> 6. 상하좌우 작성하고 와
            for (int i = 0; i < dx.length; ++i) {
                // 내 이웃의 좌표들(상, 하, 좌, 우)
                int row = curPos.row + dy[i];
                int col = curPos.col + dx[i];

                // 7. 예외처리, 이웃이 0보다 작아지면 안되고... 만약 이럴 경우 pass~
                if (row < 0 || col < 0 || row >= m || col >= n) continue;

                // 8. 내 이웃의 픽셀 값이 color와 같으면 연결된 것임! 그리고 방문한 적이 없어야..
                //  ==> queue에 집어넣어
                if (picture[row][col] == color && visit[row][col] == 0) {
                    q.add(new Position(row, col));
                }
            } // for 끝

        } //while 끝


        return n_connect;
    }
    public int[] solution(int m, int n, int[][] picture) { // m, n은 이미지의 크기
        int numberOfArea = 0; // 연결된 덩어리의 갯수
        int maxSizeOfOneArea = 0;
        // 1. int 의 visit 배열 만들기 ==> 방문체크 표시하려고
        int [][] visit = new int[m][n];

        // bfs 영역 값 받을 변수
        int area = 0;

        for (int row = 0; row < m; ++row) {
            for (int col = 0; col < n; ++col) {
                // 0이 아닌 픽셀을 만났고 방문하지 않았으면
                if (picture[row][col] != 0 && visit[row][col] == 0) {
                    // 여기서부터 BFS 시작하는거지
                    System.out.println("start BFS from (" + row + ", " + col + ")");
                    // 이제 BFS 짜면 돼 ==> numberOfArea 또는 pixel의 color(picture[row][col]를 넘겨줘도 됨
//                    bfs(new Position(row,col), m, n, picture, visit, picture[row][col]);
                    area = bfs(new Position(row,col), m, n, picture, visit, picture[row][col]);
                    // bfs 호출한 횟수가 덩어리의 횟수
                    ++numberOfArea;
                    // bfs 호출하면 영역의 크기(area)가 리턴되잖아, 그 중 제일 큰 값은 maxSizeOfOneArea
                    if (area > maxSizeOfOneArea) {
                        maxSizeOfOneArea = area;
                    }
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea; // 연결된 덩어리의 갯수
        answer[1] = maxSizeOfOneArea; // 제일 넓은 영역의 크기
        return answer;
    }
}

public class BFS0527 {
    public static void main(String[] args) {
        Solution bfs = new Solution();
        int m = 6, n = 4;
        int [][] apeach = {
                {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
                {0,1,1,1,1,2,1,1,1,1,2,1,1,1,1,0},
                {0,1,1,1,2,1,2,1,1,2,1,2,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,3,3,3,1,1,1,1,1,1,3,3,3,1,0},
                {0,1,1,1,1,1,2,1,1,2,1,1,1,1,1,0},
                {0,0,1,1,1,1,1,2,2,1,1,1,1,1,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0}
        };
        int [][] picture = {
                {1, 1, 1, 0},
                {1, 2, 2, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 3},
                {0, 0, 0, 3}};
        System.out.println(Arrays.toString(bfs.solution(m, n, picture)));
        System.out.println(Arrays.toString(bfs.solution(apeach.length, apeach[0].length, apeach)));
    }
}
