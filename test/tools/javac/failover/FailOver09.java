/*
 * @test /nodynamiccopyright/
 * @bug 6970584
 * @summary Flow.java should be more error-friendly
 * @author mcimadamore
 *
 * @compile/fail/ref=FailOver09.out -XDrawDiagnostics -Xshouldstop:at=FLOW -XDdev FailOver09.java
 */

class Test extends Test {
    Integer x = 1;
    { for (x = 0 ; x ; x++) {}; }
}
