
public class point {
	private int x=0;
	private int y=0;
	public point before;//这里是链表的形式，在point类中创建一个point类的变量，先不进行创建对象
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public point getBefore() {
		return before;
	}//用于链表中的获取前一个对象
	public void setBefore(point before) {
		this.before = before;
	}//用于设置前一个对象
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
}
