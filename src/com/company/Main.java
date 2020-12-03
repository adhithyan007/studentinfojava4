package com.company;

import java.awt.*;
class student {
    String name;
    int id;
    char gen;
    String  sub;
    float tot;
    student(){
        name="binu";
        id=1122;
        gen='m';
        sub="maths";
        tot=54;
    }
    public void studentdetail(String Name,int studentid,String subject,char gender,float total)
    {
        name=Name;
        id=studentid;
        gen=gender;
        sub=subject;
        tot=total;
    }
    public void Displaydetails(){

        System.out.println("Student Details");
        System.out.println("-----------------\n");
        System.out.println(" 1.Enter Student Name::"+name);
        System.out.println(" 2.Student Id::"+id);
        System.out.println(" 3.gender::"+gen);
        System.out.println(" 4.subjects::"+sub);
        System.out.println(" 5.total marks::"+tot);

    }

}
public class Main {
public static void main(String[] args){
    student detail=new student();
    student[] Student=new student[10];
    Student[0]=new student();

    //Student[0].studentdetail("donk",1236,"science",'m',44);
    Student[0].Displaydetails();
    //detail.studentdetail("don",1234,"science",'m',45);
    detail.Displaydetails();
}

}
