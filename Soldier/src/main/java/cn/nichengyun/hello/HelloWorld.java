package cn.nichengyun.hello;

import org.joda.time.LocalTime;

/**
 * Created by xiaoni on 2018/3/23.
 */
public class HelloWorld {

    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
