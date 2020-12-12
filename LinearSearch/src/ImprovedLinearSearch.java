public class ImprovedLinearSearch {

    private ImprovedLinearSearch() {
    }

    public static <E> int search(E[] date, E target) {
        for (int i = 0; i < date.length; i++) {
            if (date[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {2, 34, 4, 5, 7, 9};
        long startTime = System.nanoTime();
        System.out.println(ImprovedLinearSearch.search(data, 34));
        long endTime = System.nanoTime();

        System.out.println((endTime - startTime)/1000000000.0
        );
    }
}
