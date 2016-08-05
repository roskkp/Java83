// 역할: 퍼시스턴스 객체(Persistence Object)
// 값 객체의 데이터를 등록/조회/수정/삭제하는 기능을 수행한다.
package java83.example.dao;

import java.util.List;
import java.util.Map;

import java83.example.vo.Board;

// Mybatis에서는 DAO 구현체를 자동으로 생성한다.
// 따라서 개발자는 인터페이스만 구현하면 된다.
// 이렇게 Mybatis가 인터페이스 구현체를 만드는 경우, 모든 메서드의 파라미터 값은 SqlMapper와 일치시키기위해 한 개여야 한다.
public interface BoardDao {

  void insert(Board board);// Create
  List<Board> selectList(Map<String, Object> params); // Read or Retrieve
  Board selectOne(int no); // Read or Retrieve
  int update(Board board); // Update
  int delete(int no); // Delete

}
