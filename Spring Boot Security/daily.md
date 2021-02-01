### 스프링 시큐리티

- 스프링 시큐리티는 세션을 갖고 있다. 그 세션에는 Authentication 객체가 존재
    + `userDetails`
        * 일반 로그인
    + `OAuth2User`
        * `OAuth` 로그인
    + 이 두개의 정보를 `PrincipalDetails`로 묶어서 처리