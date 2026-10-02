class Solution {
    public int[] decrypt(int[] code, int k) {

        int sum = 0;
        int n = code.length;
        int[] arr = new int[n];
        if (k == 0) {
            return arr;
        }
        if (k > 0) {
            for (int i = 1; i <= k; i++) {
                sum += code[i % n];
            }
            arr[0] = sum;
            for (int i = 1; i < n; i++) {

                int current = sum
                            - code[i % n]
                            + code[(i + k) % n];

                sum = current;
                arr[i] = current;
            }

            return arr;
        }
        k = -k;

        int value = 0;
        for (int i = 1; i <= k; i++) {
            value += code[n - i];
        }

        arr[0] = value;
        for (int i = 1; i < n; i++) {
            int current = value  - code[(i - k - 1 + n) % n]
                        + code[(i - 1 + n) % n];

            value = current;
            arr[i] = current;
        }
        return arr;
    }

}
