public class MultipleCatchBlock{
    public static void main(String args []){
        try{
            int a[] = new int[5];
            a[5] = 31;
            // a[5] = 21/0;
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("task1 is completed");
        } 
        System.out.println("rest of the code...");
    }
}