package springsessioin.springsessioin.web.login;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginForm {  //요청 form 데이터를 바인딩 받기 위한 DTO

    @NotBlank
    private String loginId;

    @NotBlank
    private String password;
}
