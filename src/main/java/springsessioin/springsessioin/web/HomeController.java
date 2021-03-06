package springsessioin.springsessioin.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import springsessioin.springsessioin.domain.member.Member;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@SessionAttribute(name = SessionConstants.LOGIN_MEMBER, required = false)Member loginMember, Model model) {
        //세션에 데이터 없으면 홈으로//
        if(loginMember == null) {
            return "home";
        }

        //세션이 유지되면 로그인 홈으로 이동//
        model.addAttribute("member", loginMember);

        return "loginHome";
    }
}
