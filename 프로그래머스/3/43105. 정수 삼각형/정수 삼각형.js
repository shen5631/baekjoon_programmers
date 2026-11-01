function solution(triangle) {
    let end = triangle.length-1;
    let max = new Array(triangle[end].length).fill(0);
    for(let i = end ; i >= 0 ; i--){
        max = [];
        for(let j = 0 ; j < triangle[i].length-1 ; j++){
            if(triangle[i][j] >= triangle[i][j+1]) max[j]=triangle[i][j];
            else max[j]=triangle[i][j+1];
            triangle[i-1][j]+=max[j];
        }

    }
    
    return triangle[0][0];
}