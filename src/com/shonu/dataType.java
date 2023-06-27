package com.shonu;

class Students{
    int rollNo;
    String name;
    static int count = 0;
    Students(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
        count++;
    }

    static void showCount(){
        System.out.println(count);
    }
}
public class dataType {
    public static void main(String[] args) {
Students s1 = new Students(1,"ram");
        System.out.println(s1.count);
        Students s2 = new Students(2,"shyam");
        System.out.println(s2.count);
        Students s3 = new Students(3,"radhe");
        System.out.println(s3.count);
    }
}
