### `@GeneratedValue`

- `PK`의 생성 규칙 나타냄
    + 자동으로 생성되는 번호를 사용할 수 있음

- `@GeneratedValue`의 `KEY` 생성 전략
    + `AUTO(default)`
        * `JPA` 구현체 `Hibernate`가 생성 방식을 결정
    + `IDENTITY`
        * 사용하는 데이터베이스가 키 생성을 결정
    + `SEQUENCE`
        + 데이터베이스의 `sequence`를 이용해서 키를 새성
    + `TABLE`
        + 키 생성 전용 테이블을 생성해서 키 생성