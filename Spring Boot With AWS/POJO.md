### `POJO`

- `Plain Old Java Object`
- 특정 인터페이스나 클래스를 상속하지 않고, 순수하게 `Getter, Setter`로만 구성된(어디에도 종속되지 않은) 자바 객체
- 다른 곳에 종속되지 않는다는 것은 해당 클래스를 사용하기 위해 어떤 프레임워크나 외부 환경이 필요없다는 것
- `Spring MVC`를 걷어내도 `POJO`들은 정상적으로 동작 
- `POJO`와 설정 정보`Configuration metadata`를 `Spring IoC Container`에 주입시키면 `Bean`으로 등록, 사용이 가능