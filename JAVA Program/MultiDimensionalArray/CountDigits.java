public class CountDigits{

  public static void main(String[] args) {
    int[] inputArray = {1, 2, 3, 2, 2};

    int[] counts = new int[inputArray.length];
    for (int i = 0; i < inputArray.length; i++) {
      counts[inputArray[i]]++;
    }

    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > 0) {
        System.out.println(i + " occurs " + counts[i] + " times");
      }
    }
  }
}