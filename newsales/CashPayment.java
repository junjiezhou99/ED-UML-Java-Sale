package newsales;

public class CashPayment extends Payment{
    private int pvpTendered;

    public CashPayment(int _pvp, int _amount){
        super(_pvp);
        this.pvpTendered = _amount;
    }

    public int calcChange(){
        return this.pvpTendered - this.pvp;
    }

    public void DetailPayment(){
        System.out.println("Cash Payment : amount - " + this.pvp + ", Amount Tendered :" + this.pvpTendered + " Change :" + calcChange());
    }
}
