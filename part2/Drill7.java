package lesson2;

import java.util.Scanner;

public class Drill7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double mooney = sc.nextDouble();
        int  twenty_shekel = (int)mooney/20;
        mooney-=(twenty_shekel*20);
        int  ten_shekel  = (int)mooney/10;
        mooney-=(ten_shekel*10);
        int  five_shekel  = (int)mooney/5;
        mooney-=(five_shekel*5);
        int  shnekel = (int)mooney/2;
        mooney-=(shnekel*2);
        int  shekel = (int)mooney/1;
        mooney-=(shekel*1);
        mooney*=100;
        mooney = Math.ceil(mooney);
        int  fifty_agorot = (int)mooney/50;
        mooney-=((int)fifty_agorot*50);
        int  ten_agorot = (int)mooney/10;

        System.out.println("twenty_shekel : "+twenty_shekel+"\nten_shekel : "+ten_shekel+"\nfive_shekel : "+ five_shekel
        +"\nshnekel : "+shnekel+"\nshekel : "+shekel+"\nfifty_agorot : "+(int)fifty_agorot+"\n ten_agorot : "+ (int)ten_agorot);

    }
}
