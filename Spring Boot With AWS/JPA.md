### `JPA`

- 패러다임 불일치
    + 관계형 데이터베이스와 객체지향 프로그래밍 언어의 패러다임이 서로 다른데, 객체를 데이터베이스에 저장하려고 하니 발생하는 문제

- 서로 다른 영역을 중간에서 패러다임 일치시켜주는 기술
    + 객체지향적으로 프로그래밍
    + `SQL` 종속적인 개발 필요 없음

- 자바 표준 명세서
    + 인터페이스
    + 구현체 필요
        * `Hibernate, Eclipse, Link`
    + 스프링에서는 `Spring Data JPA`를 사용
        + 내주에서 구현체 매핑 지원
    + `JPA <- Hibernate <- Spring Data JPA`
        * 구현체 교체의 용이성
            - `Hibernate` 외에 다른 구현체로 쉽게 교체하기 위함
        * 저장소 교체의 용이성 
            - 관계형 데이터베이스 외에 다른 저장소로 쉽게 교체하기 위함