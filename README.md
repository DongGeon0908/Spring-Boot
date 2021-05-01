# 📋Spring Boot Study📋

> Spring Boot 개념과 프로젝트 진행

<hr />

### ©CopyRight

> Donggeon Kim
> Department of Computer Engineering, Hanshin University

<hr />

![Spring](https://perfectacle.github.io/images/auto-scanning-annotation-based-bean/thumb.png)

### 📒Contents

> [SprinBoot API 문서](https://spring.io/projects/spring-boot)

> [Thymeleaf API 문서](https://www.thymeleaf.org/)

> [What is Spring Boot?](https://github.com/DongGeon0908/Spring-Boot/tree/master/Spring%20Boot%20Basic)

> [DongGeon's Blog](https://github.com/DongGeon0908/Spring-Boot/tree/master/Spring%20Boot%20Blog)

> [What is Spring Security?](https://github.com/DongGeon0908/Spring-Boot/tree/master/Spring%20Boot%20Security)

> [Spring Boot with AWS](https://github.com/DongGeon0908/Spring-Boot/tree/master/Spring-Boot-With-AWS)

> [Spring Boot with JPA](https://github.com/DongGeon0908/Spring-Boot/tree/master/Spring%20Boot%20With%20JPA)

> [JPA를 통해 기본적인 C.R.U.D를 적용](https://github.com/DongGeon0908/Spring-Boot/tree/master/guestbook)

> [댓글 구현 방법](https://github.com/DongGeon0908/Spring-Boot/tree/master/mreview)

> [Thymeleaf 적용한 Web_1](https://github.com/DongGeon0908/Spring-Boot/tree/master/ex2)

> [Thymeleaf 적용한 Web_1](https://github.com/DongGeon0908/Spring-Boot/tree/master/ex3)

> [OAuth 2.0 적용한 로그인](https://github.com/DongGeon0908/Spring-Boot/tree/master/club)

> [JWT를 적용한 API Server](https://github.com/DongGeon0908/Spring-Boot/tree/master/club)

> [JPA를 통해 게시판 기능 구현](https://github.com/DongGeon0908/Spring-Boot/tree/master/board)

> [JWT 암호화 방식](https://github.com/DongGeon0908/Spring-Boot/tree/master/Spring%20Boot%20Security%20JWT)

> [Blog 구현 SpringBoot](https://github.com/DongGeon0908/Spring-Boot/tree/master/blogStudy)

> [M:N // 1:N](https://github.com/DongGeon0908/Spring-Boot/tree/master/bimovie)

> [스프링부트와 리엑트의 혼합!!](https://github.com/DongGeon0908/Spring-Boot/tree/master/Spring%20Boot%20With%20React/REACTWORK)

> [스프링 프로젝트 생성!](https://start.spring.io)

> [스프링 완전 기본 입문!!](https://github.com/DongGeon0908/Spring-Boot/tree/master/hello-spring)

<hr />

### 본격적인 스프링 공부

![이미지](https://t1.daumcdn.net/cfile/tistory/996CA6455B90B6CC4E)

- 스프링의 특징!!!

  - `POJO`
    - `Plain Old Object`
    - 특정한 인터페이스를 구현하거나 상속을 받을 필요가 없는 가벼운 객체를 관리

  + `IOC`
    + `Inversion of Controle`
      + 인스턴스를 제어하는 주도권이 역전
      + 경량 컨테이너 `Light-Weight Controller`
      + 컴포넌트를 구성하는 인스턴스 생성과 의존 관계 연결을 `DI` 컨테이너가 대신 수행
        + 필요에 따라 스프링 프레임워크에서 사용자의 코드를 호출
      + 일반 오브젝트의 생애 주기 관리나, 오브젝트 간의 의존관계를 해결하는 아키텍처를 구현
        + 스프링 빈의 생성, 관계, 조립, 생명주기를 관리하는 핵심 개념
        + 의존관계주입 `DI`을 이용해 애플리케이션을 구성하는 컴포넌트를 관리
    
+ `AOP`
  
    + `AOP`가 필요한 상황
      + 모든 메소드의 호출 시간을 측정하고 싶을때
      + 공통 관심 사항 vs 핵심 관심 사항
      + 회원 가입 시간, 화면 조회 시간 측
    
  + `DI AOP`
  
    + `DI`
      + `Dependency Injection`
        + `XML, Annotation, Java` 기반 설정을 통해서 객체간의 의존 관계를 설정
          + `XML`
            + `XML` 파일을 사용하는 `<Bean>` 요소를 정의하는 방법
          + `Annotaion`
            + `@Component` 애너테이션이 부여된 클래스를 `DI` 컨테이너가 `Bean`으로 자동으로 등록하는 방법
          + `JAVA` 기반 설정
            + 자바 클래스에 `@Configuration` 애너테이션을, 메서드에 `@Bean` 애너테이션을 이용해 `Bean`을 등록
      + 의존 관계 주입
        + 오브젝트 간의 의존 관계를 만드는 것
        + 생성자 기반 의존성 주입 `Constructor based dependency Injection`
        + 생성자의 인수를 사용해 의존성 주입
        + 설정자 기반 의존성 주입 `Setter based dependency Injection`
        + 메서드의 인수를 통해 의존성을 주입
      + 각각의 계층이나 서비스들 간에 의존성이 존재할 경우 프레임워크가 서로 연결시켜줌
      + 변경 용이성
        + 확장성
        + 품질관리 용이
        + 객체 간의 결합도를 낮춤
  
    + `AOP`
  
      ![AOP](https://i.loli.net/2019/06/01/5cf1f4f78070020870.jpg)
  
      + `Aspect Oriented Programming`
      + 트랜잭션이나 로깅, 보안과 같이 여러 모듈에서 공통적으로 사용하는 기능의 경우 해당 기능을 분리하여 관리
        + 프로그램 가독성
        + 기술 은닉
      + 관점 지향 프로그래밍
        + 여러 비즈니스 모듈에서 공통으로 사용되는 횡단 관심사를 중심으로 설계, 개발하는 프로그래밍 기법
      + `AOP` 정의 용어
        + 관심사 `Concern`
          + 어플리케이션을 개발하기 위한 구현 기능
          + 어플리케이션의 비즈니스 중요 기능
        + 횡단 관심사 `Cross Cutting Concern`
          + 여러 모듈에 걸쳐 공통적이고 반복적으로 필요로 하는 처리 내용
        + 횡단 관심사 분리 `Separation Of Cross Cutting Concern`
          + 횡단 관심사를 한 곳으로 모는 것
      + `AOP` 목적
        + `DI`는 어플리케이션 객체 간의 결합 낮춤
        + 횡단 관심와 이에 영향 받는 객체 간 결합도 낮춤
      + `AOP` 장점
        + 전체 코드에 흩어져 있는 관심사들이 하나의 장소로 응집
        + 핵심 기능에 대한 코드만 기술
        + 공통 관심사들은 공통 모듈로 옮겨짐
      + `AOP` 적용
        + 횡단 관심 모듈을 각각 독립된 모듈로 중복 없이 작성해야 함
        + `DI` 설정을 통해 핵심 관심 모듈의 적합한 위치에 결합시킬 수 있음
      + `Proxy` 패턴 방식 구현
        + 어떤 객체를 사용하고자 할때, 객체를 직접적으로 참조하는 것이 아니라, 그 객체를 대행하는 객체를 통해 대상객체에 접근하는 방식
        + 스프링 컨테이너 초기화 과정에서 스프링 빈 객체를 대행할 프록시 객체를 생성
        + 객체 핵심 코드에 대한 영향없이 객체의 접근 전/후에 대한 중요 처리가 가능
      + `AOP` 구현 방법
        + `XML`
          + `XML` 스키마 기반의 `POJO` 클래스 이용한 `AOP` 구현
          + `DI AOP`를 이용한 인터페이스 기반의 컴포넌트화를 완성
          + `AOP`를 통해 횡단 관심사와 이에 영향 받는 객체 간 결합도 낮춤
        + `Annotation`
          + 애노테이션 기반의 `AOP` 구현
          + `@Aspect @Component @Before @After` 등의 애노테이션을 통해 `AOP` 구현
        + `Java Code`
          + `JAVA` 기반의 `AOP` 구현
          + `@EnableAspectJAutoProxy` 선언을 통해 `JavaConfog`로 `AOP` 구현
      
    + 트랜잭션
    
      ![트랜잭션 로직](https://t1.daumcdn.net/cfile/tistory/9977A0505C21E46F32)
    
      + 전체 로직이 모두 다 반영되거나 모두 반영되지 않는 논리적인 작업의 묶음
    
      + `All or Nothing`
    
      + `commit`
    
        + 논리적 단위로 어떤 한 부분의 작업이 완료되는 것
    
      + `rollback`
    
        + 논리적 단위로 어떤 한 부분의 작업이 취소되는 것
    
      + 트랜잭션의 기본 원칙 `ACID`
    
        + 원자성 `Atomicity`
          + 한 트랜잭션 내의 모든 연산들이 완전히 수행되거나 전혀 수행되지 않음
        + 일관성 `consistency`
          + 어떤 트랜잭션이 수행되기 전에 데이터베이스가 일관된 상태를 가졌다면 트랜잭션이 수행된 후에 데이터베이스는 또 다른 일관된 상태를 가짐
        + 고립성 `Isolation`
          + 한 트랜잭션이 데이터를 갱신하는 동안 이 트랜잭션이 완료되기 전에는 갱신 중인 데이터를 다른 트랜잭션에서 접근할 수 없음
        + 지속성 `Durability`
          + 일단 한 트랜잭션이 완료되면 데이터베이스에 반영한 수행 결과는 영구적이어야 함을 의미
    
      + 트랜잭션의 경계
    
        + 프리젠테이션 층에 공개된 서비스의 메서드가 트랜잭션의 시작과 종료
    
      + `AOP`를 이용한 스프링의 트랜잭션 처리
    
        + `AOP`로 서비스에 트랜잭션 처리를 구현한 어드바이스를 적용
          + 서비스 내부를 수정하지 않고 트랜잭션을 처리
        + 트랜잭션 처리
          + 트랜잭션 관리자와 트랜잭션 어드바이스를 이용
          + 트랜잭션 관리자
            + 데이터베이스 연동 기술에 상관없이 동일한 방식으로 트랜잭션 관리 기능을 제공
    
      + 트랜잭션 정의 정보
    
        + 전파 속성 `propagation`
          + 기존 트랜잭션이 있는 상태에서 새로운 트랜잭션을 별도로 생성하거나 또는 기존 트랜잭션에 포함시켜 실행하도록 설정하기 위한 트랜잭션 전파에 대해 설정
          + 2개 이상의 트랜잭션이 작동할 때, 기존 트랜잭션에 참여하는 방법을 결정하는 속성
        + 독립성 `isolation`
          + 트랜잭션 처리가 병행해서 실행될 때 각 트랜잭션의 독립성을 결정
          + 여러 개의 트랜잭션이 동시에 실행될 때 어떻게 데이터 무결성을 보장할 지에 대한 결정
        + 만료시간
          + 트랜잭션이 취소되는 만료 시간을 초 단위로 설정
        + 읽기 전용 상태
          + 트랜잭션 내의 처리가 읽기 전용으로 설정
        + 롤백 대상 예외 `Exception`
        + 커밋 대상 예외 `Exception`
    
        ![트랜잭션 처리 과정](https://blog.kakaocdn.net/dn/qfJ8q/btqzYCZvRBC/dAN53WjLEZJQNRW4Wkz1H0/img.png)
    
      + 트랜잭션 처리 방법
  
        + 선언적 트랜잭션 처리
        + 미리 선언된 규칙에 다라 트랜잭션을 제어하는 방법
            + `xml`
          + `@Transactional`
              + 메서드 -> 클래스 -> 인터페이스
      + 명시적 트랜잭션 처리
          
        + 소스 코드상에 트랜잭션 처리 메서드를 호출하므로 복잡하고 가독성이 떨어짐
  

  
<hr />
  
### Server 개발
  
- 정적 컨텐츠
  
  ![정적 컨텐츠](https://blog.kakaocdn.net/dn/n1GsR/btqJ6cCpK10/CoRpkbTRYgcTu6dqAxVMEK/img.png)
  
- `MVC`와 템플릿 엔진
  
  - `MVC == Model View Controller`
  
  ![이미지](https://mblogthumb-phinf.pstatic.net/MjAyMDA4MDJfNjYg/MDAxNTk2Mjk4Mzc5NjU0.ZCccUoyDy4Ktg9LTOPetxNrFb4NTo3WJNoTNz_H36Wsg.AyuiBWhdsHNxVV-WgKu_AdfDNaJYi5gP1Hdprh7ZNGEg.PNG.adamdoha/image.png?type=w800)
  
- `API`
  
    ![API](https://mblogthumb-phinf.pstatic.net/MjAyMDA4MDJfNzcg/MDAxNTk2Mjk5MzQ0MDgx.HgQoTGqFOBR9lhc0ZZHjen6DtgRK-KROFAxcUb9uJKMg.YcE00M3y9XI9HkoGgpm_a1X2eqDd0IkVsn09VBsp5JUg.PNG.adamdoha/image.png?type=w800)
  
<hr />

### 스프링부트 프로젝트 진행 경로

![대박!](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FXfLm5%2FbtqNSyXaHK5%2FHw3K9ceUR7e8VmlT1NJvLk%2Fimg.png)

1. 사용자 요청
  2. `Controller`

  <hr />

  - 일반적인 웹 애플리케이션 계층 구조
  
    ![이미지](https://blog.kakaocdn.net/dn/nRHkz/btqSdsY8mlB/8XK2IcPfvfZVykl78x29h0/img.png)
  
    - 컨트롤러
    - 웹 MVC의 컨트롤러 역할
    - 서비스
    - 핵심 비즈니스 로직 구현
    - 레포지토리
      - 데이터베이스에 접근
      - 도메인 객체를 DB에 저장하고 관리
    - 도메이
      - 비즈니스 도메인 객체

  <hr />

  - 스프링 빈을 등록하는 방법
    - 컴포넌트 스캔과 자동 의존관계 설정
      - `@Component` -> 스프링 빈으로 자동 등록
      - `@Controller` -> Component를 통해 스프링 빈으로 자동등록
      - `@Service` -> Component를 통해 스프링 빈으로 자동등록
      - `@Repository` -> Component를 통해 스프링 빈으로 자동등록
    - 자바 코드로 직접 스프링 빈 등록

  <hr />


- 개방-폐쇄 원칙(OCP, Open-Closed Principle)
  
  - 확장에는 열려있고, 수정, 변경에는 닫혀있음
- 스프링의 DI `Dependence Injection`을 사용하면 기존 코드를 전혀 손대지 않고, 설정만으로 구현 클래스를 변경할 수 있음

		<hr />

<hr />

### SOLID

- `SOLID`는 객체지향 프로그래밍에서 지켜야 할 더 나은 소프트웨어를 개발을 위한 필수 지침
  - 5가지의 원리는 의존성 관리에 대해 초점을 맞춤
  - 잘못설계된 의존성 관리는 코드 확장과 수정을 힘들게 만듬
  - 스프링은 이 의존성에 작성에 대한 최소한의 제약만 제공하기 위한 프레임워크

- `Single Responsibility` 
  - 하나의 클래스는 하나의 책임만 가져야 한다는 원리

- `Open Close` 
  - 확장에는 열려있고 수정에는 닫혀있어야 한다는 원리
    - 프로그램의 기능이 확장되거나 변경될 때 기존의 소스는 수정하지 않고 추가로 코드를 작성
    - 인터페이스를 두고 다양하게 확장 가능하도록 구현
    - 변경될 것과 고정될 것을 구별한다. 변경될 것은 하나의 기능만을 가지는 하나 이상의 클래스로 작성

- `Liskov Substitution` 
  - 클래스가 확장되더라도 기존의 기능과 호환성을 유지해야 한다는 원리
    - 기능을 추가하면 추가된 기능을 지원하는 인터페이스를 추가하여 제공
    - 성능이 향상되더라도 인터페이스를 통해 제공하는 기능은 동일 

- `Interface Segregation` 
  - 하나의 클래스를 다양한 관점에서 사용하는 경우 다양한 관점에 적합한 세부적인 인터페이스를 제공하는 것이 바람직 

- `Dependency Inversion`
  - 추상화 클래스와 인터페이스는 최대한 모호하게 정의하여 구현과 분리해야 한다는 원리
    - 구현에 따라서 추상화된 인터페이스가 변경되지 않아야 함
    - 구현에 따라 적절하게 변경하기 위해 추상인터페이스를 구현하는 Adapter클래스를 작성할 수 있음

<hr />

- [스프링 프레임워크 기본](https://github.com/DongGeon0908/Spring-Boot/blob/master/%EC%8A%A4%ED%94%84%EB%A7%81%EA%B8%B0%EB%B3%B8.md)
  
- ENV
  
  - [`Intellij`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Intellij.md)
  - [`eclipse`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/eclipse.md)
  - [`STS`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/STS.md)
  - [`WAS`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/WAS.md)
    - [`내장 WAS`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/InnerWAS.md)
  - 프로젝트 관리 도구
    - [`Gradle`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Gradle.md)
    - [`Maven`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/Maven.md)
  
- Dev

  - [`MVC`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/MVC.md)
  - [`@SpringApplication`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/SpringApplication.md)
  - [`@Autowired`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Autowired.md)
  - [`Controller`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Controller.md)
    - [`REST`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/REST.md)
    - [`@RestController`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/RestController.md)
  - [`Model`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Model.md)
  - [`View`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/View.md)
    - [`Server Templete Engine`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/ServerTemplete.md)
    - [`Client Templete Engine`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/ClientTemplete.md)
    - [`Mustache`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Mustache.md)
    - react
      - [`npm과 npx 차이`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/npm-npx.md)
  - [`Mapping`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Mapping.md)
    - [`@GetMapping`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/GetMapping.md)
  - [`LOMBOK`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/LOMBOK.md)
    - [`@Getter`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Getter.md)
    - [`@NoArgsConstructor`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/NoArgsConstructor.md)
    - [`@Builder`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Builder.md)
  - [`DTO`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/DTO.md)
    - [`VO`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/VO.md)
  - [`Bean`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Bean.md)
  - [`POJO`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/POJO.md)
  - [`@RequiredArgsConstructor`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/RequiredArgsConstructor.md)
  - [`param`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/param.md)
    - [`@RequestParam`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/RequestParam.md)
  - [`jsonPath`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/jsonPath.md)
    - [`@RequestBody`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/RequestBody.md)
  - [`SqlMapper`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/SqlMapper.md)
    - [`DAO`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/DAO.md)
  - [`ORM`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/ORM.md)
  - [`JPA`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/JPA.md)
    - [`Hibernate`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/Hibernate.md)
    - ['spring-boot-starter-data-jpa'](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/springbootstarterdatajpa.md)
    - [`@Entity`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Entity.md)
    - [`Column`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Column.md)
    - [`Id`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Id.md)
    - [`GeneratedValue`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/GeneratedValue.md)
    - [`JpaRepository`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/JpaRepository.md)
    - [`AfterEach`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/AfterEach.md)
    - [`postsRepository.save`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/postsRepositorysave.md)
    - [`postsRepository.findAll`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/postsRepositoryfindAll.md)
    - [`영속성 컨텍스트`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/persistance.md)
    - [`@enumerated`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/enumerated.md)
    - [`@Table`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/Table.md)
    - [`N:1`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/N-1.md)
    - [`M:N`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/M-N.md)
    - [`fetch`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/fetch.md)
    - [`JPA Repository 확장`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/jparepositoryexpansion.md)
  - [`domain`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/domain.md)
  - [`API`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/API.md)
    - [`Filter for API`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/FilterFORAPI.md)
  - [`Spring Layer`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/SpringLayer.md)
  - Date
    - [`@MappedSuperclass`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/MappedSuperclass.md)
    - [`@EntityListeners(AuditingEntityListener.class`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/EntityListeners.md)
    - [`@CreatedDate`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/CreatedDate.md)
    - [`@LastModifiedDate`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/LastModifiedDate.md)
  - [`Spring Security`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/SpringSecurity.md)
  - annotation
    - [`@Target`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Target.md)
    - [`@interface`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/interface.md)
  - [`세션저장소`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/sessionRepository.md)
  - [`WithMockUser`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/WithMockUser.md)

- [`DATABASE`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/DATABASE.md)

  - [`h2`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/h2.md)
  
- [`GIT`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/GIT.md)

  - [`.gitignore`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/SpringApplication.md)

- TEST

  - [`TDD`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/TDD.md)
  - [`Unit Test`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Unit%20Test.md)
    - [`JUNIT`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/JUNIT.md)
  - [`@ExtendWith(SpringExtension.class)`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/ExtendWith.md)
  - [`@WebMvcTest`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/WebMvcTest.md)
  - [`private MockMvc mvc`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/privateMockMvcmvc.md)
  - [`mvc.perform(get("/hello"))`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/mvcperform.md)
  - [`.andExpect(status().isOk())`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/andExpect.md)
  - [`assertThat`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/assertThat.md)
    - [`isEqualTo`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/isEqualTo.md)

- [`예외처리`](https://github.com/DongGeon0908/Spring-Boot/blob/master/md/exception.md)

- Server

  - [`AWS`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/AWS.md)
    - [`EC2`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/EC2.md)
    - [`RDS`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/RDS.md)

- 단독 파일 만들기 + 해당 과정은 `intellj-gradle`을 사용할 경우 가능!!
  > Gradle - Tasks - build - bootjar 클릭시 -> 프로젝트 - libs에 스프링 단독 실행 파일 생성!!
  > <br>
  
- 최근 Spring 프로젝트 트렌드

  - SpringBoot + Gradle + Thymeleaf + JPA-HIBERNATE 

### 🔗Reference

- 코드로 배우는 스프링 부트 웹 프로젝트 (서적)
- 자바 웹을 다루는 기술 (서적)
- 코드로 배우는 스프링 웹 프로젝트 (서적)
- 스프링 부트와 AWS로 혼자 구현하는 웹 서비스 (서적)
- 스프링 부트 시큐리티 특강 (강의)
- 스프링 부트 나만의 블로그 만들기 (강의)
- 스프링 부트 개념정리 (강의)
- 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술 (강의)
- 자바 스프링 프레이웜크 - 신입 프로그래머를 위한 강좌 (강의)
