package tddvoorbeeld;

public class StringAdder {
    public int add(String s) {
        try {
            if (s.isEmpty()) {
                return 0;
            }

            String numberOnly = s.replaceAll("[^0-9]", "");
            int sum = 0;
            for (int i = 0; i < numberOnly.length(); i++) {
                sum += Integer.parseInt(numberOnly.substring(i, i + 1));
            }
            return sum;


        } catch (Exception e) {
            throw new UnsupportedOperationException("Not yet handled.");
        }
    }
}
