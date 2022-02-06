class Sample{

    int num;
    String name = "suba";

    private Sample()
    {
        name = "sri";
    }

    public static void main(String args[])
    {
        Sample obj = new Sample();
        System.out.println(obj.name);
        String var = new Sample().name;
        System.out.println(var);
    }
}