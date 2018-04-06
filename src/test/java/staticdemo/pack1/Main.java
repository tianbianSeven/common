package staticdemo.pack1;

/**
 * Created by madali on 2018/4/6.
 */
public class Main {

    static int value = 33;

    public static void main(String[] args) throws Exception {
        //this代表当前对象，那么通过new Main()来调用printValue的话，当前对象就是通过new Main()生成的对象。
        //而static变量是被对象所享有的，因此在printValue中的this.value的值毫无疑问是33
        new Main().printValue();
    }

    private void printValue() {
        int value = 3;
        /*
         * 在printValue方法内部的value是局部变量，根本不可能与this关联，所以输出结果是33。
         *
         * 在这里永远要记住一点：静态成员变量虽然独立于对象，但是不代表不可以通过对象去访问，
         * 所有的静态方法和静态变量都可以通过对象访问（只要访问权限足够）。
         */
        System.out.println(this.value);
    }

}
