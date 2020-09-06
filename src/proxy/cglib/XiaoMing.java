package proxy.cglib;

public class XiaoMing implements Customer {


    @Override
    public void dinner() {
        System.out.println("要一份史上最好吃的白切鸡");
    }

    @Override
    public void feizhaishui() {
        System.out.println("我要阔落");
    }
}
