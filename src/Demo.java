
public class Demo {
	public point point;//创建point类的变量不进行创建对象同point类的定义
	
	public Demo(point point) {
		this.point = point;
	}

	public void Order(String order) {
		if("forward".equals(order)) {
			point current=new point(point.getX(),point.getY());//创建临时变量，进行创建对象，这里需要格外的注意，之前没有出结果就是在于创建对象还是直接赋值没有选择好
			current.setY(point.getY()+1);
			current.setBefore(point);//设置current的前一个为当前的point
			point=current;//这里将临时变量current赋值给point,这里受到老师的启示，在整个链表的操作过程中，最后的对象始终是point
			System.out.println(point.getX()+","+point.getY());//这里最后进行输出，虽然可以在前面输出，但是这样可以检验设置是否完成，当前的point是否为操作后的对象
		}
		if("back".equals(order)) {
			if(null==point.getBefore()) {//如果当前的point没有前者进行判断
				System.out.println("起始位置"+point.getX()+","+point.getY());
			}
			else {
				point=point.getBefore();//将当前对象point的前一个直接赋值给point
				System.out.println(point.getX()+","+point.getY());
			}
		}
		if("show".equals(order)) {
			while(null!=point) {//判断当前对象是否为空，用while循环输出
				System.out.println(point.getX()+","+point.getY());
				point=point.getBefore();//将当前对象point的前一个直接赋值给point
			}
		}
	}
}
/*
 * 链表这个案列非常有意思，在point类中直接定义point类的对象，用set和get方法设置和获取对象，而在DEMO中，什么时候直接赋值，什么时候需要创建对象进行初始化，在这里自己总结
 * 能够用DEMO中直接用定义的point对象坚决不要定义其它point对象进行过渡，因为在用point对象时可以直接用set和get方法进行赋值,在forward中需要创建临时变量current,这里需要注意的是在创建current时
 * 初始化操作而不是赋值操作这里需要注意，还有在进行转化是最终的变量始终是point变量，同时需要注意back方法和show方法其实实现的是同样功能，只是前者是单步执行，后者是连续执行，这里可以受到启发，我们可以先完成back方法
 * 其实show方法和back方法代码类似可以借鉴一下
 */
