import model.basic.Client;
import model.basic.Client;

class Test {
  public static void main(String[] args) {
    System.out.println("Welcome " + new Client().name);
	// Compilation success. The import duplicity will not influency and it will be printed "Welcome guilherme"
  }
}