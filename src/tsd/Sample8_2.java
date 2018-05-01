package tsd;

public class Sample8_2 {
	public static void main(String[] args) {
		String ext = "From external class";
		MyTopLevel1S.gateToStatic();
		MyTopLevel1S.StaticNested sn =
				new MyTopLevel1S.StaticNested();
		sn.accessStaticNested(ext);
	}

}
class MyTopLevel1S{
	private static String top = "From top level class";
	public static void gateToStatic() {
		StaticNested s = new StaticNested();
		s.accessStaticNested(top);
	}

	static class StaticNested{
		public void accessStaticNested(String st) {
			System.out.println(st);
		}
	}

}
