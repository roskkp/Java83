// 역할: 값 객체(Value Object)
package java83.example.vo;

import java.io.Serializable;
import java.sql.Date;

public class Board implements Serializable{

  // 직렬화(바이트 배열로 변환하여 출력)할 때 데이터의 버전 정보를 기록하기 위함.
  // => 역직렬화(바이트 배열을 읽어 객체로 만들기)하는 쪽에서 이 버전 정보를 검사하여 유효여부를 결정할 것이다.
  private static final long serialVersionUID = 1L;

  protected int no;
  protected String title;
  protected String content;
  protected Date createdDate;
  protected int viewCount;
  
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createDate) {
    this.createdDate = createDate;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
  
  
  
}
