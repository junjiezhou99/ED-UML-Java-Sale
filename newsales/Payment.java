package newsales;

public abstract class Payment implements IPayment{
    public int pvp;

    public Payment (int _pvp){
        this.pvp = _pvp;
    }

}
