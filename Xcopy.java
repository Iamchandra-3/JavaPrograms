class Xcopy {
    public static void main(String[] args) {
        int orig = 42;
        Xcopy x = new Xcopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);// 42 84(output)
        
    }

    int go(int arg)
    {
        arg = arg*2;
        return arg;
    }
}
