class NPE{
    void f() throws NullPointerException{
        String a=null;
        System.out.println(a.equals("h"));
    }

    public static void main(String[] args) {
        NPE j = new NPE();
        j.f();
    }
}