### `JpaRepository`

- 인터페이스로 생성
- CRUD 메소드가 자동으로 생성
- `@Repository`를 추가할 필요 없음
    + `Entity` 클래스와 기본 `Entity Repository`는 함께 위치해야함
    + 도메인 페이지에서 함께 관리
    + `Entity` 클래스는 기본 `Repository`가 없이는 제대로 역할 수행 불가