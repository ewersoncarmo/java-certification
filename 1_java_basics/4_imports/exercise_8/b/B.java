package b;

import a.A;
import static a.A.*;
 
class B{
  void m() {
    A a = new A();
    a.run(VALUE);
  }
}
// Compilation success