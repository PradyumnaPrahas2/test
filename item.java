public class item {
    String name;
    float price;
    int quantity;
    public item(String name,float price,int qnty){
        this.name=name;
        this.price=price;
        this.quantity=qnty;
    }
    public void getdetails(){
        System.out.print(this.name+' ');
        System.out.print(this.price+' ');
        System.out.print(this.quantity+' ');
        System.out.println();
    }
    public double getprice(){
        return this.price*this.quantity;
    }
}
