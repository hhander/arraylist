package Arraylist;

public class StringDemo2 {
    public static void main(String[] args) {
        String name = "AB,CD,EF,G";
        String a = name.substring(0,4);
//        name = name.replace('A','B');
        String[] names = name.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }


    }
}
