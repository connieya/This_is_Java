# NIO 소개

자바 4부터 새로운 입출력(NIO:New Input/Output) 이라는 뜻에서 java.nio 패키지가 포함되었는데,
자바 7로 버전업하면서 자바 IO와 NIO 사이의 일관성 없는 클래스 설계를 바로 잡고, 비동기 채널 등의
네트워크 지원을 대폭 강화한 NIO.2.API가 추가되었다. NIO.2는 java.nio2 패키지로 제공되지 않고
기존 java.nio의 하위 패키지(java.nio.channels, java.nio.charset, java.nio.file)에 통합되어 있다.
이 책에서는 NIO와 NIO.2를 구별하지 않고 그냥 NIO로 부르기로 하겠다.

|NIO 패키지| 포함되어 있는 내용 |
| ----| :----|
|java.nio|다양한 버퍼클래스
|java.nio.channels | 파일 채널 , TCP 채널 , UDP 채널 등의 클래스
| java.nio.channels.spi | java.nio.channels 패키지를 위한 서비스 제공자 클래스
|java.nio.charset | 문자셋,인코더, 디코더  API
|java.nio.charset.spi| java.nio.charset 패키지를 위한 서비스 제공자 클래스
|java.nio.file| 파일 및 파일 시스템에 접근하기 위한 클래스
|java.nio.file.attribute| 파일 및 파일 시스템의 속성에 접근하기 위한 클래스
|java.nio.file.spi| java.nio.file 패키지를 위한 서비스 제공자 클래스

