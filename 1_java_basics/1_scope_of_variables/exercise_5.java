class Test {
	static int i = 3;

	public static void main(String[] a) {
		for (new Test().i = 10; new Test().i < 100; new Test().i++) {
			System.out.println(i); // Compile and run, printing from 10 to 99
		}
	}
}