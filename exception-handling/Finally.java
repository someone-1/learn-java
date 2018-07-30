class Finally{
    public static void main(String args[]){
        System.out.println(myMethod());
    }
    public static int myMethod(){
        try {
            System.out.println("try block");
            return 112;
        }
        finally {
            // this is a example of using try-finally block
            // the below section of code will run after return statement in the try block
            System.out.println("This is Finally block");
            System.out.println("Finally block ran even after return statement");
        }
    }
}