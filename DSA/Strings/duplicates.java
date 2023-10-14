import java.util.ArrayList;
import java.util.List;

 class FindDuplicatesInSorted {
    public static List<Integer> findDuplicates(List<Integer> sortedList) {
        List<Integer> duplicates = new ArrayList<>();
        
        for (int i = 1; i < sortedList.size(); i++) {
            if (!sortedList.get(i).equals(sortedList.get(i - 1))) {
                continue;
            }
            
            int current = sortedList.get(i);
            while (i < sortedList.size() && sortedList.get(i).equals(current)) {
                i++;
            }
            
            duplicates.add(current);
        }
        
        return duplicates;
    }

    public static void main(String[] args) {
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(2);
        sortedList.add(3);
        sortedList.add(3);
        sortedList.add(3);
        sortedList.add(4);
        sortedList.add(5);
        
        List<Integer> duplicateValues = findDuplicates(sortedList);
        
        System.out.println("Duplicates in the sorted list: " + duplicateValues);
    }
}
