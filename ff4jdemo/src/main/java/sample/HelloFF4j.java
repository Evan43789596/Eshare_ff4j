package sample;

import org.ff4j.FF4j;

import java.io.InputStream;

/**
 * Created by liangyh on 2018/3/19.
 * Email:10856214@163.com
 */
public class HelloFF4j {


    public static void main(String[] args){
         //获取开关配置文件
        FF4j ff4j = new FF4j("ff4j.xml");
        System.out.println("是否存在hello开关:"+ff4j.exist("hello"));
        System.out.println("是否打开hello开关:"+ff4j.check("hello"));
        if(ff4j.check("hello")){
            System.out.println("开关已经打开");
        }
        //关闭开关
        ff4j.disable("hello");
        System.out.println("是否打开hello开关:"+ff4j.check("hello"));
    }
}
