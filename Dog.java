class Dog {
    String name;
    public static void main(String[] args) {
        //make a dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        //now make a dog array
        Dog[] mydogs = new Dog[3];
        //and put some dogs in it
        mydogs[0] = new Dog();
        mydogs[1] = new Dog();
        mydogs[2] = dog1;
        //now access the dogs using arrays
        //references
        mydogs[0].name = "Fred";
        mydogs[1].name = "Marge";

        //Hmmm...... what is mydogs[2] name?
        System.out.print("Last dog's name is ");
        System.out.println(mydogs[2].name);
        //now loop through the array
        // and tell all dogs to bark
        int x = 0;
        while(x < mydogs.length){
            mydogs[x].bark();
            x=x+1;
        }
    }
    public void bark()
    {
        System.out.println(name + " says Ruff!");
    }
    //Public void eat(){ }
    //Public void chaseCat(){ }
}
