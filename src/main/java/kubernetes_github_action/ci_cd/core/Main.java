package kubernetes_github_action.ci_cd.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Main {

  @GetMapping("/")
  public String main() {
    return "배포 테스트 중 입니다.";
  }
}