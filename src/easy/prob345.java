package easy;

public class prob345 {
    public String reverseVowels(String s) {
        boolean[] isVowel = new boolean[256];
        isVowel['a'] = isVowel['A'] = isVowel['e'] = isVowel['E'] 
                = isVowel['i'] = isVowel['I'] = isVowel['o'] = isVowel['O']
                        = isVowel['u'] = isVowel['U'] = true;
        
        char[] str = s.toCharArray();
        int i = 0, j = str.length - 1;
        while (i < j) {
            while (i < j && !isVowel[str[i]]) i++;
            while (i < j && !isVowel[str[j]]) j--;
            if (i < j) {
                char tmp = str[i];
                str[i] = str[j];
                str[j] = tmp;
                i++; j--;
            }
        }
        return new String(str);
    }
}
