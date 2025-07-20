//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int gaba = 569 ;
        byte dahun = 67 ;
        short puer = 27897 ;
        long tiguan = 987678965549L ;
        float milkUlun = 2.786F ;
        double ivan = 27.12 ;
        long shuPuer = -159 ;

        System.out.println("Значение переменной " + " gaba " + " с типом " + " int " + " равно " + gaba);
        System.out.println("Значение переменной " + " dahun " + " с типом " + " byte " + " равно " + dahun);
        System.out.println("Значение переменной " + " puer " + " с типом " + " short " + " равно " + puer);
        System.out.println("Значение переменной " + " tiguan " + " с типом " + " long " + " равно " + tiguan);
        System.out.println("Значение переменной " + " milkUlun " + " с типом " + " flout " + " равно " + milkUlun);
        System.out.println("Значение переменной " + " ivan " + " с типом " + " double " + " равно " + ivan);
        System.out.println("Значение переменной " + " shuPuer " + " с типом " + " long " + " равно " + shuPuer);

        byte ludPavlova = 23;
        byte annaSergeevna = 27;
        byte katerinaAndreevna = 30;
        short paper = 480;
        long paperStudent = paper / (ludPavlova + annaSergeevna + katerinaAndreevna);
        System.out.println("На каждого ученика расчитано "+paperStudent+" листков бумаги");

        byte krask = 120;
        byte kraskBelKab = 2;
        byte kraskKorKab = 4;
        byte kraskKlass = (byte) (krask / (kraskKorKab + kraskBelKab));
        byte kraskKlassB = (byte) (kraskKlass * kraskBelKab);
        byte kraskKlassK = (byte) (kraskKlass * kraskKorKab);

        System.out.println("В школе, где "+kraskKlass+" классов, нужно "+kraskKlassB+" банок белой красски и "+kraskKlassK+" банок коричневой красски");

//Задача №6
         byte massBanana = 80;
         byte massMilk = 105;
         byte massIceCkem = 100;
         byte massEgg = 70;
         byte sumBan = 5;
         byte sumMilk = 2;
         byte sumIceCkem = 2;
         byte sumEgg = 4;
         short banana = (short) (massBanana*sumBan);
         short milk = (short) (massMilk*sumMilk);
         short IceCkem = (short) (massIceCkem*sumIceCkem);
         short egg = (short) (massEgg*sumEgg);
         short mass = (short) (banana + milk + IceCkem + egg);
         System.out.println(mass);

         float massKg = (float) (mass / 1000F) ;
         System.out.println(massKg);

         byte overweight = 7;
         short min = 250;
         short max = 500;
         short overweighted = (short) (overweight*1000);
         byte minDay = (byte) (overweighted/ min);
        System.out.println("Максимальное количество дней для похудения "+minDay);

         byte maxDay = (byte) (overweighted/max);
        System.out.println("Mинимальное количество дней для похудения "+maxDay);

         byte averageDay = (byte) ((minDay+maxDay)/2);
         System.out.println("Среднее время похудения спортсмена "+averageDay+" день");


    }
}