# Backend
## 기술 스택
Server + Backend: SpringBoot<br/>
Databases: MySQL


## 아키텍쳐
<img width="541" alt="image" src="https://github.com/namu-thon/Backend/assets/62535887/2d9350e6-8211-4c1a-b69a-5bef1e73437b">


## 프로젝트 구조

```
namuwiki
├── HELP.md
├── README.md
├── build
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── gsafe1213@35.230.7.72
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── namuton
    │   │       └── namuwiki
    │   │           ├── NamuwikiApplication.java
    │   │           ├── config
    │   │           │   └── CorsFilter.java
    │   │           └── domain
    │   │               ├── darkData
    │   │               │   ├── controller
    │   │               │   │   └── DarkDataController.java
    │   │               │   ├── domain
    │   │               │   │   └── DarkData.java
    │   │               │   ├── repository
    │   │               │   │   └── DarkDataRepository.java
    │   │               │   └── service
    │   │               │       └── DarkDataService.java
    │   │               ├── data
    │   │               │   ├── controller
    │   │               │   │   └── DataController.java
    │   │               │   ├── domain
    │   │               │   │   └── Data.java
    │   │               │   ├── repository
    │   │               │   │   └── DataRepository.java
    │   │               │   └── service
    │   │               │       └── DataService.java
    │   │               └── user
    │   │                   ├── controller
    │   │                   │   └── UserController.java
    │   │                   ├── domain
    │   │                   │   └── User.java
    │   │                   ├── dto
    │   │                   ├── repository
    │   │                   │   └── UserRepository.java
    │   │                   └── service
    │   │                       └── UserService.java
    │   └── resources
    │       ├── application-jwt.yml
    │       ├── application-oauth.yml
    │       ├── application-prod.yml
    │       ├── application.yml
    │       ├── static
    │       └── templates
    └── test
        └── java
            └── namuton
                └── namuwiki
                    └── NamuwikiApplicationTests.java

75 directories, 50 files
```
