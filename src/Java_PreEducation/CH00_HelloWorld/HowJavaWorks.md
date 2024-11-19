# Java의 동작 원리

1. 컴퓨터에 JVM(Java Virtual Machine)을 포함한 Java를 설치
2. 개발자는 자신이 하고자 하는 일을 담은 Java Source Code(확장자 .java인 파일)를 작성한다.
3. Java Source Code는 컴퓨터가 아닌 사람이 이해할 수 있다. (기계는 직접적으로 이해 불가)
4. 이 때, 기계가 Java Source Code를 이해할 수 있게 전환하는 작업을 컴파일(Compile) 이라고 한다.
5. 컴파일은 통합 개발 환경(IDE)에서 Java Source Code를 작성 후 저장 시 자동으로 .class 파일을 생성함으로서 수행된다.
6. 이러한 .class 파일을 Java Application이라고 한다.
7. Java Application은 IDE에서 Run 버튼을 클릭하면 IDE가 JVM에 .class 파일을 읽게 하여 해당 파일의 내용대로 컴퓨터를 동작함으로써 실행된다.