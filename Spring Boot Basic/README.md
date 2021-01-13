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
