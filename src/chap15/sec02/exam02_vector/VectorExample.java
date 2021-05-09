package chap15.sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        List<Board> list = new Vector<Board>();

        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list.add(new Board("제목4","내용4","글쓴이4"));
        list.add(new Board("제목5","내용5","글쓴이5"));
        list.add(new Board("제목6","내용6","글쓴이6"));
        list.add(new Board("제목7","내용7","글쓴이7"));


        list.remove(2); // 2번 인덱스 삭제 (제목3) - 뒤의 인덱스 1씩 앞으로 당겨짐
        list.remove(2); // 2번 인덱스 삭제 (제목 4) - 뒤의 인덱스 1씩 당겨짐
        list.remove(3); // 3번 인덱스 삭제 (제목6)

        for (int i=0; i<list.size(); i++){
            Board  board = list.get(i);
            System.out.println(board.subject +"\t"+board.getContent() +"\t"+board.getWriter());
        }


    }
}
