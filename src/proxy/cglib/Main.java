package proxy.cglib;

public class Main {
	public static void main(String[] args) {
		CglibXiaoGe xiaoge = new CglibXiaoGe();
		Customer instance = (Customer) xiaoge.getInstance(XiaoMing.class);
		instance.dinner();
		instance.feizhaishui();
	}
}
