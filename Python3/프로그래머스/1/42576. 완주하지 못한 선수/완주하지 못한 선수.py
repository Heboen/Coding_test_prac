def solution(participant, completion):
    answer = ''
    person = dict()
    for i in participant:
        person[i] = person.get(i,0) + 1
    for i in completion:
        person[i] -= 1
    for i in person:
        if person[i] != 0:
            return i