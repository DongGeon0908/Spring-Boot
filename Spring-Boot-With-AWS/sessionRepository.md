### `sessionRepository`

- 세션은 `WAS`의 메모리에 저장되고 호출

- 세션 저장소 사용법
    + 톰켓 세션 사용
    + 데이터베이스를 세션 저장소로 사용
        * 사용자가 적다면 유리함
    + `Redis, Memcached` 등 `메모리 DB`를 세션 저장소로 사용