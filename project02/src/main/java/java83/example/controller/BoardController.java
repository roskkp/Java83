package java83.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java83.example.dao.BoardDao;
import java83.example.service.BoardService;
import java83.example.vo.Board;

@Controller
@RequestMapping("/board/")
public class BoardController {

  @Autowired BoardService boardService;
  
  @RequestMapping("list")
  public String list(@RequestParam(defaultValue="1") int pageNo, 
                     @RequestParam(defaultValue="3") int pageSize, Model model) {
    model.addAttribute("list",boardService.getBoardList(pageNo, pageSize));
    
    return "board/list";
  }
  
  @RequestMapping("detail")
  public String detail(int no, Model model) {
    model.addAttribute("board",boardService.getBoard(no));
    
    return "board/detail";
  }
  
  @RequestMapping(path="add", method=RequestMethod.GET)
  public String form() {
    return "board/form";
  }
  
  @RequestMapping(path="add", method=RequestMethod.POST)
  public String add(Board board) {
    boardService.addBoard(board);
    return "redirect:list.do";
  }
  
  @RequestMapping(path="update", method=RequestMethod.POST)
  public String update(Board board) {
    boardService.updateBoard(board);
    return "redirect:list.do";
  }
  
  @RequestMapping(path="delete", method=RequestMethod.GET)
  public String delete(int no) {
    boardService.deleteBoard(no);
    return "redirect:list.do";
  }
}
