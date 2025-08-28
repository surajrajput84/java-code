abstract class Animal {
    abstract void voice();

 
}

class Cat4 extends Animal {
        void voice() {
        System.out.println("mewo mewo");
    }
	    public static void main(String[] args) {
        Cat4 c = new Cat4();
        
        c.voice();
    }
}


