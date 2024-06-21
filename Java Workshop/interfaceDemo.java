interface Car{
    void ride();
}
class Check implements Car{
    public void ride(){
        System.out.println("Running Safely");
    }

    public static void main(String[] args) {
        Check obj = new Check();
        obj.ride();
    }
}