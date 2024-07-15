public class W03_01_Netprice{
    public static void main(String [] args){
    int price = 350;
    int quantity = 10;
    byte percentDiscount = 5;
    int totalPrice = price * quantity;
    int discount = totalPrice * percentDiscount/100;
    int netprice = totalPrice - discount;
    System.out.println("ราคาสินค้าทั้งหมด "+totalPrice +" บาท");
    System.out.println("ราคาส่วนลด "+discount +" บาท");
    System.err.println("ราคาสุทธิ "+ netprice +" บาท");
    }
}