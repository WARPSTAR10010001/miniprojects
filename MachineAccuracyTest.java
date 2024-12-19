//Boo!!

//This program tests the machine accuracy with a very simple 1 + ε test. Uncomment the functions in the main-function to run the program

public class MachineAccuracyTest {
    public static void main(String[] args) {
		//test1(); 	//general test for machine accuracy (double-type)
		//test2();	//general test for machine accuracy (float-type)
		//test3(); 	// test with a specific float value
		//test4(); 	//0.1 + 0.2 test (with formatting)
	}
	
	public static void test1() {
		double a = 0.2;
		for(int i = 1; i < 52; i++) {
			a = a / 2;
			System.out.print("[" + i + "]: ");
			System.out.println(1 + a);
		}
		
		exit();
	}
	
	public static void test2() {
		float a = 0.2f;
		for(int i = 1; i < 23; i++) {
			a = a / 2;
			System.out.print("[" + i + "]: ");
			System.out.println(1 + a);
		}
		exit();
	}
	
	public static void test3() {
		System.out.print(1 + 0.0000000000000001);
		exit();
	}
	
	public static void test4() {
		System.out.println(0.1 + 0.2);
		exit();
	}

    public static void exit(){
        System.out.print("\nTest terminated.");
        System.exit(0);
    }
}