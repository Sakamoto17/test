package tsd;

public class Sample5_10 {
	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		System.out.println("JVM free memory before runnning gc: " + rt.freeMemory());
		rt.gc();
		System.out.println("JVM free memory after runnning gc:" + rt.freeMemory());
	}

}
