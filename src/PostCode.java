
public class PostCode {
    final static int A = 1;
    final static int N = 2;
    final static int S = 3;

    static int possibility[][] = {
            {A,A,N,N,S,N,A,A},
            {A,N,N,S,N,A,A},
            {A,A,N,S,N,A,A},
            {A,N,S,N,A,A}};

    public static Boolean valid(String postcode) {
        Boolean result = false;
        for(int[] pos : possibility) {
            Boolean running = true;
            for(int i = 0; i < postcode.length(); i++) {
                if(pos.length > i && !PostCode.comparisonToValue(pos[i],postcode.charAt(i))){
                    running = false;
                    break;
                } else if (pos.length <= i) {
                    running = false;
                    break;
                }
            }
            if (running == true) {
                result = true;
                break;
            }
        }

        return result;

    }

    private static Boolean comparisonToValue(int type, Character c) {
        switch(type) {
        case PostCode.A:
            return isAlpha(c);
        case PostCode.S:
            return isSpace(c);
        case PostCode.N:
            return isNumeric(c);
        default:
            throw new RuntimeException("Unexpected");
        }
    }
    private static Boolean isAlpha(Character c) {
        String test = (""+c).toUpperCase();
        Character ct = test.charAt(0);
        return (ct >= 'A' && ct <= 'Z' );
    }
    private static Boolean isNumeric(Character c) {
        return (c >= '0' && c <= '9' );
    }
    private static Boolean isSpace(Character c) {
        return ( c == ' ' );
    }
}
