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
- **delilog-core**
  - **core-api**
      - Client와 통신하는데 사용되는 Controller 클래스
      - Client와 통신하는데 사용되는 DTO 클래스
  - **core-domain**
    - 비즈니스 로직을 처리하는 Service 클래스
    - 도메인 객체
- **delilog-db**
  - 테이블과 매칭되는 enity
  - repository 구현체