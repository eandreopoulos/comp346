package Lab2;

public class Main{
    public static void main(String[] args){
        Account ac = new Account();
        Dipositor dip = new Dipositor(ac);
        dip.start();
        Withdrawer withd = new Withdrawer(ac);
        withd.start();
        try {
        	dip.join();
        	withd.join();
        }catch (InterruptedException e) {
        	e.printStackTrace();
        
        }
        System.out.println("Balance is: " +ac.bal);
    }
    
}
