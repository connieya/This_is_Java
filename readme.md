# 이것이 자바다 (This is Java)

*****
## chapter 1 . 자바시작하기

## chapter 2. 변수와 타입

## chapter 3. 연산자

## chapter 4. 조건문과 반복문

## chapter 5. 참조 타입
- ### 데이터 타입 분류
- ### 메모리 사용 영역
- ### 참조 변수의 ==, != 연산
- ### null 과 NullPointerException
- ### String 타입
- ### 배열 타입
    - #### 배열이란?
    - #### 배열 선언
    - #### [값 목록으로 배열 생성](src/chap05/sec06/exam03_array_value/값목록으로배열생성.md)
    - #### [new 연산자로 배열 생성](src/chap05/sec06/exam04_new_array)
    - #### 배열 길이
    - #### [커맨드 라인 입력](src/chap05/sec06/exam06_commandline/MainStringArrayArgument.java)
    - #### 다차원 배열
    - #### [객체를 참조하는 배열](src/chap05/sec06/exam08_array_reference_object/객체참조배열.md)]
    - #### 배열복사
    
## chapter 6. 클래스

- ### 메소드
    - #### 메소드 선언
    - #### 리턴(return)문
    - #### 메소드 호춮
    - #### [메소드 오버로딩](src/chap06/sec08/exam04_method_overloading)
    
- ### [인스턴스 멤버와 this](src/chap06/sec09/exam01_instance_this) 

- ### [정적 멤버와 static](src/chap06/sec10/정적멤버.md)
    - #### [정적 멤버 사용](src/chap06/sec10/exam02_static_member)
    - #### [정적 초기화 블록](src/chap06/sec10/정적초기화블록.md)
    - #### [정적 메소드와 블록 선언시 주의할점](src/chap06/sec10/정적메소드와블록.md)
    - #### [싱글톤(Singleton)](src/chap06/sec10/exam05_singleton)
    
- ### final 필드와 상수
    - #### [final 필드](src/chap06/sec11/exam01_final_field)
    - #### [상수(static final)](src/chap06/sec11/exam02_static_final)

- ### 패키지 
- ### 접근 제한자
    - #### [클래스의 접근 제한](src/chap06/sec13/exam01_class_access)
    - #### [생성자의 접근 제한](src/chap06/sec13/exam02_constructor_access)
    - #### [필드와 메소드의 접근 제한](src/chap06/sec13/exam03_field_method_access)
    
- ### Getter 와 Setter 메소드 

- ### 어노테이션


## chapter 7. 상속
- ### 클래스 상속
- ### 부모 생성자 호출
- ### 메소드 재정의
    - #### 메소드 재정의(@Override)
    - #### 부모 메소드 호출(super)
- ### final 클래스와 final 메소드
    - #### [상속할 수 없는 final 클래스](src/chap07/sec05/exam01_final_class)
    - #### [오버라이딩할 수 없는 final 메소드](src/chap07/sec05/exam02_final_method)
- ### [protected 접근 제한자](src/chap07/sec06)

- ### 타입 변환과 다형성
  - #### [자동 타입 변환(Promotion)](src/chap07/sec07/exam01_promotion)
  - #### [필드의 다형성](src/chap07/sec07/exam02_field_polymorphism)
  - #### [하나의 배열로 객체관리](src/chap07/sec07/exam03_array_polymorphism)
  - #### [매개변수의 다형성](src/chap07/sec07/exam04_parmeter_polymorphism)
  - #### [강제 타입 변환(Casting)](src/chap07/sec07/exam05_casting)
  - #### [객체타입 확인 ](src/chap07/sec07/exam06_instanceof) 
   
- ### 추상 클래스
    - #### 추상 클래스의 개념
    - #### 추상 클래스의 용도
    - #### [추상 클래스 선언](src/chap07/sec08/exam03_abstract_class)
    - #### [추상 메소드와 오버라이딩](src/chap07/sec08/exam04_abstract_method)
    
## chapter 8. 인터페이스

- ### 인터페이스의 역할

- ### 인터페이스 선언
    - #### [인터페이스 선언](src/chap08/sec02/exam01_interface_declaration/RemoteControl.java) 
    - #### [상수 필드 선언](src/chap08/sec02/exam02_constant_field/RemoteControl.java)
    - #### [추상 메소드 선언](src/chap08/sec02/exam03_abstract_method/RemoteControl.java)
    - #### [디폴트 메소드 선언](src/chap08/sec02/exam04_default_method/RemoteControl.java)
    - #### [정적 메소드 선언 ](src/chap08/sec02/exam05_static_method/RemoteControl.java)   

- ### 인터페이스 구현
    - #### [구현클래스](src/chap08/sec03/exam01_name_implement_class)
    - #### [익명 구현 객체](src/chap08/sec03/exam02_noname_implement_class)
    - #### [다중 인터페이스 구현 클래스](src/chap08/sec03/exam03_multi_implement_class)
    
- ### 인터페이스 사용
    - #### [추상 메소드 사용](src/chap08/sec04/exam01_abstract_method_use)
    - #### [디폴트 메소드 사용](src/chap08/sec04/exam02_default_method_use)
    - #### [정적 메소드 사용](src/chap08/sec04/exam03_static_method_use)
    
- ### 타입 변환과 다형성
    - #### 자동 터입 변환(Promotion)
    - #### [필드의 다형성](src/chap08/sec05/exam01_filed_polymorphism)
    - #### [인터페이스 배열로 구현 객체 관리](src/chap08/sec05/exam02_field_array)
    - #### [매개 변수의 다형성](src/chap08/sec05/exam03_method_polymorphism)
    - #### [강제 타입 변환(Casting)](src/chap08/sec05/exam04_casting)
    - #### [객체 타입 확인(instanceof)](src/chap08/sec05/exam05_instanceof)
  
- ### [인터페이스 상속](src/chap08/sec06/interface_inheritance)

- ### 디폴트 메소드와 인터페이스 확장
    - #### [디폴트 메소드의 필요성](src/chap08/sec07/exam01_default_method)
    - #### [디폴트 메소드가 있는 인터페이스 상속](src/chap08/sec07/exam02_default_method_inheritance)

## chapter 9. 중첩 클래스와 중첩 인터페이스

- ### 중첩 클래스와 중첩 인터페이스란?
- ### 중첩 클래스
    - #### 인스턴스 멤버 클래스
    - #### 정적 멤버 클래스
    - #### [로컬 클래스](src/chap09/sec02/exam03_local_class)
    
- ### 중첩 클래스의 접근 제한
    - #### [바깥 필드와 메소드에서 사용 제한](src/chap09/sec03/exam01_field_method/A.java)
    - #### [멤버 클래스에서 사용 제한](src/chap09/sec03/exam02_member_class/멤버클래스.md)
    - #### [로컬 클래스에서 사용 제한](src/chap09/sec03/exam03_local_class_restrict/Outter.java)
    - #### [중첩 클래스에서 바깥 클래스 참조 얻기](src/chap09/sec03/exam04_nesting_class_reference/바깥클래스참조.md)
    
- ### [중첩 인터페이스](src/chap09/sec04/nesting_interface/중첩인터페이스.md)

- ### 익명 객체
    - #### [익명 자식 객체 생성](src/chap09/sec05/anonymous_object)


## chapter 10. 예외 처리
- ### [예외와 예외 클래스](src/chap10/sec01/예외.md)
  
- ### 실행 예외
  
  - #### [NullPointerException](src/chap10/sec02/exam01_null_point/Null.md)
  - #### [ArrayIndexOutOfBoundsException](src/chap10/sec02/exam02_array_index)
  - #### [NumberFormatException](src/chap10/sec02/exam03_number_format/NumberFormatExceptionExample.java)
  - #### [ClassCastException](src/chap10/sec02/exam04_class_cast/ClassCastExceptionExample.java)  
        
    
- ### [예외 처리 코드](src/chap10/sec03/예외처리코드.md)
- ### 예외 종류에 따른 처리 코드
  - #### 다중 catch
  - #### catch 순서 
  - #### 멀티 catch  
- ### [자동 리소스 닫기](src/chap10/sec05)
- ### 예외 떠넘기기
- ### [사용자 정의 예외와 예외 발생](src/chap10/sec07/사용자정의예외.md)
    - #### [사용자 정의 예외 클래스 선언](src/chap10/sec07/exam01_application_exception/BalanceInsufficientException.java)
    - #### [예외 발생시키기](src/chap10/sec07/exam02_throw_application/Account.java)
- ### 예외 정보 얻기


## chapter 11. 기본 API 클래스
  - ### 자바 API 도큐먼트
  - ### java.lang 과 java.util 패키지
  - ### Object 클래스
    - #### [객체비교( equals() ) ](src/chap11/sec03/exam01_equals)
    - #### [객체 해시코드(hashCode() )](src/chap11/sec03/exam02_hashcode/해시코드.md)
    - #### [객체문자정보(toStrng() )]()
    - #### [객체 복제(clone () ) ]()
    - #### [객체 소멸자 finalize()]()
    
  - ### Objects 클래스
    - #### [객체 비교 compare]()
    - #### [동등비교 - eqauls() , deepEquals()]()
    - #### [해시코드 생성 - hash() , hashCode()]()
    - #### [널 여부조사 - isNUll() , nonNull() , requireNonNull()]()
    - #### [객체 문자 정보 - toString()]()
    
  - ### System 클래스
    - #### [프로그램 종료 - exit()](src/chap11/sec05/exam01_system_exit/ExitExample.java)
    - #### [쓰레기 수집기 실행 - gc()](src/chap11/sec05/exam02_system_gc/GcExample.java)
    - #### [현재 시간 읽기 , currentTimeMillis , nanoTime](src/chap11/sec05/exam03_currentTimeMillis_nanoTIme/SystemTimeExample.java)
    - #### [시스템 프로퍼티 읽기 - getProperty](src/chap11/sec05/exam04_system_getProperty/GetPropertyExample.java)
    - #### [환경 변수 읽기 - getenv](src/chap11/sec05/exam05_System_getenv/SystemEnvExample.java)
    
  - ### Class 클래스
    - #### [Class 객체 얻기 ](src/chap11/sec06/exam01_class/ClassExample.java)
    - #### [리플렉션( getDeclaredConstructor , getDeclaredFields , getDeclaredMethods)](src/chap11/sec06/exam02_reflection/ReflectionExample.java)
    - #### [동적 객체 생성 - newInstane() ](src/chap11/sec06/exam03_newInstance)
    
 - ### String 클래스
    - #### [String 생성자](src/chap11/sec07/exam01_String_constructor)
    - #### [String 메소드](src/chap11/sec07/exam02_String_method)
    
  - ### StringTokenizer 클래스
    - #### [split() 메소드](src/chap11/sec08/exam01_tokenizer_method/StringSplitExample.java)
    - #### [StringTokenizer 클래스](src/chap11/sec08/exam02_tokenizer_class/StringTokenizerExample.java)
 - ### [StringBuffer , StringBuilder 클래스](src/chap11/sec09/StringBuilderExample.java)
    
 - ### 정규 표현식과 Pattern 클래스
    - #### [Pattern 클래스](src/chap11/sec10/exam01_Regular_expression_pattern/PatternExample.java)
    
 - ### Arrays 클래스
    - #### [배열 복사](src/chap11/sec11/exam01_array_copy/ArrayCopyExample.java)
    - #### [배열 항목 비교](src/chap11/sec11/exam02_array_equals/EqualsExample.java)
    - #### [배열 항목 정렬](src/chap11/sec11/exam03_array_sort/SortExample.java)
    - #### [배열 항목 검색](src/chap11/sec11/exam04_array_search/SearchExample.java)
    
- ### Wrapper (포장) 클래스
    - #### [박싱(Boxing) 과 언박싱(Unboxing)](src/chap11/sec12/exam01_boxing_unboxing/BoxingUnBoxingExample.java)
    - #### [자동 박싱과 언박싱](src/chap11/sec12/exam02_auto_boxing_unboxing/AutoBoxingUnBoxingExample.java)
    - #### [문자열을 기본 타입 값으로 변환](src/chap11/sec12/exam03_string_to_primitive/StringToPrimitiveValueExample.java)
    - #### [포장 값 비교](src/chap11/sec12/exam04_value_compare/ValueCompareExample.java)
    
- ### Math, Random 클래스
    - #### [Math 클래스](src/chap11/sec13/exam01_math/MathExample.java)
    - #### [Random 클래스](src/chap11/sec13/exam02_random_class/RandomExample.java)
    
- ### Date, Calendar 클래스
    - #### [Date 클래스](src/chap11/sec14/exam01_date_class/DateExample.java)
    - #### [Calendar 클래스](src/chap11/sec14/exam02_calendar_class/calendar.md)

- ### Format 클래스
    - #### [숫자 형식 클래스(DecimalFormat)](src/chap11/sec15/exam01_decimal_format)
    - ####  [날짜 형식 클래스(SimpleDateFormat)](src/chap11/sec15/exam02_simple_date_format/SimpleDateFormatExample.java)
    - #### [문자열 형식 클래스(MessageFormat)](src/chap11/sec15/exam03_message_format/MessageFormatExample.java)

- ### java.time 패키지
    - #### [날짜와 시간 객체 생성](src/chap11/sec16/exam01_locat_date_object/DateTimeCreateExample.java)
    - #### [날짜와 시간에 대한 정보 얻기](src/chap11/sec16/exam02/DateTimeInfoExample.java)
    - #### [날짜와 시간을 조작하기](src/chap11/sec16/exam03)
    - #### [날짜와 시간을 비교하기](src/chap11/sec16/exam04/DateTimeCompareExample.java)
    - #### 파싱과 포맷팅
## chapter 12. 멀티스레드

## chapter 13. 제네릭

## chapter 14. 람다식

## chapter 15. 컬렉션 프레임워크

## chapter 16. 스트림과 병렬 처리

## chapter 17. JavaFX

## chapter 18. IO 기반 입출력 및 네트워킹

## chapter 19. NIO 기반 입출력 및 네트워킹

**********

__모든 chapter 가 완전히 이해되어 내 것이 될 때까지 무한 회독하기__

***************

1. 추상 클래스는 new 연산자를 이용해서 인스턴스를 생성할 수 없다. 그 이유는?