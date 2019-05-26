class A implements B {
}
public interface B {
}
class C extends A {
}
class D extends A, implements B {
}

// Compilation error. Error in line 7. Comma separator invalid