/**
 * Created by nibesh on 4/5/17.
 */
public class TVS extends MotorByke {

    @Override
    protected void drive(double toKilometer) {
        System.out.println("your byke has driven"+toKilometer);

    }

    public TVS(String bykeName){
        this.bykeName=bykeName;
    }
}
