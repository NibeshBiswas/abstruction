/**
 * Created by nibesh on 4/5/17.
 */
public class Ymma extends MotorByke{

    public Ymma(String bykeName){
        this.bykeName=bykeName;
    }

    @Override
    protected void drive(double toKilometer)
        {
            System.out.println("your byke has driven"+toKilometer);
    }

}
