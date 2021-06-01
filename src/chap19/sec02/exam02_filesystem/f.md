# 파일 시스템 정보(FileSystem)

운영체제의 파일 시스템은 FileSystem 인터페이스를 통해서 접근 할 수 있다. 
FileSystem 구현 객체는 FileSystems의 정적 메소드인 getDefault()로 얻을 수 있다.

```java
FileSystem fileSystem = FileSystems.getDefalut();
```

FileSystem은 다음과 같은 메소드를 제공한다.

|리턴 타입| 메소드(매개 변수) | 설명
|----|:----|----
|Iterable<FileStore> | getFileStores() | 드라이버 정보를 가진 FileStore 객체들을 리턴
|Iterable<Path> | getRootDirectories() | 루트 디렉토리 정보를 가진 Path 객체들을 리턴
|String | getSeparator() | 디렉토리 구분자 리턴

FileStore 는 드라이버를 표현한 객체로 다음과 같은 메소드를 제공한다.

|리턴 타입 | 메소드(매개 변수) | 설명
|----|:-----|----|
| long | getTotalSpace() | 드라이버 전체 공간 크기(단위 :바이트) 리턴
| long | getUnallocatedSpace() | 할당되지 않은 공간 크기(단위 : 바이트) 리턴
| long | getUsableSpace() | 사용 가능한 공간 크기, getUnallocatedSpace()와 동일한 값
| boolean | isReadOnly() | 읽기 전용 여부
| String | name() | 드라이버명 리턴
| String | type() | 파일 시스템 종류


`FileSystemExample.java` 파일 시스템 정보 얻기

```java

public class FileSystemExample {

    public static void main(String[] args) throws IOException {

        FileSystem fileSystem = FileSystems.getDefault();

        for (FileStore store : fileSystem.getFileStores()){
            System.out.println("드라이버명 : " + store.name());
            System.out.println("파일시스템 : " + store.type());
            System.out.println("전체 공간 : \t\t " + store.getTotalSpace() +"바이트");
            System.out.println("사용 중인 공간 : \t " +(store.getTotalSpace() - store.getUnallocatedSpace()) +" 바이트");
            System.out.println("사용 가능한 공간 : \t" + store.getUsableSpace() + " 바이트");
            System.out.println();
        }

        System.out.println("파일 구분자 : " + fileSystem.getSeparator());
        System.out.println();

        for (Path path : fileSystem.getRootDirectories()){
            System.out.println(path.toString());
        }
    }
}

```
