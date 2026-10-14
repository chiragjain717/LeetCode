class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
        return "";
    }

    char[] arr = new char[num];

    for (int i = 0; i < num; i++) {
        if (sum >= 9) {
            arr[i] = '9';
            sum -= 9;
        } else {
            arr[i] = (char) ('0' + sum);
            sum = 0;
        }
    }

    return new String(arr);
    }
}