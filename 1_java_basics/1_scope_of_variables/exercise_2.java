class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) 
			System.out.println(i);					
			System.out.println(i); // Compilation error. The variable "i" is not accessible in this block
		System.out.println("finished");			
	}
}