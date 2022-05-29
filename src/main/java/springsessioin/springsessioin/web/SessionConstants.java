package springsessioin.springsessioin.web;

public interface SessionConstants {

    /*
    먼저 HttpSession에서 로그인용으로 사용할 세션 id는 여기저기서 사용될 것이기 때문에 상수로 뺀다.
    인터페이스 또는 추상 클래스로 만들면 객체 생성을 막을 수 있음
     */
    String LOGIN_MEMBER = "loginMember";
}
