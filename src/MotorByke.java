/**
 * Created by nibesh on 4/5/17.
 */
public abstract class MotorByke extends Byke {

    @Override
    public String toString() {
        return "MotorByke{" +
                "gears=" + gears +
                ", breakeType='" + breakeType + '\'' +
                ", bykeName='" + bykeName + '\'' +
                ", hornStrength=" + hornStrength +
                ", tyers=" + tyers +
                '}';
    }
}
