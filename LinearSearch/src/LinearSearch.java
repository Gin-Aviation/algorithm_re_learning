public class LinearSearch {

    private LinearSearch() {
    }

    public static int search(int[] date, int target) {
        for (int i = 0; i < date.length; i++) {
            if (date[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] temp = {2, 34, 4, 5, 7, 9};
        System.out.println(LinearSearch.search(temp, 34));
    }
}
