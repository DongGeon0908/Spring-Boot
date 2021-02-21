### `Hibernate`

- 오픈소스로 `ORM`을 지원하는 프레임워크
    + 단독으로 프로젝트에 적용이 가능한 독립된 프레임워크
        * `Spring Data JPA` -> `Hibernate`
    + `Spring Data JPA` <-> `Hibernate` <-> `JDBC` <-> DB

- `Spring Data JPA` 개발에 필요한 것
    + `JPA`를 통해서 관리하게 되는 개체(엔티티)를 위한 앤티티 클래스
    + 앤티티 객체들을 처리하는 기능을 가진 `Repository`
        * `Spring Data JPA`에서 제공하는 인터페이스로 설계
        * 스프링 내부에서 자동으로 객체를 생성하고 실행하는 구조