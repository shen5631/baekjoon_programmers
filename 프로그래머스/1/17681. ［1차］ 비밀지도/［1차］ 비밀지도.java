import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        
        String[] zido1 = new String[n];
        String[] zido2 = new String[n];
        
        String[] zido11 = new String[n];
        String[] zido22 = new String[n];
        
        String[] zido111 = new String[n];
        String[] zido222 = new String[n];
        
        for(int i = 0 ; i < zido11.length ; i++){
            zido11[i] = "";
        }
        for(int i = 0 ; i < zido11.length ; i++){
            zido22[i] = "";
        }
        for(int i = 0 ; i < zido11.length ; i++){
            zido1[i] = "";
        }
        for(int i = 0 ; i < zido11.length ; i++){
            zido2[i] = "";
        }
        
        
        for(int i = 0 ; i < n ; i++){
            zido111[i]=Integer.toBinaryString(arr1[i]);
            zido222[i]=Integer.toBinaryString(arr2[i]);
        }
        
        String str = "%"+"0"+String.valueOf(n)+"d";
        
        int cnt =0;
        for(int i = 0 ;  i < zido1.length ;i++){
            do{
                if(zido1[i].length() + zido111[i].length() < n){
                    zido1[i]+="0";
                }
                else{
                    zido1[i]+=zido111[i].charAt(cnt++)+"";
                }
            }while(zido1[i].length() != n);
            cnt=0;
        }
        
        cnt=0;
        
        for(int i = 0 ;  i < zido2.length ;i++){
            do{
                if(zido2[i].length() + zido222[i].length() < n){
                    zido2[i]+="0";
                }
                else{
                    zido2[i]+=zido222[i].charAt(cnt++)+"";
                }
            }while(zido2[i].length() != n);
            cnt=0;
        }
        
        System.out.println(Arrays.toString(zido1));
        System.out.println(Arrays.toString(zido2));

        
        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = 0 ; j < zido1[i].length() ; j++){
                if(zido1[i].charAt(j) == '1'){
                    zido11[i]+="#";
                }
                else{
                    zido11[i]+=" ";
                }
            }
            for(int j = 0 ; j < zido2[i].length() ; j++){
                if(zido2[i].charAt(j) == '1'){
                    zido22[i]+="#";
                }
                else{
                    zido22[i]+=" ";
                }
            }
        }
        
        System.out.println(Arrays.toString(zido11));
        System.out.println(Arrays.toString(zido22));
        
        String[] new_zido = new String[n];
        
        for(int i = 0 ; i < zido11.length ; i++){
            new_zido[i] = "";
        }
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < zido22[i].length() ; j++){
                if(zido11[i].charAt(j) == '#' || zido22[i].charAt(j) == '#'){
                    new_zido[i]+="#";
                }
                else{
                    new_zido[i]+=" ";
                }
            }
        }
        return new_zido;
    }
}