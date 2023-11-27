![가로로고-photoaidcom-invert-removebg-preview](https://github.com/yoonoi/PetMeeting2/assets/94058311/e492034e-02bc-40dd-a8de-d0e7279960e6)
### 삼성 청년 SW 아카데미 공통프로젝트 최우수상
### 2023.07.10 ~ 2023.08.18
<br><br>

## Project Introduction
 유기견과 실시간 상호작용이 가능한 『유기견 입양 홍보 프로젝트』입니다.
실시간 웹캠을 통해 유기견의 상태를 확인할 수 있으며, 간식 디스펜서를 작동시켜 강아지에게 간식을 먹여줄 수 있습니다. 또한 IOT 장난감을 실시간으로 조작하여 원격으로 강아지와 놀아줄 수도 있습니다. 
실시간 상호작용을 통해 강아지에 대한 애정을 키워 입양 홍보 및 확대가 가능합니다.


## Service Architecture
![flowchart](./assets/FlowChart.png)

## Services
### **1. 회원가입**
![회원가입](./assets/PetMeeting영상모음/공통%20GIF/1.%20회원가입.gif)

### **2. 충전**
![충전](./assets/PetMeeting영상모음/공통%20GIF/2.%20충전.gif)

### **3. 입양신청**
![회원가입](./assets/PetMeeting영상모음/공통%20GIF/1.%20회원가입.gif)

### **4. IOT기기조작**
![IOT](./assets/PetMeeting영상모음/공통%20GIF/11.%20IoT%20기기%20조작.gif)

### **5. 유기견 상세 및 후원**
![상세 및 후원](./assets/PetMeeting영상모음/공통%20GIF/7.%20유기견%20상세%20및%20후원.gif)

### **6. 입양후기**
![입양후기](./assets/PetMeeting영상모음/공통%20GIF/3.%20입양후기.gif)

### **7. 문의게시판**
![문의게시판](./assets/PetMeeting영상모음/공통%20GIF/4.%20문의게시판.gif)

### **8. 마이페이지**
![문의게시판](./assets/PetMeeting영상모음/공통%20GIF/8.%20마이페이지.gif)

### **9. 이용방법**
![문의게시판](./assets/PetMeeting영상모음/공통%20GIF/5.%20이용방법.gif)

<br><br>

## 팀원 및 역할

| 이름                      | 역할       | 설명                                                         |
| ------------------------- | ---------- | ------------------------------------------------------------ |
| 이재홍 (팀장)             | IOT, Infra | ATmega128, Raspberry Pi 기반 DC 모터 제어, esp-01 모듈을 이용한 wifi 통신, node.js를 이용한 IoT backend 웹 서버 운용, Docker와 Docker Compose를 이용한 서비스 가상화 및 오케스트레이션, Nginx를 이용한 리버스 프록시 기능 구현, Shell script를 이용한 배포 및 이미지 빌드 자동화 |
| 안희준                    | IOT | ATmega128 기반으로 DC motor 제어, esp-01 wifi 모듈로 web server와 TCP 통신, 3D printer를 활용하여 custom 하드웨어 부품 디자인, 제작 |
| 김두희<br/>BackEnd Leader | Full Stack | Backend : 카카오페이 결제, SSE 적용, Spring Security + JWT를 이용한 인증 및 권한 인가, Docker를 이용한 Redis 구축 및 적용, CRUD - JPA, QueryDSL 활용 (회원, 보호소, 관리자, 입양후기게시글, 입양후기게시글댓글, 게시글 좋아요 및 취소, 후원, IoT, 입양신청, 결제내역) <br/> Frontend : 입양후기 게시판 페이지, SSE 적용, 보호소 후원랭킹 페이지 (React + MobX)<br/> 설계 : ERD 설계 및 최종 마무리, API 명세 작성, 목업 작성 |
| 조윤영                    | Full Stack | "백엔드 로직, 웹 디자인, JPA를 이용한 DB 매핑, queryDsl을 사용한 ddl 등등" |
| 이민웅<br/>FrontEnd Leader| Full Stack | 퍼블리싱, Components 구조 설계, Page Layout 설계, OpenVidu 기반 WebRTC 연결, IOT기기, 보호소, 유기견 API 통신 로직 개발 |
| 김영우<br/>발표 및 시연 | Full Stack, Infra | "Jira, GitLab, Jenkins 기반 CI/CD 구축 로그인, 회원가입 로직 구현, token 인증, 회원 및 게시판 API 통신 로직 구현" |


