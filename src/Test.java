
public class Test {
	public static void main(String[] args) {
		Demo a=new Demo(new point(3,3));
		a.Order("forward");
		a.Order("forward");
		a.Order("forward");
		a.Order("forward");
		a.Order("back");
		a.Order("back");
		a.Order("show");
	}
}
