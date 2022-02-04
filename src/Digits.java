import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        String numAsString = num + "";
        for (int i = 0; i < numAsString.length(); i ++) {
            digitList.add(Integer.parseInt(numAsString.substring(i,i+1)));
        }
    }

    public boolean isStrictlyIncreasing() {
        if (digitList.size() == 1) {
            return true;
        }
        for (int i = 0; i < digitList.size(); i++) {
            if (digitList.get(i) <= digitList.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}
