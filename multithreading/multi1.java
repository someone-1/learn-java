class Multi1 extends Thread{
    static int count = 0;
    int current ;

    public void run() {
        current = count++;
        System.out.println(" running the thread"+ current);
    }
    
    public static void main(String args[]){
        Multi t = new Multi();
        t.start();
        Multi t2 = new Multi();
        t2.start();
    }
}