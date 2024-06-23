package src.br.com.thaizacn.designpattern;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static final String NO_FILES = "NO FILES";
    public static final List<String> VALID_EXTENSIONS = Arrays.asList("doc", "xls", "pdf");

    public String solution(String S) {
        int minLength = Integer.MAX_VALUE;
        String[] lines = S.split("\n");

        for (String line : lines) {
            line = line.trim();
            if (line.isEmpty()) {
                continue;
            }

            String[] parts = line.split("\\s+");
            if (parts.length != 3) {
                continue;
            }

            String owner = parts[0].trim();
            String perm = parts[1].trim();
            String name = parts[2].trim();

            if (isBinaryDocument(name) && isReadOnly(perm) && isRootOwner(owner)) {
                minLength = Math.min(minLength, name.length());
            }
        }

        return minLength == Integer.MAX_VALUE ? NO_FILES : String.valueOf(minLength);
    }

    private static boolean isBinaryDocument(String name) {
        int dotIndex = name.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == name.length() - 1) {
            return false;
        }

        String extension = name.substring(dotIndex + 1).toLowerCase();
        return VALID_EXTENSIONS.contains(extension);
    }

    private static boolean isReadOnly(String perm) {
        return perm.substring(0, 1).equals("r") && perm.substring(1, 2).equals("-");
    }

    private static boolean isRootOwner(String owner) {
        return owner.equals("root");
    }

    public static void main(String[] args) {
        // Example test case
        String testInput = "  root r-x delete-this.xls\n" +
                           "  root r-- bug-report.pdf\n" +
                           "  root r-- doc.xls\n" +
                           "  root r-- podcast.flac\n" +
                           "  alice r-- system.xls\n" +
                           "  root --x invoices.pdf\n" +
                           "  admin rwx SETUP.PY" +
                            "  admin rwx SETUP.PY";

        Solution solution = new Solution();
        String result = solution.solution(testInput);
        System.out.println("Result: " + result); // Expected output: "7"
    }
}
