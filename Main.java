public class Main {
  public static int countChars(String name) {
    int count = 0;
    for (int i = 0; i < name.length(); i++) {
      char c = name.charAt(i);
      if (c == 'C' || c == 'L' || c == 'O' || c == 'F' || c == 'U' || c == 'S') {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    String name = "Kiruthika";
    int charCount = countChars(name);
    System.out.println("Number of occurrences of CLOFUS in " + name + ": " + charCount);
  }
}