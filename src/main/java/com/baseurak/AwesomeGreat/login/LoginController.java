package com.baseurak.AwesomeGreat.login;

import com.baseurak.AwesomeGreat.user.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;
    private String redirect(String route){
        return "<meta http-equiv=\"refresh\" content=\"0;url=" + route + "\">";
    }

    @PostMapping("/login")
    public String login(LoginForm form, BindingResult bindingResult, HttpServletRequest request) {
        log.info("LOGIN ID:{} PASSWORD:{}",form.getLoginId(), form.getPassword());

        if (bindingResult.hasErrors()) {
            return redirect("/login");
        }

        User loginUser = loginService.login(form.getLoginId(), form.getPassword());
        if (loginUser == null) {
            bindingResult.reject("loginFail", "아이디 또는 비밀번호가 맞지 않습니다.");
            return redirect("/login");
        }

        //HttpSession session = request.getSession();
        //세션 관리자를 통해 세션 생성하고 회원 데이터 보관
        //session.setAttribute(SessionConst.LOGIN_MEMBER, loginUser);

        return redirect("/main");
    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return redirect("/main");
    }

}