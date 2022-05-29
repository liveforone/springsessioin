package springsessioin.springsessioin.domain.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springsessioin.springsessioin.domain.member.Member;
import springsessioin.springsessioin.domain.member.MemberRepository;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    public Member login(String loginId, String password) {
        return memberRepository.findByLoginId(loginId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}
