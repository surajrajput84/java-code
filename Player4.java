abstract class Cricket {
    abstract void fitness();

 
}

class Player4 extends Cricket {
        void fitness() {
        System.out.println("running");
    }
	    public static void main(String[] args) {
        Player4 p =new Player4();
	p.fitness();
        
        
    }
}


