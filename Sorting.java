package projek;


import java.util.List;

    public class Sorting {
        public void selectionSort(List<Student> students) {
            int n = students.size();
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (students.get(j).score < students.get(minIndex).score) {
                        minIndex = j;
                    }
                }
                
                Student temp = students.get(minIndex);
                students.set(minIndex, students.get(i));
                students.set(i, temp);
            }
    }

    public void bubbleSortDescending(List<Student> students) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).score < students.get(j + 1).score) {
                    
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }
}