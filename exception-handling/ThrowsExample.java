import java.io.IOException;
class ThrowsExample{
    void m() throws IOException{
        //checked exception
        throw new java.io.IOException("device error");
    }
    void n() throws IOException{
        // checked example wont be propagated without declation using throw
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handeled");
        }
    }
    public static void main(String args[]){
        ThrowsExample obj=new ThrowsExample();
        obj.p();
        System.out.println("normal flow");
    }
}
