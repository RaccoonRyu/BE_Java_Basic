# 자바 컴파일 및 실행

## Windows 컴파일 및 실행 환경
- win + r > cmd 하여 명령 프롬프트 실행
- javac 명령어를 이용하여 java파일을 컴파일 및 실행
- 컴퓨터 내 jdk > bin > javac.exe가 상술한 명령어에 해당하는 실행 파일
- cmd에서 javac를 입력할 때 바로 명령어가 실행되는 이유는 java를 설치할 때 jdk의 bin 디렉터리를 Path 환경변수로 설정했기 때문

## 컴파일
- cmd > 컴파일하려는 파일(.java) 위치한 경로로 이동
- javac 컴파일하려는 파일.java (ex. javac program.java) 순으로 명령어 입력
- .java 파일이 컴파일되어 컴파일된 파일.class (ex. program.class) 생성

## 실행
- java 컴파일된 파일명(확장자 빼고) 명령어 (ex. java program) 입력하여 실행
- 이 때, program.clas의 main 함수 속 코드들이 순차적으로 실행된다.

## 라이브러리 사용하여 컴파일 및 실행
- 라이브러리 : 다른 사람들이 사용할 수 있도록 잘 정리정돈하여 만든 프로그램
- -cp(classpath) "경로" 명령어를 사용하여 다른 패키지 속의 .java파일을 함께 컴파일 할 수 있음 (ex. javac -cp "경로;다음경로" 컴파일하려는 파일.java)
- 실행 또한 -cp "경로" 명령어를 사용하여 가능 (ex. java -cp "경로;다음경로" 컴파일된 파일명)

## 입력과 출력 이용하여 컴파일 및 실행
- main의 args : 프로그램 실행 시 입력값을 줬을 때, 해당 입력값을 받는 parameter
- 해당 args에 값을 줘서 프로그램을 실행하려면 java class파일명 "값1" "값2" 과 같은 방식으로 입력하고, 각각의 값은 공백으로 구분한다. (ex. java exprogram1 "Java APT" 15.0)