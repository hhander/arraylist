package Arraylist;

import java.util.Scanner;

public class VerifyCodeString {
    public static void main(String[] args) {
        String okName = "934352541@qq.com";
        String okPasswd = "123456";

        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("请输入用户名");
        String inputName = sc.next();
        System.out.println("请输入密码");
        String inputPasswd = sc.next();
        while(true)
        {

            if(inputName.equals(okName)&&inputPasswd.equals(okPasswd))
            {
                System.out.println("登陆成功");
                break;
            }
            else if(inputName.equals(okName)==true && inputPasswd.equals(okPasswd) ==false)
            {
                System.out.println("密码错误");
                count ++;
                if(count == 3)
                {
                    System.out.println("输入三次错误请稍后");
                    break;
                }
                System.out.println("请重新输入密码");
                inputPasswd = sc.next();

            }
            else
            {
                System.out.println("登录名或者密码有误");
                count ++;
                if(count == 3)
                {
                    System.out.println("输入三次错误请稍后");
                    break;
                }
                System.out.println("请重新输入用户名");
                inputName = sc.next();
                System.out.println("请重新输入密码");
                inputPasswd = sc.next();
            }
        }

    }
}
