package codesignals;

/**
 * Created by FF on 3/9/17.
 */
class level5 {

    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        if (yourLeft + yourRight != friendsLeft + friendsRight)
            return false;

        int ff1 = 0, ff2 = 0;
        if ((yourLeft - yourRight) > 0) {
            ff1 = yourLeft;
        } else {
            ff1 = yourRight;
        }

        if ((friendsLeft - friendsRight) > 0) {
            ff2 = friendsLeft;
        } else {
            ff2 = friendsRight;
        }
        return ff1 == ff2;
    }

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int dif = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (Math.abs(inputArray[i] - inputArray[i + 1]) > dif)
                dif = Math.abs(inputArray[i] - inputArray[i + 1]);
        }
        return dif;
    }

    boolean isIPv4Address(String inputString) {
        String[] array = inputString.split("\\.");
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals("") || array.length != 4) return false;
                if (Integer.parseInt(array[i]) > 255 || Integer.parseInt(array[i]) < 0) {
                    return false;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }


}
