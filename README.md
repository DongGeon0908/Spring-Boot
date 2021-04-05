# 📋Spring Boot Study📋

> Spring Boot 개념과 프로젝트 진행

<hr />

### ©CopyRight

> Donggeon Kim
> Department of Computer Engineering, Hanshin University

<hr />

![Spring](https://perfectacle.github.io/images/auto-scanning-annotation-based-bean/thumb.png)

### 📒Contents

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

<hr />

### 본격적인 스프링 공부

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
      + 트랜잭션이나 로깅, 보안과 같이 여러 모듈에서 공통적으로 사용하는 기능의 경우 해당 기능을 분리하여 관리
        + 프로그램 가독성
        + 기술 은닉

  <hr />

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

  - [`@SpringApplication`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/SpringApplication.md)
  - [`@Autowired`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Autowired.md)
  - [`Controller`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/Controller.md)
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

- Server

  - [`AWS`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/AWS.md)
    - [`EC2`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/EC2.md)
    - [`RDS`](https://github.com/DongGeon0908/Spring-Boot/blob/master/Spring-Boot-With-AWS/RDS.md)

- 단독 파일 만들기 + 해당 과정은 `intellj-gradle`을 사용할 경우 가능!!
  > Gradle - Tasks - build - bootjar 클릭시 -> 프로젝트 - libs에 스프링 단독 실행 파일 생성!!
  > <br>

### 🔗Reference

- 코드로 배우는 스프링 부트 웹 프로젝트
- 자바 웹을 다루는 기술
- 코드로 배우는 스프링 웹 프로젝트
- 스프링 부트와 AWS로 혼자 구현하는 웹 서비스
- 스프링 부트 시큐리티 특강 - 구름에듀
- 스프링 부트 나만의 블로그 만들기 - 구름에듀
- 스프링 부트 개념정리 - 구름에듀
