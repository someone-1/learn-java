public class WithException{
    public static void main(String args[]){
        try{
            int data=50/0;// throw exception
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code...");  
    }  
}