class Exceptionhandling1{
    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        try {
        checkAge(15);
    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }
}}