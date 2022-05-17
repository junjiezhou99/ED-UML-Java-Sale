package newsales;

public class Sale {
    private String id;
    private String desc;
    private Payment payment;

    public Sale(String _id, String _desc){
        this.id = _id;
        this.desc = _desc;
    }

    public void setPayment(Payment pay){
        this.payment = pay;
    }

    public Payment getPayment(){
        return this.payment;
    }
}
