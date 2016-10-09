package easy;

public class prob383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rans = new int[256];
        int[] magz = new int[256];
        for (int i = 0; i < ransomNote.length(); i++)
            rans[ransomNote.charAt(i)]++;
        for (int i = 0; i < magazine.length(); i++)
            magz[magazine.charAt(i)]++;
        for (int i = 0; i < 256; i++)
            if (rans[i] > magz[i])
                return false;
        return true;
    }
}
