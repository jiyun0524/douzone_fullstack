package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");
        return "hello";
//      => resources/templates/hello.html 파일로 가라 ! 라는말
    }

    @GetMapping("hello-mvc")
    public String helloMVC(@RequestParam(name ="name", required = false) String name, Model model) {
        model.addAttribute("name", name);

        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
//  => ResponseBody : 이 데이터를 내가 body 부분에 직접 넣어주겠다
//   실행하고 소스코드 검사 누르면 html 태그는 하나도 안보이고 그냥 내용만 보임 !
    public String helloString(@RequestParam("name") String name) {

        return "hello " + name;
//      "hello spring"
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

        static class Hello {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
}
