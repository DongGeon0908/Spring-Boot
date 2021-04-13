### `MVC`

- `Spring MVC` 설계
  - 프론트 컨트롤러 패턴에 기초한 `MVC` 프레임워크
  - 모델, 뷰, 컨트롤러를 각각의 인터페이스가 정의되어 있어 서로 구현에 의존적이지 않아 약한 결합도로 구성되어 유연하고 확장이 쉬움
  - 다양한 서드 파티 라이브러리 연계
  - 애노테이션의 도입
- `Model` 1
  - `JSP`만 사용하거나 `Java Bean`을 포함하여 개발
- `Model` 2
  - `Model - View - Controller`로 분리
- 프론트 컨트롤러 패턴

  - 클라이언트 요청을 별도의 프론트 컨트롤러에 집중

    - 모든 요청의 공통 부분을 별도 컨트롤러로 처리

  - 스프링이 관리하는 컴포넌트를 나타내는 일반적인 스테레오 타입
    - `DispatcherServlet`
    - `HandlerMapping`
    - `Controller`
    - `Model`
    - `ViewResolver`
    - `View`
- `spring-webmvc`
  - 스프링웹과 기타 스프링 프레임워크의 의존 모듈에 대한 의존 관계도를 함꼐 처리 가능

- `ContextLoadListner`
  - 서비스 계층 이하의 빈을 등록
  - `@Service`
  - `@Repository`

- `DispatcherServlet`
  - 컨트롤러 빈을 등록
  - `@Controller`
  - `@Component`

​    

​    

​    

​    

​    

​    

​    

​    

​    

​    

​    

​    

​    

​    

​    

​    

​    

​    