package aikam.test;

import java.io.File;

public class Main {

    private static String type; /* type of operation (might be "search" or "stat")*/
    private static String inputFileName;/* input file name (might contains ".json" substring)*/
    private static String outputFileName;/* output file name (might contains ".json" substring)*/
    private static boolean checkArgs(String[] args) {/* checks arguments correction*/
        if (args.length != 3) {
            System.out.println("Wrong number of arguments (might be 3)");
            return false;
        }
        type = args[0];
        if (!type.equals("search") && !type.equals("stat")) {
            System.out.println("Wrong type of operation (might be search or stat)");
            return false;
        }
        inputFileName = args[1];
        if (!inputFileName.contains(".json")) {
            System.out.println("Wrong type of input file (might contains .json)");
            return false;
        }
        File file = new File(inputFileName);
        if (!file.canRead()) {
            System.out.println("Can not read input file");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(args[0]);
    }
}
