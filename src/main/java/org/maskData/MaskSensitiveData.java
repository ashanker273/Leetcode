package org.maskData;

import java.util.regex.*;

public class MaskSensitiveData {
    public static String maskSensitiveInfo(String input) {
        // Regular expression to match numbers inside double quotes
        Pattern pattern = Pattern.compile("(\"[^\"]*?\\d+[^\"]*?\")");
        Matcher matcher = pattern.matcher(input);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String maskedValue = matcher.group(1).replaceAll("\\d", "x"); // Replace digits with 'x'
            matcher.appendReplacement(result, maskedValue);
        }
        matcher.appendTail(result);

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "User SSN: \"123-45-6789\", Employee ID: \"E987654\", Grant ID: \"GRANT12345\", Name: \"John Doe\"";

        String maskedOutput = maskSensitiveInfo(input);

        System.out.println("Original: " + input);
        System.out.println("Masked:   " + maskedOutput);
    }
}
