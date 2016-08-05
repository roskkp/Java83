// 역할: 서비스 객체(Service Object)
// => 비즈니스 로직 구현 및 트랜잭션 관리
package java83.example.service;

import java.util.List;

import java83.example.vo.Board;

public interface BoardService {

  // 메소드 이름은 가능한 업무 용어를 사용한다.
  void addBoard(Board board);
  List<Board> getBoardList(int pageNo, int pageSize);
  Board getBoard(int no);
  int updateBoard(Board board);
  int deleteBoard(int no);
  
}
