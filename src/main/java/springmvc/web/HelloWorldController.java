package springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

 @RequestMapping(value="/")
 public String index() {
  return "index";
 }
}