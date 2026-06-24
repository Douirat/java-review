import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        Arrays.sort(args);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<args.length; i++){
            if(i>0) sb.append(" ");
            sb.append(args[i]);
            if(i==args.length-1)sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}