# 이것이 자바다 (This is Java)
*****
### 목차

[chapter 1. 자바시작하기](#chapter-1-자바시작하기)

[chapter 2. 변수와 타입](#chapter-2-변수와-타입)

[chapter 3. 연산자](#chapter-3-연산자)

[chapter 4. 조건문과 반복문](#chapter-4-조건문과-반복문)

[chapter 5. 참조타입](#chapter-5-참조-타입)

[chapter 6. 클래스](#chapter-6-클래스)

[chapter 7. 상속](#chapter-7-상속)

[chapter 8. 인터페이스](#chapter-8-인터페이스)

[chapter 9. 중첩 클래스와 인터페이스](#chapter-9-중첩-클래스와-중첩-인터페이스)

[chapter 10. 예외 처리](#chapter-10-예외-처리)

[chapter 11. 기본 API 클래스](#chapter-11-기본-api-클래스)

[chapter 12. 멀티스레드](#chapter-12-멀티스레드)

[chapter 13. 제네릭](#chapter-13-제네릭)

[charpter 14. 람다식](#chapter-14-람다식)

[chapter 15. 컬렉션프레임워크](#chapter-15-컬렉션-프레임워크)

[chapter 16. 스트림과 병렬 처리](#chapter-16-스트림과-병렬-처리)

[chapter 17. JavaFx](#chapter-17-javafx)

[chapter 18. IO 기반 입출력 및 네트워킹](#chapter-18-io-기반-입출력-및-네트워킹)

[chapter 19. NIO 기반 입출력 및 네트워킹](#chapter-19-nio-기반-입출력-및-네트워킹)

*****

## chapter 1 자바시작하기
- ### [프로그래밍 언어란?](src/chap01/프로그래밍언어.md)
- ### 자바란?
    - #### 자바의 특징
    - #### [자바 가상 기계(JVM)](src/chap01/JVM.md)
- ### 자바 프로그램 개발 순서
    - #### [소스 작성에서부터 실행까지](src/chap01/자바프로그램.md)
    - #### [프로그램 소스 분석](src/chap01/소스분석.md)

## chapter 2 변수와 타입
  - ### 변수
    - #### 변수란?
    - #### 변수의 선언
    - #### [변수의 사용](src/chap02/sec01/exam03/변수값저장.md)
    - #### 변수의 사용 범위
  - ### 데이터 타입
    - #### [기본(primitive)타입](src/chap02/sec02/exam01/기본타입.md)
    - #### [정수(byte , char, short ,int . long)타입](src/chap02/sec02/exam02/정수타입.md)
    - #### [실수타입(float ,double)](src/chap02/sec02/exam02/FloatDoubleExample.java)
    - #### 논리타입
  
  - ### 타입 변환
    - #### [자동 타입 변환](src/chap02/sec03/exam01_/PromotionExample.java)
    - #### [강제 타입 변환](src/chap02/sec03/exam02_)
    - #### 연산식에서의 자동 타입 변환

## chapter 3 연산자

## chapter 4 조건문과 반복문
- ### [코드 실행 흐름 제어](src/chap04/sec01/흐름제어.md)
- ### 조건문(if문 , switch 문)
    - #### if문
    - #### if-else문
    - #### if-else if-else문 
    - #### 중첩 if문
    - #### switch문
    
- ### 반복문(for문 , while문 , do-while 문)
    - #### for 문
    - #### while문
    - #### do-while문

## chapter 5 참조 타입
- ### [데이터 타입 분류](src/chap05/sec01/데이터타입.md)
- ### [메모리 사용 영역](src/chap05/메모리사용영역.md)
- ### [참조 변수의 ==, != 연산](src/chap05/참조변수의연산.md)
- ### [null 과 NullPointerException](src/chap05/null.md)
- ### String 타입
- ### 배열 타입
    - #### 배열이란?
    - #### 배열 선언
    - #### [값 목록으로 배열 생성](src/chap05/sec06/exam03_array_value/값목록으로배열생성.md)
    - #### [new 연산자로 배열 생성](src/chap05/sec06/exam04_new_array)
    - #### 배열 길이
    - #### [커맨드 라인 입력](src/chap05/sec06/exam06_commandline/MainStringArrayArgument.java)
    - #### 다차원 배열
    - #### [객체를 참조하는 배열](src/chap05/sec06/exam08_array_reference_object/객체참조배열.md)
    - #### 배열복사
    
## chapter 6 클래스
- ### 객체 지향 프로그래밍 
    - #### [객체란?](src/chap06/sec01/객체.md)
    - #### 객체의 상호작용
    - #### 객체 간의 관계
    - #### 객체 지향 프로그래밍의 특징
- ### [객체와 클래스](src/chap06/sec02/객체와클래스.md)

- ### 클래스 선언

- ### [객체 생성과 클래스 변수](src/chap06/sec04/객체생성과변수.md)

- ### 클래스의 구성 멤버
    - #### [필드](src/chap06/sec05/필드.md)
    - #### [생성자](src/chap06/sec05/생성자.md)
    - #### [메소드](src/chap06/sec05/메소드.md)
    
- ### 필드
    - #### [필드 선언](src/chap06/sec06/필드선언.md)
    - #### [필드 사용](src/chap06/sec06/필드사용.md)
    
- ### [생성자](src/chap06/sec07/생성자.md)
    - #### 기본생성자
    - #### 생성자 선언
    - #### [필드 초기화](src/chap06/sec07/exam03/필드초기화.md)
    - #### 생성자 오버로딩(Overloading)
    - #### 다른 생성자 호출(this())
- ### 메소드
    - #### 메소드 선언
        - [매개 변수의 수를 모를 경우](src/chap06/sec08/매개변수의수.md)
    - #### 리턴(return)문
    - #### 메소드 호출
    - #### [메소드 오버로딩](src/chap06/sec08/exam04_method_overloading)
    
- ### [인스턴스 멤버와 this](src/chap06/sec09/exam01_instance_this) 

- ### [정적 멤버와 static](src/chap06/sec10/정적멤버.md)
    - #### [정적 멤버 사용](src/chap06/sec10/exam02_static_member)
    - #### [정적 초기화 블록](src/chap06/sec10/정적초기화블록.md)
    - #### [정적 메소드와 블록 선언시 주의할점](src/chap06/sec10/정적메소드와블록.md)
    - #### [싱글톤(Singleton)](src/chap06/sec10/exam05_singleton/싱글톤.md)
    
- ### final 필드와 상수
    - #### [final 필드](src/chap06/sec11/exam01_final_field/final필드.md)
    - #### [상수(static final)](src/chap06/sec11/exam02_static_final/상수.md)

- ### 패키지 
- ### 접근 제한자
    - #### [클래스의 접근 제한](src/chap06/sec13/exam01_class_access)
    - #### [생성자의 접근 제한](src/chap06/sec13/exam02_constructor_access)
    - #### [필드와 메소드의 접근 제한](src/chap06/sec13/exam03_field_method_access)
    
- ### [Getter 와 Setter 메소드](src/chap06/sec14/getter와setter.md) 

- ### [어노테이션](src/chap06/sec15/어노테이션.md)
    - #### [어노테이션 타입 정의와 적용](src/chap06/sec15/exam01/타입정의.md)
    - #### [어노테이션 적용 대상](src/chap06/sec15/exam02/적용대상.md)
    - #### 어노테이션 유지 정책
    - #### 런타임 시 어노테이션 정보 사용하기 
    


## chapter 7 상속
- ### 상속 개념
- ### [클래스 상속](src/chap07/sec02/exam01_inheritance)
- ### [부모 생성자 호출](src/chap07/sec03/exam01_parent_constructor_call)
- ### 메소드 재정의
    - #### [메소드 재정의(@Override)](src/chap07/sec04/exam01_overriding)
    - #### [부모 메소드 호출(super)](src/chap07/sec04/exam02_super)
- ### final 클래스와 final 메소드
    - #### [상속할 수 없는 final 클래스](src/chap07/sec05/exam01_final_class)
    - #### [오버라이딩할 수 없는 final 메소드](src/chap07/sec05/exam02_final_method)
- ### [protected 접근 제한자](src/chap07/sec06)

- ### 타입 변환과 다형성
  - #### [자동 타입 변환(Promotion)](src/chap07/sec07/exam01_promotion)
  - #### [필드의 다형성](src/chap07/sec07/exam02_field_polymorphism)
  - #### [하나의 배열로 객체관리](src/chap07/sec07/exam03_array_polymorphism)
  - #### [매개변수의 다형성](src/chap07/sec07/exam04_parmeter_polymorphism/매개변수의다형성.md)
  - #### [강제 타입 변환(Casting)](src/chap07/sec07/exam05_casting/강제타입변환.md)
  - #### [객체타입 확인 ](src/chap07/sec07/exam06_instanceof/객체타입확인.md) 
   
- ### 추상 클래스
    - #### [추상 클래스의 개념](src/chap07/sec08/exam01/추상클래스.md)
    - #### 추상 클래스의 용도
    - #### [추상 클래스 선언](src/chap07/sec08/exam03_abstract_class)
    - #### [추상 메소드와 오버라이딩](src/chap07/sec08/exam04_abstract_method)
    
## chapter 8 인터페이스

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

## chapter 9 중첩 클래스와 중첩 인터페이스

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


## chapter 10 예외 처리
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


## chapter 11 기본 API 클래스
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
    - #### [String 생성자](src/chap11/sec07/exam01_String_constructor/String생성자.md)
    - #### [String 메소드](src/chap11/sec07/exam02_String_method)
    
  - ### StringTokenizer 클래스
    - #### [split() 메소드](src/chap11/sec08/exam01_tokenizer_method/StringSplitExample.java)
    - #### [StringTokenizer 클래스](src/chap11/sec08/exam02_tokenizer_class/StringTokenizerExample.java)
 - ### [StringBuffer , StringBuilder 클래스](src/chap11/sec09/Buffer.md)
    
 - ### 정규 표현식과 Pattern 클래스
    - #### 정규 표현식 작성 방법
    - #### [Patter클래스](src/chap11/sec10/exam01_Regular_expression_pattern/PatternExample.java)
    
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
## chapter 12 멀티스레드
  - ### 멀티 스레드 개념
    - #### [프로세스와 스레드](src/chap12/sec01/스레드.md)
    - #### [메인 스레드](src/chap12/sec01/메인스레드.md)
  - ### [작업 스레드 생성과 실행](src/chap12/sec02/스레드생성.md)
    - #### [Thread 클래스로부터 직접 생성](src/chap12/sec02/작업스레드.md)
    - #### [Thread 하위 클래스로 부터 생성]()
    - #### [스레드의 이름](src/chap12/sec02/exam02_threadname)
  - ### [스레드 우선 순위](src/chap12/sec03/exam01_priority)
  - ### 동기화 메소드와 동기화 블록
    - #### [공유 객체를 사용할 때의 주의할 점](src/chap12/sec04/exam01_unsynchronized)
    - #### [동기화 메소드 및 동기화 블록](src/chap12/sec04/exam02_synchronized)
  - ### [스레드 상태](src/chap12/sec05/스레드상태.md)
  - ### 스레드 상태 제어
    - #### [주어진 시간동안 일시 정지(sleep())](src/chap12/sec06/exam01_sleep/SleepExample.java)
    - #### [다른 스레드에게 실행 양보(yield())](src/chap12/sec06/exam02_yield)
    - #### [다른 스레드의 종료를 기다림 - join()](src/chap12/sec06/exam03_join/join.md)
    - #### [스레드간 협업 - wait() , notify() , notifyAll()](src/chap12/sec06/exam04_)
    - #### [스레드의 안전한 종료(stop 플래그 , interrupt())](src/chap12/sec06/exam06_stop)
  - ### 데몬 스레드
  - ### 스레드 그룹
  - ### 스레드 풀

## chapter 13 제네릭

## chapter 14 람다식

## chapter 15 컬렉션 프레임워크

- ### [컬렉션 프레임워크 소개](src/chap15/컬렉션프레임워크.md)
- ### [List 컬렉션](src/chap15/sec02/List컬렉션.md)
    - #### [ArrayList](src/chap15/sec02/exam01_arraylist/ArrayList.md)
    - #### [Vector](src/chap15/sec02/exam02_vector/Vector.md)
    - #### [LinkedList](src/chap15/sec02/exam03_linkedlist/LinkedList.md)
    
- ### [Set 컬렉션](src/chap15/sec03/Set컬렉션.md)
  - #### [HashSet](src/chap15/sec03/exam01_hashset)
    
- ### [Map 컬렉션](src/chap15/sec04/Map컬렉션.md)
  - #### [HashMap](src/chap15/sec04/exam01_hashmap/HashMap.md)
  - #### [Hashtable](src/chap15/sec04/exam02_hashtable/Hashtable.md)
  - #### [Properties](src/chap15/sec04/exam03_properties/properties.md) 
    
- ### [검색 기능을 강화시킨 컬렉션](src/chap15/sec05/검색기능.md)
    - #### [이진 트리 구조](src/chap15/sec05/exam01_treeset/이진트리구조.md)
    - #### [TreeSet](src/chap15/sec05/exam01_treeset/treeset.md)
    - #### [TreeMap](src/chap15/sec05/exam02_treemap)
    - #### [Comparable 과 Comparator](src/chap15/sec05/exam03_comparable)

- ### [LIFO와 FIFO 컬렉션](src/chap15/sec06/컬렉션.md)
    - ### [Stack](src/chap15/sec06/stack.md)
    - #### [Queue](src/chap15/sec06/큐.md)
- ### 동기화된 컬렉션
- ### 병렬 처리를 위한 컬렉션



## chapter 16 스트림과 병렬 처리
- ### 스트림 소개
    - #### [반복자 스트림](src/chap16/sec01/exam01/IteratorVsSteamExample.java)
    - #### [스트림의 특징](src/chap16/sec01/exam02)
- ### 스트림의 종류
    - #### [컬렉션으로부터 스트림 얻기](src/chap16/sec02/exam01)
    - #### [배열루부터 스트림 얻기](src/chap16/sec02/exam02/FromArrayExample.java)
    - #### [숫자 범위로부터 스트림 얻기](src/chap16/sec02/exam03/FromIntRangeExample.java)
    - #### [파일로 부터 스트림 얻기](src/chap16/sec02/exam04/FromFileContentExample.java)
    - #### [디렉토리로부터 스트림 얻기](src/chap16/sec02/exam05/FromDirectoryExample.java)
    
- ### 스트림 파이프라인
    - #### [중간 처리와 최종 처리](src/chap16/sec03/exam01_stream_pipe_line)
    - #### 중간 처리 메소드와 최종 처리 메소드
    
- ### [필터링(distinct() , filter())](src/chap16/sec04/FilteringExample.java)

- ### 매핑(flatMapXXX(), mapXXX(), asXXXStream(), boxed())
    - #### [flatMapXXX()메소드](src/chap16/sec05/exam01_flatmap/FlatMapExample.java)
    - #### [mpaXXX()메소드](src/chap16/sec05/exam02_map)
    - #### [asDoubleStream() , asLongStream() , boxed() 메소드](src/chap16/sec05/exam03_asdouble/AsDoubleStreamAndBoxedExample.java)
    
- ### [정렬(sorted())](src/chap16/sec06)
- ### [루핑 (peek() , forEach())](src/chap16/sec07)
- ### [매칭(allMatch(), anyMatch(), noneMatch())](src/chap16/sec08/MatchExample.java)
- ### 기본집계(sum(), count(), average(), max() ,main())
    - #### [스트림이 제공하는 기본 집계](src/chap16/sec09/exam01_/AggregateExample.java)
    - #### [Optional 클래스 ](src/chap16/sec09/exam02/OptioalExample.java)
    - #### [커스텀 집계(reduce())](src/chap16/sec10/exam01)
    
- ### 수집 (collect())
    - #### [필터링한 요소 수집](src/chap16/sec11/exam01)
    - #### [사용자 정의 컨테이너에 수집하기](src/chap16/sec11/exam02)
    - #### [요소를 그룹핑해서 수집](src/chap16/sec11/exam03/GroupingByExample.java)
    - #### [그룹핑 후 매핑 및 집계](src/chap16/sec11/exam04/GroupingAndReductionExample.java)

- ### 병렬 처리
    - #### [동시성(Concurrency) 과 병렬성(Parallelism)](src/chap16/sec12/동시성과병렬성.md)
    - #### 포크조인(ForkJoin)프레임워크
    - #### [병렬 스트림 생성 ](src/chap16/sec12/exam03/MaleStudentExample.java)
    - #### [병렬 처리 성능](src/chap16/sec12/exam04/병렬처리성능.md)

## chapter 17 JavaFX

## chapter 18 IO 기반 입출력 및 네트워킹
- ### [IO 패키지 소개](src/chap18/IO패키지.md)
- ### [입력 스트림과 출력 스트림](src/chap18/sec02/입출력스트림.md) , (강의 18.2 강 복습하기)
    - #### [InputStream](src/chap18/sec02/exam01/InputStream.md)
    - #### OutputStream
    - #### Reader
    - #### Writer
- ### [콘솔 입출력](src/chap18/sec03/콘솔입출력.md)
    - #### [System.in 필드](src/chap18/sec03/exam01_system_in)
    - #### [System.out 필드](src/chap18/sec03/system_out.md)
    - #### [Console 클래스](src/chap18/sec03/exam03_console/콘솔.md)
    - #### [Scanner 클래스](src/chap18/sec03/exam04_scanner/scanner.md)
  
- ### 파일 입출력
    - #### [File 클래스](src/chap18/sec04/exam01_file/FileExample.java)
    - #### [FileInputStream](src/chap18/sec04/exam02_fileinputstream/FileInputStreamExample.java)
    - #### [FileOutputStream](src/chap18/sec04/exam03_fileoutputstream/FileOutputStreamExample.java)
    - #### [FileReader](src/chap18/sec04/exam04_file_reader/FileReaderExample.java)
    - #### [FileWriter](src/chap18/sec04/exam05_file_writer/FileWriterExample.java)
- ### [보조 스트림](src/chap18/sec05/보조스트림.md)
    - #### [문자 변환 보조 스트림](src/chap18/sec05/exam01/)
    - #### [성능 향상 보조 스트림](src/chap18/sec05/exam02)
    - #### [기본 타입 입출력 보조 스트림](src/chap18/sec05/exam03/기본타입보조스트림.md)
- ### 네트워크 기초
    - #### 서버와 클라이언트
    - #### IP 주소와 포트(Port)
    - #### [InetAddress로 IP 주소 얻기](src/chap18/sec06/exam01_inet_address/InetAddressExample.java)
- ### TCP 네트워킹
  - #### ServerSocket과 Socket의 용도
  - #### [ServerSocket 생성과 연결 수락](src/chap18/sec07/exam02_serversocket/ServerExample.java)
  - #### [Socket 생성과 연결 요청](src/chap18/sec07/exam03_socket/ClientExample.java)
  - #### [Socket 데이터 통신](src/chap18/sec07/exam04_socket_data)
  - #### 스레드 병렬 처리
  - #### [채팅 서버 구현](src/chap18/sec07/exam06_executor_service/ServerExample.java)
  - #### [채팅 클라이언트 구현](src/chap18/sec07/exam07_/ClientExample.java)

- ### [UDP 네트워킹](src/chap18/sec08/UDP네트워킹.md)
  - #### [발신자 구현](src/chap18/sec08/exam01/UdpSendExample.java)
  - #### [수신자 구현]()


## chapter 19 NIO 기반 입출력 및 네트워킹

**********

__모든 chapter 가 완전히 이해되어 내 것이 될 때까지 무한 회독하기__

***************

1. 추상 클래스는 new 연산자를 이용해서 인스턴스를 생성할 수 없다. 그 이유는?  [click me](src/chap07/sec08/exam01/추상클래스.md)
2. 스트림에서 중간 처리와 최종 처리란? 그리고 차이점은 ?
3. HashSet에서 equals() 와 hashCode()는 무엇을 의미하며 오버라이딩을 왜 하는가?
4. 객체에서 필드와 변수의 차이점은?  [click me](src/chap06/sec05/필드.md)
5. 자바 클래스의 메인 메서드는 무엇이며 메인 메서드의 역할은?
6. JVM은 무엇이며, 자바 프로그램 실행 순서는 어떻게 되는가? [click](src/chap01/JVM.md)
7. [인스턴스란 무엇이며,인스턴스&정적 필드 ,인스턴스&정적 메서드의 차이와 활용법은? [click](src/chap06/sec10/정적멤버.md)
8. int & Integer , char & Character 의 차이점은 무엇일까?