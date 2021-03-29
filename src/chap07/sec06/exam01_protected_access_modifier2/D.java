package chap07.sec06.exam01_protected_access_modifier2;

import chap07.sec06.exam01_protected_access_modifier.A;

public class D extends A {

    public D() {
        super();
        this.field = "value";
        this.method();
    }
}
