package Arraylist;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "ab";
        String c = "ab" + "c";
        String name = "934352541@qq.com";
        String passwd = "123456";
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String uname = sc.next();
        System.out.println("输入密码");
        String uPasswd = sc.next();

        if(uname.equals(name)&&uPasswd.equals(passwd))
        {
            System.out.println("登录成功");
        }



    }
}
