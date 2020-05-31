package TestsMy;

public class RLECompress {

    public String encode(String source) {
        if (source == null || source.isEmpty()) {
            return "";
        }
        source = source.trim();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (Character.isDigit(source.charAt(i)) || isSlash(source.charAt(i))) {
                sb.append("\\");
            } else {
                int runLength = 1;
                while (i + 1 < source.length() && source.charAt(i) == source.charAt(i + 1)) {
                    runLength++;
                    i++;
                }
                sb.append(runLength);
            }
            sb.append(source.charAt(i));
        }
        return sb.toString();
    }


    public String decode(String source) {
        if (source == null || source.isEmpty()) {
            return "";
        }

        source = source.trim();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length() - 1; i++) {
            if (Character.isDigit(source.charAt(i))) {
                int num = Integer.parseInt(String.valueOf(source.charAt(i)));
                for (int j = 0; j < num; j++) {
                    if(!isSlash(source.charAt(i + 1) )) {
                        sb.append(source.charAt(i + 1));
                    }
                }
            } else if (isSlash(source.charAt(i)) && Character.isDigit(source.charAt(i + 1))) {
                sb.append(source.charAt(i + 1));
            } else if (isSlash(source.charAt(i)) && isSlash(source.charAt(i + 1)) && !Character.isDigit(source.charAt(i + 2))) {
                sb.append(source.charAt(i));
            }
        }
        return sb.toString();
    }

    private boolean isSlash(char ch) {
        return ch == '\\' ;
    }

}