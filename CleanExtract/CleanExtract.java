import java.util.ArrayList;
import java.util.List;

public class CleanExtract {
    public static String extract(String s) {
        List<String> portions = new ArrayList<>();

        StringBuilder fragment = new StringBuilder();
        for (char c: s.toCharArray()) {
            if(c == '|') {
                portions.add(fragment.toString());
                fragment.setLength(0);
                continue;
            }
            fragment.append(c);
        }

        StringBuilder result = new StringBuilder();

        for (var st: portions) {
         if(!result.isEmpty()) {
            result.append(" ");
         }
         
         result.append(st.s);
            System.out.println(st);
        }

        return "";
    }
}