public class ReturnArray {

  public static void main(String[] args) {
    byte[] arrayByte = { 1, 2, 3, 4, 5, 6, 7, 8 };
    short[] arrayShort = { 10, 20, 30, 40, 50, 60, 70, 80 };
    int[] arrayInt = { 100, 200, 300, 400, 500, 600, 700, 800 };
    long[] arrayLong = { 1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000 };
    float[] arrayFloat = { 1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f };
    double[] arrayDouble = {
      10.10,
      20.20,
      30.30,
      40.40,
      50.50,
      60.60,
      70.70,
      80.80,
    };
    boolean[] arrayBoolean = { true, false };
    char[] arrayChar = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
    String[] arrayString = { "Imam", "Bagus", "Nugroho" };

    byte[] newArrayByte = returnByteArray(arrayByte);
    short[] newArrayShort = returnShortArray(arrayShort);
    int[] newArrayInt = returnIntegerArray(arrayInt);
    long[] newArrayLong = returnLongArray(arrayLong);
    float[] newArrayFloat = returnFloatArray(arrayFloat);
    double[] newArrayDouble = returnDobleArray(arrayDouble);
    boolean[] newArrayBoolean = returnBooleanArray(arrayBoolean);
    char[] newArrayChar = returnCharArray(arrayChar);
    String[] newArrayString = returnStringArray(arrayString);
  }

  public static byte[] returnByteArray(byte[] array) {
    byte[] result = new byte[8];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  public static short[] returnShortArray(short[] array) {
    short[] result = new short[8];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  public static int[] returnIntegerArray(int[] array) {
    int[] result = new int[8];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  public static long[] returnLongArray(long[] array) {
    long[] result = new long[8];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  public static float[] returnFloatArray(float[] array) {
    float[] result = new float[8];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  public static double[] returnDobleArray(double[] array) {
    double[] result = new double[8];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  public static boolean[] returnBooleanArray(boolean[] array) {
    boolean[] result = new boolean[2];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  public static char[] returnCharArray(char[] array) {
    char[] result = new char[8];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  public static String[] returnStringArray(String[] array) {
    String[] result = new String[3];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }
}
