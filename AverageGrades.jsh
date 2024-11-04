int[] average_grades(int grades[][], int weights[]) {
    int[] results = new int[grades.length];
    for (int student = 0; student < grades.length; student++) {
        int weightedSum = 0;
        for (int component = 0; component < weights.length; component++) {
            weightedSum += grades[student][component] * weights[component];
        }
        results[student] = weightedSum / 100;
    }
    
    return results;
}