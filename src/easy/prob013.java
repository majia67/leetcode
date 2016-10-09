package easy;

public class prob013 {
    public int romanToInt(String s) {
        int result = 0;
        int i;
        for (i = 0; i < s.length() - 1; i++) {
            switch (s.charAt(i)) {
            case 'I':
                switch (s.charAt(i + 1)) {
                case 'V':
                    result += 4;
                    i++;
                    break;
                case 'X':
                    result += 9;
                    i++;
                    break;
                default:
                    result += 1;
                }
                break;
            case 'V':
                result += 5;
                break;
            case 'X':
                switch (s.charAt(i + 1)) {
                case 'L':
                    result += 40;
                    i++;
                    break;
                case 'C':
                    result += 90;
                    i++;
                    break;
                default:
                    result += 10;
                }
                break;
            case 'L':
                result += 50;
                break;
            case 'C':
                switch (s.charAt(i + 1)) {
                case 'D':
                    result += 400;
                    i++;
                    break;
                case 'M':
                    result += 900;
                    i++;
                    break;
                default:
                    result += 100;
                }
                break;
            case 'D':
                result += 500;
                break;
            case 'M':
                result += 1000;
                break;
            }
        }
        if (i < s.length()) {
            switch (s.charAt(i)) {
            case 'I':
                result += 1;
                break;
            case 'V':
                result += 5;
                break;
            case 'X':
                result += 10;
                break;
            case 'L':
                result += 50;
                break;
            case 'C':
                result += 100;
                break;
            case 'D':
                result += 500;
                break;
            case 'M':
                result += 1000;
                break;
            }            
        }
        return result;
    }

    public static void main(String[] args) {
        prob013 test = new prob013();
        System.out.println(test.romanToInt("MDCCCLXXXIV"));
    }
}
