class finallyBlockDemo{
    public static void main(String[] args) {
        try{
            System.out.println(9/0);
        }
        finally {
            System.out.println("Finally");
        }
    }
}