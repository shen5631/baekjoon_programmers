def solution(score):
    answer = []
    grade = []
    
    for i in range(len(score)):
        grade.append(1);
    
    for i in score:
        answer.append(i[0]+i[1])
    
    for i in range(len(answer)):
        for j in range(len(answer)):
            if answer[i]<answer[j]:
                grade[i] += 1
    return grade