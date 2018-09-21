package icu.cyclone.alex;

public class CharStatistic {
    private String string;
    private int[] statistic = new int[25];

    CharStatistic(String string) {
        this.string = string;
        calcStatistic();
    }

    private void calcStatistic() {
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) - 97 > -1 && string.charAt(i) - 97 < 25) {
                statistic[string.charAt(i) - 97] += 1;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Symbol  Count");
        sb.append(System.lineSeparator());
        for (int i = 0; i < statistic.length; i++) {
            if (statistic[i] > 0) {
                sb.append((char) (i + 97))
                        .append("       ")
                        .append(statistic[i])
                        .append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
