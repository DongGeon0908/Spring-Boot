### `GIT`

- 형상 관리 도구 `Configuration Management Tool`
    + 버전 관리 시스템
 - 소프트웨어를 개발하는 기업의 핵심 자산인 소스코드를 효과적으로 관리할 수 있게 해주는 무료, 공개소프트웨어
 - 분산형 관리 시스템
- 소스코드를 여러 개발 PC와 저장소에 분산해서 저장
- 중앙 서버에 장애가 발생해도 로컬 저장소에 커밋을 할 수 있음
- 로컬 저장소들을 이용하여 중앙 저장소의 복원 가능
- 깃의 특징
    + `Distributed development`
        * 전체 개발 이력을 각 개발자의 로컬로 복사본을 제공하고 변경된 이력을 다시 하나의 저장소로 복사
        * 이러한 변경은 추가개발지점을 가져와, 로컬개발 지점과 동일하게 병합
        * 저장소는 `Git protocol 및 HTTP`로 쉽고 효율적으로 접근 가능
    + `Strong support for non-linear development`
    *  신속하고 편리항 `branch 및 merge` 지원
    * 비선형 개발 이력을 시각화하고 탐색 할 수 있는 강력한 도구 제공 
    + `Efficient handling of large projects`
        * Git은 매우 빠르고, 대형프로젝트나 이력이 많은 작업에 합리적
        * Git은 대부분의 다른 버전관리시스템보다 빠르게 요청
        * 최근의 정상급 오픈소스 버전관리 시스템보다 장기간의 수정내역을 매우 효율적인 압축방법을 사용
    + `Cryptographic authentication of history`
        * GIt의 이력은  성공한 개발이력의 commit에 의해 개정명으로 저장
    + `Toolkit design`
        * UNIX의 전통에 따라, GIT은 C로 작성된 많은 소규모 도구모음 
        * 많은 스크립트들이 기능 보강을 제공
        * 새로운 기발한 작업을 위한 손쉬운 사용과 쉬운 스크립팅을 위한 도구를 제공