class Clock{
    private String time;

    public void settime(String t)
    {
        time = t;
    }

    public String gettime()
    {
        return time;
    }
}
class Clocktestdrive {
    public static void main(String[] args) {
        Clock c = new Clock();

        c.settime("1245");
        String tod = c.gettime();
        System.out.println("time : " + tod);
    }
}
