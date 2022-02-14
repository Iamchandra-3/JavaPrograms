class Books{
    String title;
    String author;
}

class Bookstestdrive {
    public static void main(String[] args){
        Books[] mybooks = new Books[3];
        int x =0;
        mybooks[0]= new Books();
        mybooks[1] = new Books();
        mybooks[2] = new Books();
        mybooks[0].title = "The Graphes of Java";
        mybooks[1].title = "The Java Gatsby";
        mybooks[2].title = "The Java Cookbook";
        mybooks[0].author = "bob";
        mybooks[1].author = "sue";
        mybooks[2].author = "ian";

        while(x<3){
            System.out.print(mybooks[x].title);
            System.out.print(" by ");
            System.out.println(mybooks[x].author);
            x=x+1;
        }
    }
        
    }






    

