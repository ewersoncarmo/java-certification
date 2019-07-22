import model.A;

class Test {
  public static void main(String[] args) {
    new A("guilherme").print(); // Does not compile. The constructor
  // of the class A is protected and it isn't visible.
  }
}
