1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
class Solution {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    
north--
;
                    break;
                case 'E':
                    
east++
;
                    break;
                case 'W':
                    
east--
;
                    
break
;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}