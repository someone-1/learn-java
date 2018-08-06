public class withoutJoin {
    public static void main(String[] args) {
        Thread obj1 = new Thread(new join(), "obj1");
        Thread obj2 = new Thread(new join(), "obj2");
        Thread obj3 = new Thread(new join(), "obj3");

        obj1.start();
        obj2.start();
        obj3.start();

    }
}

class join implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("thread " + t.getName() +" started \n putting thread to sleep");
        
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println("interrupted exception " +e);
        }
        System.out.println("thread " + t.getName()+ " has ended");

    }
}