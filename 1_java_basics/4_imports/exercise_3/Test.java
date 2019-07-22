import model.basic.Client;
import model.advanced.*;

class Test {
  public static void main(String[] args) {
    System.out.println("Welcome " + new Client().name);
	// Compilation success. It will be considered the specific import and it will be printed "Welcome guilherme"
  }
}