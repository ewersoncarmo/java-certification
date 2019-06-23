class A {
    public static void main(String[] args) {
      System.out.println(args); // A
      System.out.println(args.length); // B
      System.out.println(args[0]); // C
    }
}

// Return Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0 at A.main(exercise_3.java:5)
