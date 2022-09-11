package Package;

public class Action extends Constructor {
    public static void main(String[] args) {
        Constructor objectOne =new Constructor();
        objectOne.TestMethodOne();
        objectOne.number=12;
       Constructor ObjectTwo =new Constructor();
       ObjectTwo.TestMethodOne();
       objectOne.number=65;
       Constructor Object3=new Constructor();
       Object3.TestMethodOne();
        Object3.number=20;
        int temp = 12+65+20;
        System.out.println((temp));
    }
}
