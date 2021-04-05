package chap08.sec06.interface_inheritance;

public class Example {
    public static void main(String[] args) {
        ImplementationC  impl = new ImplementationC();

        InterfaceA interfaceA = impl;
        interfaceA.methodA();

        System.out.println();

        InterfaceB interfaceB = impl;
        interfaceB.methodB();

        System.out.println();

        InterfaceC interfaceC = impl;
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();

    }
}
