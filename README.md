# Letmein
![제목을-입력해주세요_-001](https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/142488306/fe4ea166-b409-4659-867d-7cc73c32dd9b)


### 제작 기간 : 24.02.01 ~ 24.02.28

## 1. 서비스 소개

   ###  yolo 기반 체형확인 및 패션 스타일러  플랫폼

    1. 업로드한 사진에서 사용자의 체형을 분석하는 서비스 제공
    2. 여러가지 체형의 아바타에 추천 의상을 가상피팅하는 서비스 제공
    3. 코디를 공유할 수 있는 커뮤티니 제공

# 2. 주요 기능
<details>
    <summary>기능 보기</summary>

   ### 2-1 체형 분석 기능
   
   ![제목을-입력해주세요_-001 (1)](https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/142488306/27ec85ab-81ac-4c5a-ad8d-f1533022278e)
   
   ![image](https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/142488306/b95fe8d5-e11d-410b-8a2a-31f870ac9613)

   - 업로드한 사진에서 Face Detecting 수행하여 얼굴부분 추출
   - 추출한 사진에서 Gender Detecting을 사용하여 성별 분류
   - YOLOv8 Segment와 Mediapipe을 사용하여 체형 분석
   - 어깨와 골반 너비를 비교해 체형 등록 후 해당 체형에 해당하는 아바타 생성 
     - 어깨 > 골반 : 역삼각형
     - 어깨 = 골반 : 직사각형/모래시계형
     - 어깨 < 골반 : 삼각형

   ### 2-2 아바타 기능

   ![제목을-입력해주세요_-001 (2)](https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/142488306/1a7a829d-097a-48d1-8713-fc802da35e65)

- Avatar에 masking, parse, openpose을 수행
- Cloth에 masking을 수행
- GMM 모델을 사용하여 옷을 아바타의 크기와 위치에 맞추고 자세에 따라 변형
- TOM 모델을 사용하여 매끄럽게 처리
- 체형에 맞는 아바타를 생성
- 체형에 베스트 코디 가상 피팅 서비스
   
### 2-3 커뮤니티 기능
- 무한스크롤 기능 -> 모바일에 최적화
- 인기순 / 최신순 정렬
- 작성자 / 제목 기준 검색
- 로그인 시 자유롭게 코디/아바타 등의 글 업로드 -> 마이페이지에서 확인 가능
- 좋아요 기능 구현 -> 마이페이지에서 확인 가능
- 이미지 업로드 시 AWS S3에 저장
  
### 2-4 마이페이지 기능

![001](https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/142488306/f65c6bd3-871a-42d7-944d-33b1030b031a)

![002](https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/142488306/2c414416-61c1-4fbf-8822-0d52f1116e5b)

- 1. 프로필 수정 기능
- 2. 고객문의 페이지 이동
- 작성한 글 목록 확인
- 좋아요 누른 글 목록 확인
- 3. 고객센터 1:1 문의글 작성
- 4. 문의글 답변 확인
 
### 2-5 관리자 페이지 기능

![제목을-입력해주세요_-018](https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/142488306/037287cd-f1f6-47db-bee4-ac691fea132d)

- 1. 회원탈퇴 기능
- 2. 답변전 문의글 확인
- 3. 문의글 답변 기능

</details>


# 3. 사용 언어 및 도구
| 구분         | 내용               |
|--------------|-------------------|
| LANGUAGE    | <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" /> <img src="https://img.shields.io/badge/Python-14354C?style=for-the-badge&logo=python&logoColor=white" /> <img src="https://img.shields.io/badge/HTML-239120?style=for-the-badge&logo=html5&logoColor=white" /> <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white" /> <img src="https://img.shields.io/badge/CSS-239120?style=for-the-badge&logo=css3&logoColor=white" /> |
| DB  | <img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=black" />|
| Collaboration |<img src="https://bookface-images.s3.amazonaws.com/logos/1f147b7526b12554a4ea7cd2312a694892459acc.png?1630010761" width="90"> |
| BACK-END  |  ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)|
| FRONT-END  | ![React](https://img.shields.io/badge/react-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB)|
| storage   | ![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white) |
| Framework | <img src="https://img.shields.io/badge/TensorFlow-FF6F00?style=for-the-badge&logo=tensorflow&logoColor=white" />  ![PyTorch](https://img.shields.io/badge/PyTorch-%23EE4C2C.svg?style=for-the-badge&logo=PyTorch&logoColor=white)  |
| WebServer    | ![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black) <img src="https://img.shields.io/badge/Flask-000000?style=for-the-badge&logo=flask&logoColor=white" />   |
| IDE   | <img src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white" /> ![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)|
| CLOUD   | ![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white) |



# 4. 시스템 흐름도

![제목을 입력해주세요_-001](https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/142488306/fba40d8b-1ac1-43f9-a72d-9ef4198d56b3)



# 5. ER 다이어그램

![2](https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/123911778/7ad2409c-7309-4c30-93e2-094589d994c4)




# 6. 시스템 아키텍처

![제목을-입력해주세요_-014](https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/142488306/153acd97-7efd-4569-9ab5-cbe95bde1e3c)



# 7. 화면 구성

<details>
    <summary>화면구성 보기</summary>
<!-- summary 아래 한칸 공백 두고 내용 삽입 -->
   
   #### 7-1 메인 페이지
   ![제목 없는 동영상 - Clipchamp로 제작](https://github.com/yusuyeon1111/portfolio/assets/142488306/e94a754c-fa5c-4b7a-b925-be1531f704f0)

   #### 7-2 회원가입 & 로그인 페이지
   ![제목 없는 동영상 - Clipchamp로 제작](https://github.com/yusuyeon1111/portfolio/assets/142488306/f06b7c39-26ac-47eb-af1f-bc2d8ed32edc)
   
   #### 7-3 커뮤니티 페이지
 ![-Clipchamp3-ezgif com-video-to-gif-converter](https://github.com/yusuyeon1111/portfolio/assets/142488306/b5dfbf08-3f8d-4344-bc32-18f00510663f)
 
   #### 7-4 마이페이지 & 고객센터 페이지
![-Clipchamp5-ezgif com-video-to-gif-converter](https://github.com/yusuyeon1111/portfolio/assets/142488306/3d90494b-3cd9-4401-8763-cca21fa97364)

   #### 7-5 이미지 업로드 & 체형 분석 결과 페이지
![제목 없는 동영상 - Clipchamp로 제작 (1)](https://github.com/yusuyeon1111/portfolio/assets/142488306/f3d0c30a-822e-4ffa-9381-7b83d1868d7b)

   #### 7-6 사이즈 등록 페이지
![제목 없는 동영상 - Clipchamp로 제작 (1)](https://github.com/yusuyeon1111/portfolio/assets/142488306/f2eb06b4-19fb-4061-9660-477c28c7c9d0)

   #### 7-7 아바타 페이지
![제목 없는 동영상 - Clipchamp로 제작 (3)](https://github.com/yusuyeon1111/portfolio/assets/142488306/7ac9ad8e-718b-4b45-930a-8e6966b6eed4)

   #### 7-8 관리자 페이지
 ![image](https://github.com/yusuyeon1111/portfolio/assets/142488306/919ebf59-9f54-4013-976c-cf189de56682)
 
</details>

# 8. 트러블 슈팅
<details>
   <summary> 1. 모델링 성능 이슈 </summary>

<img width="594" alt="스크린샷 2024-03-06 190615" src="https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/123911778/8f8d05bc-a5b0-4921-b73c-2f2b7cc0b4d8">

## 8-1) 분류 모델 성능 개선
- OpenCV에 내장되어 있는 caffe 모델을 사용했을 때 모든 아바타를 남성으로 판단하는 문제가 발생
- Face Detecting을 수행하지 못하거나 짧은 머리의 여성을 남성으로 오분류
- Face Detecting을 먼저 수행하고 분류 모델을 Tensorflow Keras의 Gender Detecting으로 모델을 변경
- 98.58%까지 정확도를 개선함

<img width="586" alt="스크린샷 2024-03-06 190623" src="https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/123911778/9574b02c-6cf7-4319-a1f8-55d2a979adae">

## 8-2) Segment 모델 성능 개선
- YOLOv8 Segment 모델은 사람을 판별하는데 특화된 모델이 아니어서 사람 이외의 것이 출력되고 성능이 높지 않은 문제 발생
- Roboflow의 Instance Segment 모델을 사용하여 약 1,000장의 사람 이미지를 데이터로 학습함.
- 정확도를 44.5%에서 92.4%까지 개선함.

<img width="594" alt="스크린샷 2024-03-06 190646" src="https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/assets/123911778/b5fa0a1f-7b5f-4739-9577-59422bf92dac">


## 8-3) 가상 피팅 모델 성능 개선
- VTON에서 준비한 데이터셋에서는 Virtual Try on 모델을 사용했을 때 높은 성능을 보임
- 추가로 준비한 아바타와 의상에 대해서는 옷의 위치가 크기가 맞지 않거나 그림이 뭉게지는 문제가 발생
- 아바타와 의상의 전처리 과정을 확인하여 잘못되거나 누락된 값을 찾아 수정하여 성능 개선.


</details>

<details>
   <summary> 2. 호환 문제 </summary>

## 8-4) GPU 드라이버와 Python 라이브러리 호환 문제
- Virtual Try on 모델을 사용할 때 Pytorch 프레임워크를 사용하면서 GPU를 사용.
- GPU를 사용하기 위한 Cuda, Cudnn, Pytorch와 기타 라이브러리의 버전이 일치하지 않아 문제가 발생
- 개발시 RTX2070 그래픽 카드로 개발하였으나 배포시 AWS EC2에서는 T80을 사용하여 버전 충돌
- T80에 호환되는 NVIDIA-DRIVER-470, CUDA11, Pytorch-1.8로 버전을 바꾸어 사용하여 문제 해결


</details>

</details>

<details>
   <summary> 3. AWS 클라우드 서비스 문제 </summary>

## 8-5) EC2에서 GPU 사용
- AWS EC2에서 GPU을 사용하기 위해서는 vCPU을 할당받아야 한다.
- vCPU은 SUPPORT에서 인스턴스마다 필요한 vCPU을 검색한 다음 필요한만큼 신청이 가능하다.
- vCPU을 신청하면 AWS에서 검토한 후 약 하루 뒤에 승인한다.
- AWS을 오래 사용하지 않은 계정의 경우 과금을 막기 위해 적은 용량의 신청을 제안한다.
- P2.xlarge의 경우 하나당 4의 vCPU을 사용하여 8의 vCPU을 신청하여 2개의 EC2을 생성하는데 사용했다.

## 8-6) S3 Policy
- AWS의 S3은 데이터를 저장하는 클라우드 저장소이다.
- S3은 접근 권한을 막기 위한 Policy가 존재하는데 AWS Policy Generator을 사용하여 접근 권한을 부여했다.
- 모든 사용자에 대하여 S3 접근 권한을 부여하면 저장소의 이름이 url에 그대로 나타나기에
- CloudFront을 사용하여 url을 변경하였다.

## 8-7) EC2에 배포
  ### (1) Spring 배포
- Spring을 EC2에 배포하기 위해서는 이클립스에서 build을 수행하여 jar 파일을 생성한다.
- Github에 jar 파일을 올린 다음 EC2에서 git clone을 실행한다.
- EC2에 java을 설치한다.
- java -jar (jar 파일명)을 사용하여 파일을 실행한다.
- 배포시 한국 ORACLE과 AWS의 Region 시간이 맞지 않아 timezone region not found 에러가 발생
- 이클립스에서 timezone을 무시하는 코드를 추가하여 문제 해결

   ### (2) Flask 배포
- github에 Python 코드를 업로드
- EC2에서 프로젝트를 다운로드
- 가상환경 구축 후 Python과 Library를 버전에 맞게 설치
- Python 파일을 실행
- Spring과 Flask은 EC2를 꺼도 서버가 유지될 수 있도록 nohub을 사용하여 실행했다.
- EC2을 실행할 때마다 IP 주소가 달라지는 것을 막기 위해 탄력적 퍼블릭 IP 주소를 할당받았다.

  ### (3) React 배포 (S3)
- VScode에서 npm build을 실행하여 build 폴더를 생성
- S3에 build 폴더를 업로드한다.
- S3에서 IP 주소를 받아 접속한다.
- 같이 배포한 Spring, Flask와 CORs 문제가 발생하여 CloudFront을 사용하여 문제를 해결했다.

</details>

# 9. 참고문헌

- Virtual Try on을 사용한 가상피팅
(https://github.com/minar09/cp-vton-plus)


# 10. 개발환경
|                     분류 | 설명                                                              |
|-------------------------:|-------------------------------------------------------------------|
| 운영체제                 | Windows10                                                         |
| 버전 관리 시스템         | Github                                                            |
| 개발 도구                | Eclipse IDE (2023-06), Jupyter notebook, vs code                  |
| 개발 언어 및 프레임 워크 | Java 1.8.0_202, Js, Python 3.11.4, conda 23.7.2                   |
| 데이터 베이스            | ORACLE 11                                                         |
| 하드웨어                 | NVIDIA GeForce RTX 2070,Intel(R) Core(TM) i7-10700 CPU,RAM 16.0GB |



# 11. 팀원소개
| <a href="https://github.com/kkksssmmmm"><img src="https://avatars.githubusercontent.com/u/105231826?v=4" width="100px;" height="100px;" alt=""/><br /><sub><b> 팀장 : 김성민</b></sub></a> | <a href="https://github.com/Jinkyun0328"><img src="https://avatars.githubusercontent.com/u/123911778?v=4" width="100px;" alt=""/><br /><sub><b> 부팀장 : 최진균</b></sub></a> | <a href="https://github.com/yusuyeon1111"><img src="https://avatars.githubusercontent.com/u/117277864?v=4" width="100px;" alt=""/><br /><sub><b> 팀원 : 유수연</b></sub></a> | <a href="https://github.com/phc1235"><img src="https://avatars.githubusercontent.com/u/142488051?v=4" width="100px;" alt=""/><br /><sub><b> 팀원 : 하동철</b></sub></a> |
|:----------------:|---------------------|------------------------ |------------------------|
| 프로젝트 기획     | AI 모델링            | BACK-END 개발           | 데이터 수집 및 전처리    |
| BACK-END 개발    | AWS 클라우스 서비스   | FRONT-END 개발          | DB 모델링               |
| FRONT-END 개발   | Flask 서버 구축      |                         |                         |                                            

# 12. 링크
|                     이름 | 설명                                                              | 링크                                                                |
|-------------------------:|-------------------------------------------------------------------:|-------------------------------------------------------------------|
| Letmein                  | Spring Boot  |      https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein/tree/main                                                              |
| Letmein-Front            | React           |     https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein-front                                                               |
| Letmein-Flask            | Flask            |    https://github.com/2023-SMHRD-IS-CLOUD-1/Letmein-Flask                                                               |







