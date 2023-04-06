package idusw.springboot.boardthyemleaf.controller;

import idusw.springboot.boardthyemleaf.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // annotation
public class HomeController { // open-api를 작성할 때 많이 사용함. 바로 response-body 반환
  @Autowired
  MemoService memoService; // MemoService 인터페이스의 구현체를 필드 주입

  @GetMapping("/")
  public String goHome(){
    return "index";
  }
}
