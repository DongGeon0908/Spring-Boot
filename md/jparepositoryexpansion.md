### `Repository 확장`

- 쿼리 메서드나 `@Query` 등으로 처리할 수 없는 기능은 별도의 인터페이스로 설계

- 별도의 인터페이스에 대한 쿠현 클래스 작성
    + `QuerydslRepositorySupport`라는 클래스를 부모 클래스로 사용
        * `Spring Data JPA`에 포함된 클래스로 `Querydsl` 라이브러리를 이용해서 직접 무언가 구현할 때 사용

- 구현 클래스에 인터페이스의 기능을 `Q도메인` 클래스와 `JPQLQuery`를 이용해 구현