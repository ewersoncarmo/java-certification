package b;

import static a.A.*;

class B{
  void m() {
    A a = new A(); // Compilation error. The import static does not allow to instantiate class
    a.run(VALUE);
  }
}
