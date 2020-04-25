/**
View Problem Here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter15/e5-runningTotal
*/ 

public ArrayIntList runningTotal() {
    ArrayIntList result = new ArrayIntList(size);
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += elementData[i];
        result.add(sum);
    }
    return result;
}
