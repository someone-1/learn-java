class CheckedExceptionPropagation{
    void m(){
        //checked exception
        throw new java.io.IOException("device error");
    }
    void n(){
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
        CheckedExceptionPropagation obj=new CheckedExceptionPropagation();
        obj.p();
        System.out.println("normal flow");
    }
}

// CheckedExceptionPropagation.java:3: error: unreported exception IOException; must be caught or declared to be thrown
//         throw new java.io.IOException("device error");//checked exception
//         ^
// 1 error