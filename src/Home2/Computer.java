package Home2;

public class Computer {
    static Computers [] computer = new Computers[5] ;

    public static void main(String[] args) {
        computer  [0] = new Computers( "First");
        computer  [1] = new Computers( "Second");
        computer  [2] = new Computers( "Third");
        computer  [3] = new Computers( "Fourth");
        computer  [4] = new Computers( "Fifth");

        for (int i = 0; i < 5; i++) {
            System.out.println(computer  [i].name );
            
        }
    }
}
