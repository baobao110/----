
public class point {
	private int x=0;
	private int y=0;
	public point before;//�������������ʽ����point���д���һ��point��ı������Ȳ����д�������
	
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
	}//���������еĻ�ȡǰһ������
	public void setBefore(point before) {
		this.before = before;
	}//��������ǰһ������
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
}
