# `REST`

​	

- `REST`란?
  - `Representational State Transfer`
  - 클라이언트와 서버 사이에 데이터 연동 애플리케이션을 위한 아키텍처 스타일
  - 웹 상의 정보를 리소스로 파악하고 그 식별자로서 `URI`를 할당해 고유하게 주소를 지정하는 방법
  - `HTTP` 프로토콜을 사용해 리소스에 접근하고 `HTTP` 메서드에 대한 처리 결과를 서버는 `JSON` 또는 `XML` 등의 형식으로 전송
  - `GET - > select`
  - `POST -> insert`
  - `PUT -> update`
  - `DELETE -> delete`

- `@RestController`
  - `REST API`를 제공하는 컨트롤러
- `@RequestBody`
  - 요청된 `HTTP request body`를 해당 매개 변수에 바인딩
- `@ResponseBody`
  - 반환 값을 나가는 `HTTP response body`에 바인딩
- `@ResponseEntity`
  - 전체 `HTTP` 응답을 나타냄