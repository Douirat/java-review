import java.util.ArrayList;
import java.util.List;

public class CleanExtract {
    public static String extract(String s) {
        List<String> portions = new ArrayList<>();

        StringBuilder fragment = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '|') {
                portions.add(fragment.toString());
                fragment.setLength(0);
                continue;
            }
            fragment.append(c);
        }
        if (!fragment.isEmpty()) {
            portions.add(fragment.toString());
        }

        List<String> result = new ArrayList<>();

for (String st : portions) {
    int x = st.indexOf('.');
    int y = st.lastIndexOf('.');

    if (x == -1) {
        continue;
    }

    String extracted;

    if (x == y) {
        // only one dot
        extracted = st.substring(x + 1);
    } else {
        // two or more dots
        extracted = st.substring(x + 1, y);
    }

    extracted = extracted.trim();

    if (!extracted.isEmpty()) {
        result.add(extracted);
    }
}
        StringBuilder f = new StringBuilder();
        for (String str : result) {
            if (!f.isEmpty() && !str.isEmpty()) {
                f.append(" ");
            }

            f.append(str);
        }

        return f.toString();
    }

}
