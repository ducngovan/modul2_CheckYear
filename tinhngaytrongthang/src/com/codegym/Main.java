package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 5;
        while (i > 0) {
            CheckDay day = new CheckDay();
            day.setValiDate();
            day.getYear();
            day.getDay();
            i--;
        }
    }
}
class CheckDay{
   private int year, month;
    public void setValiDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ban nham nam: ");
        year = scanner.nextInt();
        System.out.print("Ban hay nhap thang: ");
        month = scanner.nextInt();
    }
    public void getYear(){
        if(year % 4 == 0){
            System.out.println(year+ " la nam nhuan");
        }else if( year % 400 == 0 && year % 100 == 0){
            System.out.println(year+ " la nam nhuan");
        }else {
            System.out.println(year+" khong phai nam nhuan");
        }
    }
    public void getDay(){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+" co 31 ngay. ");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+ " co 30 ngay.");
            break;
            case 2:
                if(year % 4 ==0 ||(year % 100 == 0 && year % 400 ==0)){
                    System.out.println(month+" co 29 ngay.");
                }else{
                    System.out.println(month+ " co 28 ngay.");
                }break;
            default:
                System.out.println("nhap lai so thang.");
                break;
        }
    }
}