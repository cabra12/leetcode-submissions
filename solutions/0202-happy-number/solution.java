class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNextNum(n);

        while(fast != 1 && slow != fast) {
            slow = getNextNum(slow);
            fast = getNextNum(getNextNum(fast));
        }

        return fast == 1;
    }

    private int getNextNum(int n) {
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
