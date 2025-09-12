class Solution {
    public int solution(String myString, String pat) {
        // Step 1: 문자열 치환
        String changed = myString.replace("A", "X")
                                 .replace("B", "A")
                                 .replace("X", "B");
        
        // Step 2: 부분 문자열 검사
        if (changed.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}
