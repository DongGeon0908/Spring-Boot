### `API`

- `API`를 만들기 위해 필요한 클래스
    + `Request` 데이터를 받을 `DTO`
    + `API` 요청을 받을 `Controller`
    + 트랜잭션, 도메인 기능 간의 순서를 보장하는 `Service`
        * `Service`에서는 비즈니스 로직을 처리하지 않음
    + 간단하게
        * `DTO`
        * `Controller`
        * `Service`

- `API Server` 
    + 클라이언트가 원하는 데이터를 제공하는 서버
    + 보안과 인증에 대한 문제가 존재
        * `JWT`방식을 대체로 사용
    + 순수하게 원하는 데이터만을 제공하는 서버