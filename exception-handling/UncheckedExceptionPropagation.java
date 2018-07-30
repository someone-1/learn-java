class UncheckedExceptionPropagation{
    void m(){
        int data=50/0;
        //the above statement produces an unchecked exception
        // meaning the exception happens at run time
    }
    void n(){
        // the method m() is where the root exception takes place
        m();
        // unchecked exception propagates up the methods
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }
    public static void main(String args[]){
        UncheckedExceptionPropagation obj = new UncheckedExceptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }
}

