package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Student {
    public static void main(String[] args) {
        ArrayList<Student> arrayStudent = new ArrayList<>();
        arrayStudent.add(new Student(20180302,"叶孤城",23,"护理一班"));
        arrayStudent.add(new Student(20180303,"东方不败",23,"护理一班"));
        arrayStudent.add(new Student(20180304,"西门吹雪",26,"护理一班"));
        arrayStudent.add(new Student(20180305,"梅超风",26,"护理一班"));

        Student s1 = new Student(20180302,"叶孤城",23,"护理一班");
        Student s2 = new Student(20180302,"叶孤城",23,"护理一班");



        for (int i = 0; i < arrayStudent.size(); i++)
        {
            System.out.println("学号：" + arrayStudent.get(i).getsNum());
            System.out.println("姓名：" + arrayStudent.get(i).getName());
            System.out.println("年龄：" + arrayStudent.get(i).getAge());
            System.out.println("班级：" + arrayStudent.get(i).getaClass());
            System.out.println("------------------------------------------");
        }

        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("请输入需要查询的学号");
            int inputNum = sc.nextInt();

            if(inputNum==0)
            {
                System.out.println("成功退出");
                break;
            }

            int ret = getIndex(arrayStudent, inputNum);

            if (ret == -1)
            {
                System.out.println("不存在该学生");
            }
            else
            {
                System.out.println("学号：" + arrayStudent.get(ret).getsNum());
                System.out.println("姓名：" + arrayStudent.get(ret).getName());
                System.out.println("年龄：" + arrayStudent.get(ret).getAge());
                System.out.println("班级：" + arrayStudent.get(ret).getaClass());
            }
        }

    }

    public static int getIndex(ArrayList<Student> arr,int num)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i).getsNum() == num)
            {
                return i;
            }
        }
        return -1;
    }
}
