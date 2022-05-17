package newsales;

public class CreditCardPayment extends Payment {
    private int cardNumber;

    public CreditCardPayment(int _cardNumber, int _pvp){
        super(_pvp);
        this.cardNumber = _cardNumber;
    }

    public Boolean Autorization(){
        return false;
    }

    public void DetailPayment() {
        System.out.println("Credit Card Payment : amount - " + this.pvp + ", Credit Card Number :" + this.cardNumber + " authorize : " + Autorization());
    }
}
