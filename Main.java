public class Main {
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index if key is found
            }
        }
        return -1; // Return -1 if key is not found
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java LinearSearch <array_size> <key> <array_elements>");
            return;
        }

        int n = Integer.parseInt(args[0]); // Size of the array
        int key = Integer.parseInt(args[1]); // Key to be searched
        int[] arr = new int[n]; // Array to be searched

        // Parse the remaining arguments as array elements
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(args[i + 2]);
        }

        // Perform linear search
        int index = search(arr, key);

        // Print result
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
