class Pair {
    public static void main(String[] args)
    {
        String[] males ={"Surya","Charan", "Krishna","Tarun","Chandra"};
        String[] actresses = {"anupama","rashmika","pooja hedge","samantha","sai pallavi","sunnyleone","kazal","tamanna"};

        int malelen = males.length;
        int actresseslen = actresses.length;
        //generate 2 rand nums :)
        int rand1 = (int) (Math.random()*malelen);
        int rand2 = (int) (Math.random()*actresseslen);

        //now its tym to build a pair  
        String pair = males[rand1] + " weds " + actresses[rand2] ;
        //printing the pair
        System.out.println("Here comes the pair \n" + pair);
    }
}
