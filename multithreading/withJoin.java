public class withJoin {
    public static void main(String[] args) {
        Thread obj1 = new Thread(new join(), "obj1");
        Thread obj2 = new Thread(new join(), "obj2");
        Thread obj3 = new Thread(new join(), "obj3");

        obj1.start();
        try{
            obj1.join();;
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        obj2.start();
        obj3.start();
    }
}
class join implements Runnable{
    @Override
    public void run() {
        Thread t = new Thread();
        System.out.println("the thread " + t.getName() + " has started executing");
        try{

            Thread.sleep(2000);
            System.out.println("the thread " + t.getName() + " has has been put to sleep");
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("the thread " + t.getName() + " has ended");
    }
}