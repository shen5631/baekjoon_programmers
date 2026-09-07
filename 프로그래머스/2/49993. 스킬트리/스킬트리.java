class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        
        for(int i = 0 ; i < skill_trees.length ; i++){
            String temp = skill_trees[i].replaceAll("[^"+skill+"]","");
            if(temp.length() == skill.length()){
                if(temp.equals(skill)){
                    answer++;
                }
            }
            else if(temp.length() == 0){
                answer++;
            }
            else{
                String temp2 = skill.substring(0,temp.length());
                if(temp2.equals(temp)){
                    answer++;
                }
            }
        }
        
        
        
        return answer;
    }
}