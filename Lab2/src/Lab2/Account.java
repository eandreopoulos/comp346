package Lab2;

public class Account  {
    int bal=1000;
    public synchronized void diposit(){
        bal += 10;
    }
    public synchronized void withdraw(){
        bal -= 10;
    }
}
