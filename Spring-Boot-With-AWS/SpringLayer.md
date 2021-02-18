### `Spring Layer`

- `Web Layer`
    + `@Controller`와 `JSP/Freemaker` 등의 뷰 템플릿 영역
    + `@Filter`, `intercepter`, `@ControllerAdvice`등 외부 요청과 응답에 대한 전반적인 영역

- `Service Layer`
    + `@Service`에 사용되는 서비스 영역
    + `Controller`와 `Dao`의 중간 영역
    + `@Transactional`이 사용되는 영역
    + `Service`에서는 이벤트의 순서를 순서를 정의

- `Repository Layer`
    + `Database`와 같이 데이터 저장소에 접근하는 영역
    +  기존의 `Dao`와 유사

- `Dtos`
    + `Dto`
        * `Data Transfer Object`
        * 계층 간에 데이터 교환을 위한 객체
    + `Dto`의 영역
    + 뷰 템플릿 엔진에서 사용될 객체
    + `Repository Layer`에서 결과로 넘겨준 객체 등

- `Domain Model`
    + 도메인(개발 대상)을 모든 사람이 돌일한 관점에서 이해할 수 있고 공유할 수 있도록 단순화 시킨 것
    + `@Entity`가 사용되는 역역

+ `Domain`
    + `Web, Service, Repository, Dto, Domain`에서 비즈니스 처릴를 담담하는 곳
    + `Domain`에서 이벤트를 구현!!