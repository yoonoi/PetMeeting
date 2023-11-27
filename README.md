![가로로고-photoaidcom-invert-removebg-preview](https://github.com/yoonoi/PetMeeting2/assets/94058311/e492034e-02bc-40dd-a8de-d0e7279960e6)
### 🥇 삼성 청년 SW 아카데미 공통프로젝트 최우수상 (2023.07.10 ~ 2023.08.18)

## Project Introduction
 유기견과 실시간 상호작용이 가능한 『유기견 입양 홍보 프로젝트』입니다.  
실시간 웹캠을 통해 유기견의 상태를 확인할 수 있으며, 간식 디스펜서를 작동시켜 강아지에게 간식을 먹여줄 수 있습니다.   
또한 IOT 장난감을 실시간으로 조작하여 원격으로 강아지와 놀아줄 수도 있습니다.   
귀여운 유기견들과의 실시간 상호작용을 통해 강아지에 대한 애정을 키워 입양 홍보 및 확대가 가능합니다.  


## Service Architecture
![Petmeeting_architecture](https://github.com/yoonoi/PetMeeting/assets/94058311/06e3e0f3-b640-405e-8204-d89df7900e68)


## Services
### 코인 충전
![2  충전](https://github.com/yoonoi/PetMeeting/assets/94058311/f12bfa1b-d0fe-4926-9179-c8e6f6fa92cd)

### 입양 신청
![9  입양신청](https://github.com/yoonoi/PetMeeting/assets/94058311/69227207-ae20-4aae-a81f-f3269504c03a)

### IOT 기기 조적
![11  IoT 기기 조작](https://github.com/yoonoi/PetMeeting/assets/94058311/5d1a8af3-3cb2-4408-b7c6-e7a3d81005e5)

### 유기견 상세 및 후원
![7  유기견 상세 및 후원](https://github.com/yoonoi/PetMeeting/assets/94058311/0c706288-a0fc-47d5-b936-d05d703f020c)

### 보호소 상세
![6  보호소상세](https://github.com/yoonoi/PetMeeting/assets/94058311/e7e253a7-12b4-4df2-92c0-19cde70b342d)

### 마이페이지
![8  마이페이지](https://github.com/yoonoi/PetMeeting/assets/94058311/fc06a3eb-3798-4a47-b7aa-787c9e200840)

### 이용방법
![5  이용방법](https://github.com/yoonoi/PetMeeting/assets/94058311/7bb0ab21-7c30-433d-97c9-f809a6d8cdaa)


<br><br>

## 팀원 및 역할

| 이름                      | 역할       | 설명                                                         |
| ------------------------- | ---------- | ------------------------------------------------------------ |
| 조윤영                    | Full Stack | "유기견, 문의게시판, 입양신청 도메인 및 좋아요 & 찜 기능 구현, 웹 디자인, JPA, queryDsl" |
| 이재홍 (팀장)             | IOT, Infra | ATmega128, Raspberry Pi 기반 DC 모터 제어, esp-01 모듈을 이용한 wifi 통신, node.js를 이용한 IoT backend 웹 서버 운용, Docker와 Docker Compose를 이용한 서비스 가상화 및 오케스트레이션, Nginx를 이용한 리버스 프록시 기능 구현, Shell script를 이용한 배포 및 이미지 빌드 자동화 |
| 안희준                    | IOT | ATmega128 기반으로 DC motor 제어, esp-01 wifi 모듈로 web server와 TCP 통신, 3D printer를 활용하여 custom 하드웨어 부품 디자인, 제작 |
| 김두희<br/>BackEnd Leader | Full Stack | Backend : 카카오페이 결제, SSE 적용, Spring Security + JWT를 이용한 인증 및 권한 인가, Docker를 이용한 Redis 구축 및 적용, CRUD - JPA, QueryDSL 활용 (회원, 보호소, 관리자, 입양후기게시글, 입양후기게시글댓글, 게시글 좋아요 및 취소, 후원, IoT, 입양신청, 결제내역) <br/> Frontend : 입양후기 게시판 페이지, SSE 적용, 보호소 후원랭킹 페이지 (React + MobX)<br/> 설계 : ERD 설계 및 최종 마무리, API 명세 작성, 목업 작성 |
| 이민웅<br/>FrontEnd Leader| Full Stack | 퍼블리싱, Components 구조 설계, Page Layout 설계, OpenVidu 기반 WebRTC 연결, IOT기기, 보호소, 유기견 API 통신 로직 개발 |
| 김영우<br/>발표 및 시연 | Full Stack, Infra | "Jira, GitLab, Jenkins 기반 CI/CD 구축 로그인, 회원가입 로직 구현, token 인증, 회원 및 게시판 API 통신 로직 구현" |


