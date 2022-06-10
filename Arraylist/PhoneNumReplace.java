package Arraylist;

import java.util.Scanner;

public class PhoneNumReplace {
    public static void main(String[] args) {
        String phoneNum = "";
        System.out.println("请输入手机号");
        Scanner sc = new Scanner(System.in);
        phoneNum = sc.next();
        phoneNum = phoneNum.replace(phoneNum.substring(3,7),"****");
        System.out.println(phoneNum);
    }
}
