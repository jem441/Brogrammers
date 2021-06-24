
public class A {
	
	public static int staticCount = 0;
	
	public int instanceCount = 0;
	
	public A() {
		staticCount++;
		this.instanceCount++;
	}

}
