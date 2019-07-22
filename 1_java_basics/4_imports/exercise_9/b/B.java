package b;

import static A.*; // Compilation error. Class A is in default package

class B{
  void m() {
    A a = new A();
    a.run(VALUE);
  }
}