// 내가 푼 풀이
class Solution {
    public int solution(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        return answer;
    }
}

// 다른 사람 풀이
class Solution {
    public int solution(int[] box, int n) {
        int answer,w,h,d=0;
        w=box[0]/n;
        h=box[1]/n;
        d=box[2]/n;
        answer=w*h*d;

        return answer;
    }
}
