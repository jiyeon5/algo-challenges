import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> st = new Stack<>();

        st.push(0);
        for (int i = 1; i < numbers.length; i++) {
            while (!st.isEmpty() && numbers[st.peek()] < numbers[i]) {
                answer[st.pop()] = numbers[i];
            }
            st.push(i);
        }
        while (!st.empty()) {
            answer[st.pop()] = -1;
        }

        return answer;
    }
}