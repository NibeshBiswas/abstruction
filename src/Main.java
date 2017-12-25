/**
 * Created by nibesh on 4/5/17.
 */
public class Main {


    public static void main(String[] args) {
        Byke myHunda=new Hunda("My Hunda is aswome");

        myHunda.drive(100);
        myHunda.setBreakeType("Hydrolic");
        myHunda.setGears(5);
        myHunda.setHornStrength(100.5);

        Byke myHunda2=new Hunda(" Ymma");
        myHunda2 .displayByke();


        System.out.println(myHunda.toString());
    }
}
