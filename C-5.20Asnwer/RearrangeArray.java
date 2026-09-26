public class RearrangeArray {
    public static void main(String[] args) {   
        Integer[] realNumbers = {10, 58, 29, 1, 2, 3, 4, 5, 6,7,13,19,22,46,100};
        Integer[] realNumbers2 = {1, 5, 9, 1, 2, 3, 4, 5, 6,7,13,19,22,46,1};
        arrangeEvensFirst(realNumbers);
        arrangeEvensFirst(realNumbers2);
        printArray(realNumbers);
        printArray(realNumbers2);
    }

    public static void arrangeEvensFirst(Integer[] numbers) {
        int leftIndex = 0;
        int rightIndex = numbers.length-1;
        arrangeEvensFirst(numbers, leftIndex, rightIndex);
    }
    
    private static void arrangeEvensFirst(Integer[] numbers, int leftIndex, int rightIndex) {
        if(leftIndex >= rightIndex) {
            return;
        }
        
        if(numbers[leftIndex] % 2 == 0) {
            arrangeEvensFirst(numbers, leftIndex+1, rightIndex);
        } else {
            if(numbers[rightIndex] % 2 == 0) {
                //Swap
                Integer temp = numbers[leftIndex];
                numbers[leftIndex] = numbers[rightIndex];
                numbers[rightIndex] = temp;
                arrangeEvensFirst(numbers, leftIndex+1, rightIndex-1);
            } else {
                // don't swap but decrease leftIndex
                arrangeEvensFirst(numbers, leftIndex, rightIndex-1);
            }
        }
    }

    private static void printArray(Integer[] array) {
        System.out.print("[");
        for (Integer integer : array) {
            System.out.print(integer);
            System.out.print(", ");
        }

        System.out.println("\b\b]");
    }
}
