# Delilog

한국의 yelp
맛집 검색 / 리뷰 / 예약 플랫폼

### Tech Stack
`Kotlin 1.9.25`, `SpringBoot 3.4.5`, `JPA`, `H2`, `RestDocs`,  `WebClient`

### Event Storming
<img src="/assets/event_storming.png">

### ERD
<img src="/assets/erd.png">

### Module
- **delilog-api**
    - Client와 통신하는데 사용되는 Controller 클래스
    - Client와 통신하는데 사용되는 DTO 클래스
- **delilog-application**
    - 비즈니스 로직을 처리하는 Service 클래스
- **delilog-domain**
    - 도메인 객체
    - 외부 연동에 사용되는 인터페이스
        - ex) jpa repository
- **delilog-infra**
    - 외부 시스템과 연동되는데 사용되는 domain 레이어의 인터페이스들에 대한 구현체
    - 외부 시스템과의 통신에 사용되는 DTO

<img src="/assets/module.png" height=500px>