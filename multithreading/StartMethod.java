public class StartMethod {
    public void run(){
        for(int i=1;i<=3;i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Thread th1 = new Thread(new StartMethod(), "th1");
        Thread th2 = new Thread(new StartMethod(), "th2");
        th1.start();
        th2.start();
    }
}