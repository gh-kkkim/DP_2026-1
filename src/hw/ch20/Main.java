package hw.ch20;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);

        String[] colors = {
                BigChar.RED,      // 1
                BigChar.BLUE,     // 2
                BigChar.GREEN,    // 1
                BigChar.MAGENTA,  // 2
                BigChar.CYAN,     // 1
                BigChar.YELLOW,   // 2
                BigChar.BLUE      // 3
        };
        
        bs.print(colors);
    }
}
