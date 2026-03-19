class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int cnt = 0;
        String[] spell2  = new String [spell.length];
        for(int i = 0 ; i < spell.length ; i++ ){
            spell2[i] = spell[i];
        }
        for(int i = 0 ; i < dic.length ; i++){
            for(int j = 0 ; j < dic[i].length() ; j++){
                for(int k = 0 ; k < spell2.length ; k++){
                    if((dic[i].charAt(j)+"").equals(spell2[k])){
                        cnt++;
                        spell2[k] = spell2[k].toUpperCase();

                    }
                    System.out.print(spell2[k]);
                }
            }
            System.out.println();
            if(cnt == spell2.length){
                answer = 1;
            }
            // System.out.print("!"+cnt+"!");
            cnt=0;
            for(int k = 0 ; k < spell.length ; k++){
                    spell2[k] = spell2[k].toLowerCase();
            }
        }
        return answer;
    }
}