// 첫 번째 방법
class Solution {
    public int solution(int n, int t) {

        for(int i = 1; i <= t; i++) {
            n *= 2;
        }

        return n;
    }
}

// 두 번째 방법
class Solution {
    public int solution(int n, int t) {
        return n * (int)Math.pow(2, t);
    }
}
