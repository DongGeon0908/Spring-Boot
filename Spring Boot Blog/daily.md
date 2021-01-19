### 스프링 실습


- 스프링 -> IOC -> 제어의 역전
- 싱글톤 패천
- 레퍼런스 변수를 스프링이 관리

> 패키지 -> 스캔 : 필요한 것들을 메모리 로드 IOC 싱글톤
> 결론적으로 우리가 만든 패키지 이하에 만들어야 스프링이 읽을 수 있음

- ctrl + shift + o -> 전체 라이브러리 import

- 스프링에 대한 기본 설정 적용

- mysql 한글패티

- properties 방식보다 yml 파일이 더 간단하고 편리

- 깃허브란?
    + snapshot
        * 장면을 기록
    + 특정 시점, 장소를 snapshot을 통해 기록하는 것    

- git의 3가지 영역
    + 작업영역
    + 인덱스 `index`
    + 헤드 `head`

- 깃은 작업영역, 인덱스, 헤드를 동기화하는 것

- http 1.1

postman 설치

- http 통신 : 약속이 필요
    + 통신 방법, 요청 방법
        * `get` -> 데이터를 줘~
        * `post` -> 데이터를 추가해줘~
        * `put` -> 데이터를 수정해줘~
        * `delete` -> 데이터를 삭제해줘~

- `stateless`와 `stateful`
    + `socket` 통신
        * 계속 연결해서 데이터를 전송
    + `http - statless`
        * 요청시마다 스트림을 연결해서 data를 주고 받는 방식    
    + `stateful`
        * 연결이 지속됨
    + `Spring Security`
        * `session`을 유지하는 보안적인 방법
        
- MIME 타입이란
    + 내가 바디에 시러 보낼 데이터의 종류를 헤더에 작성
    + 클라이언트에게 전송된 문서의 다양성을 알려주는 것
    + `type/subtype`

- http 통신은 패킷 스위칭 통신
> 패킷을 쪼개어 전송, 수신자는 해당 패킷을 조립해서 받음

- 서킷 스위칭
> A와 B가 데이터를 교환할때 전체 데이터를 전송, 속도는 빠르지만 물리적으로 비용이 많이 듬

- `http 405 error`
    + 인터넷 브라우저 요청은 `get`방식만 가능

- `post, put, delete`는 각각의 요청을 따라야함

- 자바에서 변수를 `private`로 쓰는 이유
    + 객체지향에서 변수를 직접 접근하는 방법은 지양
    + 변수는 `private`이고 해당 변수를 `public`으로 접근해야 함
    + 변수의 상태를 메서드로 관리해야함
    
- `Spring Boot`에서 `get` 방식은 `select` 실행

- `Spring Boot`에서 `post` 방식은 `insert` 실행


- `post`요청에서 `json`데이터 해석
- `json 형태`
```
{
    "id" : 1,
    "username" : "hello",
    "password" : "1234",
    "email" : "wrjs@naver.com
}
```

- `@RequestBody`을 통해 데이터를 매핑해서 받을 수 있음

- `Maven`이란?
    + 중앙저장소에 각각의 프로젝트에 필요한 라이브러리를 저장
    + `pom.xml`에 프로젝트 필요한 라이브러리를 작성
        * `.m2`라는 폴더에 자동으로 저장 및 관리

- `SpringBoot`에서 코드가 변경된 경우 서버를 재시작해야함

- `yml` 설정
    + 스프링 프로젝트를 설정하는 것
    + `xml`, `json` 보다 경량 데이터

- `root-context.xml`
    + 데이터베이스 같이 한번만 설정하면 되는것

- `servlet-context.xml`
    + 계속 변하는 값

- `application.yml`
    + `web.xml`, `root-context.xml`, `servlet-context.xml`의 합본

```
server:
  port: 8000
  servlet:
    context-path: /blog
    encoding:
      charset: UTF-8
      enabled: true
      force: true
    
spring:
  mvc:
    view:
      prefix: /WEB-INF/views/
      suffix: .jsp
      
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/blog?serverTimezone=Asia/Seoul
    username: cos
    password: cos1234
    
  jpa:
    open-in-view: true
    hibernate:
      ddl-auto: create
      naming:
        physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
      use-new-id-generator-mappings: false
    show-sql: true
    properties:
      hibernate.format_sql: true

  jackson:
    serialization:
      fail-on-empty-beans: false
```

- 포트설정
```
server:
  port: 8000
  servlet:
    context-path: /blog
    encoding:
      charset: UTF-8
      enabled: true
      force: true
```

- 데이터베이스 설정
```
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/blog?serverTimezone=Asia/Seoul
    username: cos
    password: cos1234
```

- 스프링은 기본적으로 jsp파일을 지원하지 않음

- `RestController`는 리턴된 문자열 자체를 반환

- `Controller`는 해당 경로에 있는 파일 자체를 반환

- `static` 폴더에는 정적인 파일만 들어감
    + `jsp`파일은 컴파일이 되지 않음

- `Enum`


- yml 설정
```
 jpa:
    open-in-view: true
    hibernate:
      ddl-auto: create
      naming:
```
> 해당 부분에서 `ddl-auto: create`에서 create는 프로젝트 시작마다 테이블을 생성하는것! 한번 실행한 뒤에는 update로 바꾸자!!

- 필드 그대로 데이터베이스에 생성
```
 naming:
        physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
```

- 연관관계 주인 == `FK`를 가진 오브젝트
> 자바프로그램이 보낸 쿼리를 JPA는 자동으로 JOIN을 통해 데이터베이스에서 해당 자료를 받아옴

- `JSON`
  + 공용어의 의미
```
JAVA object -> JSON -> PYTHON

```
  + `JSON`은 중간 데이터
  + 통신을 한다는 것은 자바오브젝트를 `JSON`으로 보내는 것을 의미
  + `SpringBoot`에서는 `MIME-TYPE`이 `JSON`
  + 요청 데이터 -> `json` -> `JAVA OBJECT`
  + 응답 데이터 -> `json` -> `JAVA OBJECT`
  
  - `ManyToMany`
    + 사용하지 않음
    + 서로의 `pk`로만 중간 테이블을 생성해 날짜나 시간처럼 다른 필드들이 필요할 수 있기 때문이다.

  - `null` 값을 제외하고 `insert`
    + `@DynamicInsert`

  - `enum`
    + 내가 추가하는 값을 강제할 수 있음
    + 데이터의 도메인을 만들때 사용
      * 도메인은 데이터의 범위를 의미함

- 영속성 컨텍스트
> JPA에서 영속성 컨텍스트 안에 1차 캐시에 데이터가 입력되면 DB에 해당 데이터를 보냄

> 변경을 감지하고 데이터베이스에 수정을 요청함