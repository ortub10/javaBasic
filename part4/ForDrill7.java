package lesson4;

public class ForDrill7 {
    public static void main(String[] args) {
        int NumOfBoom = 0;
        for (int i = 1; i<=99; i++){
            if(i%7==0 || i%10==7 || i/10==7){
                System.out.println("Boom");
                NumOfBoom++;
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("Num Of Boom: "+NumOfBoom);
    }
}
