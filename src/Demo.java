
public class Demo {
	public point point;//����point��ı��������д�������ͬpoint��Ķ���
	
	public Demo(point point) {
		this.point = point;
	}

	public void Order(String order) {
		if("forward".equals(order)) {
			point current=new point(point.getX(),point.getY());//������ʱ���������д�������������Ҫ�����ע�⣬֮ǰû�г�����������ڴ���������ֱ�Ӹ�ֵû��ѡ���
			current.setY(point.getY()+1);
			current.setBefore(point);//����current��ǰһ��Ϊ��ǰ��point
			point=current;//���ｫ��ʱ����current��ֵ��point,�����ܵ���ʦ����ʾ������������Ĳ��������У����Ķ���ʼ����point
			System.out.println(point.getX()+","+point.getY());//�����������������Ȼ������ǰ������������������Լ��������Ƿ���ɣ���ǰ��point�Ƿ�Ϊ������Ķ���
		}
		if("back".equals(order)) {
			if(null==point.getBefore()) {//�����ǰ��pointû��ǰ�߽����ж�
				System.out.println("��ʼλ��"+point.getX()+","+point.getY());
			}
			else {
				point=point.getBefore();//����ǰ����point��ǰһ��ֱ�Ӹ�ֵ��point
				System.out.println(point.getX()+","+point.getY());
			}
		}
		if("show".equals(order)) {
			while(null!=point) {//�жϵ�ǰ�����Ƿ�Ϊ�գ���whileѭ�����
				System.out.println(point.getX()+","+point.getY());
				point=point.getBefore();//����ǰ����point��ǰһ��ֱ�Ӹ�ֵ��point
			}
		}
	}
}
/*
 * ����������зǳ�����˼����point����ֱ�Ӷ���point��Ķ�����set��get�������úͻ�ȡ���󣬶���DEMO�У�ʲôʱ��ֱ�Ӹ�ֵ��ʲôʱ����Ҫ����������г�ʼ�����������Լ��ܽ�
 * �ܹ���DEMO��ֱ���ö����point��������Ҫ��������point������й��ɣ���Ϊ����point����ʱ����ֱ����set��get�������и�ֵ,��forward����Ҫ������ʱ����current,������Ҫע������ڴ���currentʱ
 * ��ʼ�����������Ǹ�ֵ����������Ҫע�⣬�����ڽ���ת�������յı���ʼ����point������ͬʱ��Ҫע��back������show������ʵʵ�ֵ���ͬ�����ܣ�ֻ��ǰ���ǵ���ִ�У�����������ִ�У���������ܵ����������ǿ��������back����
 * ��ʵshow������back�����������ƿ��Խ��һ��
 */
