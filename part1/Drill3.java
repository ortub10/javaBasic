package lesson1;

public class Drill3 {
    public static void main(String[] args) {
        System.out.println(2+9); // 11
        System.out.println("2"+9);// "2" + "9" --> 29
        System.out.println(2+"9");// "2" + "9" --> 29
        System.out.println(3+5+"9");// "8" + "9" --> 89
        System.out.println("9"+3+5);//"9" +"3" + "5" --> 935
        System.out.println("9"+(3+5));// "9" + "8" --> 98
        System.out.println(8+7+""+4*7+9);//"15" + "28" + "9" --> 15289
        System.out.println(7*7+3+8+""+(8*2+4));// "60" + "20" -->6020
    }
}
