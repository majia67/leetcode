package hard;

public class Prob068_Text_Justification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new LinkedList<String>();
        int st = 0;
        int ed = 0;
        int len = 0;
        for (; ed < words.length; ed++) {
            len += words[ed].length();
            if (len + (ed - st) >= maxWidth) {
                // parse a line from st to ed
                if (len + (ed - st) > maxWidth) {
                    len -= words[ed].length();
                    ed--;
                }
                int spaceRequired = maxWidth - len;
                int blankCount = ed - st;
                if (blankCount > 0) {
                    int spandRatio = spaceRequired / blankCount;
                    int remainExtra = spaceRequired % blankCount;
                    String space = new String(new char[spandRatio]).replace("\0", " ");
                    String line = "";
                    for (int i = st; i < ed; i++) {
                        line += words[i] + space;
                        if (remainExtra > 0) {
                            line += " ";
                            remainExtra--;
                        }
                    }
                    line += words[ed];
                    result.add(line);
                }
                else {
                    // parse a line with word[st]
                    String space = new String(new char[spaceRequired]).replace("\0", " ");
                    result.add(words[st] + space);
                }
                st = ed + 1;
                len = 0;
            }
        }
        
        if (ed - st > 0) {
            // parse the last line;
            String line = "";
            line += words[st];
            for (int i = st+1; i < ed; i++)
                line += " " + words[i];
            int endSpace = maxWidth - len - (ed - st - 1);
            line += new String(new char[endSpace]).replace("\0", " ");
            result.add(line);
        }
        
        return result;
    }
}
