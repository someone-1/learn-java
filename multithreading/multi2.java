class multi2 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread running");
    }

    public static void main(String[] args) {
        multi2 obj = new multi2();
        Thread  t1 = new Thread(obj);
        t1.start();
    }
}