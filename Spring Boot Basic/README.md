# 📋Spring Boot Study📋

> Spring Boot 개념

<br>

### ©CopyRight

> Donggeon Kim
> Department of Computer Engineering, Hanshin University

<br>

### 📒Contents

#### 스프링이란?

- 프레임워크
    + 틀안에서 동작

- 오픈소스
    + 소스코드가 공개되어 있음
    + 오픈된 소스코드를 수정할 수 있음

- `IOC` 컨테이너를 가짐
    + `IOC(Inversior Of Controll)` 제어의 역전
    + 주도권을 스프링이 가짐
    + `object`를 직접 heap 메모리 공간에 생성

- `DI`를 지원
    + `Dependcy Injection`
    + 사용자가 원하는 모든 곳에서 스프링이 만든 `object`를 사용할 수 있음
    + heap 메모리에 생성된 `object`를 공유해서 사용 가능

- 필터 기능을 사용
    + 필터는 문지기의 역할
    + 사용자가 필터를 생성할 수 있음
    + 스프링 자체 필터 존재
    + 톰켓에서 사용하는 필터 `web.xml`
    + `Spring FrameWork`에서 사용하는 필터 `AOP`

- 어노테이션 사용 (리플렉션, 컴파일체킹)
    + 어노테이션은 컴파일러에게 힌트를 주는 주석
    + 스프링에서는 어노테이션을 이용해서 객체 생성
    + 리플렉션
        * 어떤것인지 분석하는 기번 -> 런타임시에 분석 진행
        * 구체적인 클래스 타입을 알지 못해도, 그 클래스의 메소드, 타입, 변수들에 접근할 수 있도록 해주는 자바 API
    + 컴파일체킹

- `MessageConvertor` 
    + default는 `json`
    + `json`은 중간언어를 의미
    + 자바 `object`와 파이썬 `object`는 다르게 생겼지만 해당 데이터를 자바와 파이썬이 모두 쉽게 읽을 수 있도록 사용
    + `MessageConvertor`를 활용해 `json` 데이터를 번역할 수 있음

- `BufferedReader`와 `bufferedWriter`
    + `InputStream`은 바이트 단위로 문자를 받음
    + `InputStreamReader`를 통해 배열로 여러개의 문자를 받음
    + `BufferedReader`를 통해 가변길이의 문자를 받을 수 있음
    + `BufferWriter`를 통해 가변길이의 문자를 전송할 수 있음

<br>

#### JPA

- `Java Persistence Application Programing Interface`
    + `Java Persistence API`
    + 데이터를 영구히 기록되게 함
    + `API`는 애플리케이션 프로그래밍 인터페이스를 의미
        * 인터페이스는 프로그램을 사용할때 꼭 지켜야할 약속
        * 인터페이스는 상하관계가 존재하는 약속
    + 자바 프로그래밍을 할떄 영구적으로 데이터를 저장하기 위해서 필요한 `API`

- `ORM` 기술
    + `Object Relation Mapping`
    + 오브젝트를 데이터베이스에 연결하는 방법
    + 자바에서 클래스를 만들어서 데이터베이스에 자동으로 테이블이 만들어지도록 하는 기술
    + 반복적인 `CRUD` 작업 생략 가능
        * 전송된 커리에 대한 작업들을 함수로 수행할 수 있음
        * 반복적인 작업들은 도와줌

- 영속성 컨텍스트
    + 영속성은 데이터를 영구적으로 저장하는 것
    + 컨텍스트는 모든 정보를 갖는것
    + 자바는 영속성 컨텍스트를 통해 데이터베이스로 데이터를 저장

- DB와 OOP의 불일치성을 해결하기 위한 방법론 제공 (DB는 개체저장 불가능)
    + `orm`을 통해 자바가 주도권을 잡고 객체를 저장할 수 있다.
    + `영속성 컨텍스트`를 통해 저장된 객체를 데이터베이스에 변환해 저장 

- `OOP`의 관점에서 모델링 가능 (상속, 콤포지션, 연관관계)
    + `JPA`는 객체를 먼저 생성하고, 이를 통해 테이블 생성
    + 상속과 콤포지션을 통해 간단하게 테이블 생성 가능

- 방언 처리 용이
    + `Migration` 편함
    + `Spring`은 `JPA`에서 추상화 객체를 통해 다양한 데이터베이스 프로그램과 연동해서 사용 가능

<br>    

### 스프링부트 동작원리

- 내장 톰켓 지원
    + 톰켓을 따로 설치할 필요 없음

- 톰켓이란?
    + `Socket`
        * 운영체게가 가지고 있는 것
        * main 스레드는 소켓을 운영하고 다른 스레드는 다른 사용자와 연결 진행
        * 소켓 통신은 부하를 늘림
    + `http` 통신  
        * `socket`을 이용해 구현
        * `stateless` 방식
        * 문서를 전달하는 통신

- 웹서버
    + `request`와 `response`를 통해 데이터 교환
    + `client`는 `host`의 주소를 모름

- 아파치&톰켓
    + 아파치
        * 요청한 파일을 제공
        * 특정 폴더를 지정해서 사용자와 데이터 공유
        * `request`에 따라 데이터를 `response`
        * 자바코드를 해석하지 못함
    + 톰켓
        * 요청한 파일이 자바파일이면 컴파일 진행
        * 자바코드를 컴파일하고 html 문서로 작성
        * 작성된 문서를 아파치로 전송

- 서블릿 컨테이너
    + `URL`
        * 자유 접근 X
        * 아파치
    + `URI`
        * 식별자 접근
        * 톰켓
    + 서블릿
        * 자바 코드로 웹 구현
    + 서블릿 컨테이너
        * 서블릿이 모여 있는 컨테이너
    + 사용자의 요청을 통해 정해진 양의 객체를 생성하고 삭제

- `web.xml`
    + `ServletContext`의 초기 파라미터
    + `Session`의 유효기간 설정
    + `Servlet/jsp`에 대한 정의
    + `Servlet/jsp` 매핑
    + `Mime Type` 매핑
        * 내가 들고올 데이터가 무엇인지 확인
    + `Welcome File list`
    + `Error Pages` 처러
    + 리스너/필터 설정
    + 보안

- `FrontController` 패턴
    + 최초 앞단에서 `request` 요청을 받아서 필요한 클래스를 넘겨줌
    + `RequestDispatcher`를 통해 `request`와 'response' 정보를 유지

- `RequestDispatcher`
    + 필요한 클래스 요청이 도달했을떄 `FrontController`에 도착한 `request`와 `responnse`를 그대로 유지시킴

- `DispatchServlet`
    + `FrontController` + `RequestDispatcher`
    + `FrontController` 패턴을 직접 짜거나 `RequestDispatcher`
    + 주소 분배
    + 컴포넌트를 메모리에 로딩

- 스프링 컨테이너
    + `IOC`
        * 수 많은 객체들이 `ApplicationContext`에 등록
        * 제어의 역전
    + `DI`
        * 의존성 주입
        * 필요한 곳에서 `ApplicationContext`에 접근해 필요한 객체 가져옴
        * `ApplicationContext`는 싱글톤으로 관리
        * 어디에서 접근하든 동일한 객체 보장
    + `servlet-applicationContext`
        * `ViewResolver`
        * `Interceptor`
        * `MultipartResolver`
        * 웹과 관련된 어노테이션 `Controller, RestController` 스캔 --> `DispatchServlet`에 의해 실행
    + `root-applicationContext`
        * `Service, Repository`등을 스캔
        * `Database`관련 객체 생성
        * `servlet-applicationContext`보다 먼저 실행됨
        * `servlet-applicationContext`는 `root-applicationContext`가 로드한 객체 참조 가능, 그반대는 불가
    + `Bean Factory`
        * 필요한 객체를 `Bean Factory` 등록
        * 초기에 메모리에 로드되지 않음
        * 필요할때 `getBean()`을 통해 메모리에 로드
        
    + 요청 주소에 따른 적절한 컨트롤로 요청 `Handler Mapping`
        * `Get` 요청
        * 해당 주소 요청이 오면 적절한 컨트롤러의 함수를 찾아 실행
    + 응답
        * `ViewResolver`
        * `html or data`중 어떤것을 응답할지 결정
        * `data`를 응답할 경우 `MessageConverter`가 작동하게 됨
        * 메시지를 컨버팅할 때 기본절략은 `json`

![Spring](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring%20Boot%20Basic/spring.png)