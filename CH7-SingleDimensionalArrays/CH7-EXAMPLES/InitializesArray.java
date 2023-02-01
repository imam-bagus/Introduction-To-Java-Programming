public class InitializesArray {

    public static void main(String[] args) {
        byte[] arrByte1 = new byte[3];
        byte arrByte2[] = new byte[5];

        arrByte1[0] = 1;
        arrByte1[1] = 2;
        arrByte1[2] = 3;

        arrByte2[0] = 5;
        arrByte2[1] = 4;
        // arrByte2[2]; numeric default value is 0
        arrByte2[3] = 2;
        arrByte2[4] = 1;

        short[] arrShort1 = new short[1];
        short arrShort2[] = new short[1];

        int[] arrInt1 = new int[1];
        int arrInt2[] = new int[1];

        long[] arrLong1 = new long[1];
        long arrLong2[] = new long[1];

        float[] arrFloat1 = new float[1];
        float arrFloat2[] = new float[1];

        double[] arrDouble1 = new double[1];
        double arrDouble2[] = new double[1];

        char[] arrChar1 = new char[1]; // char default value is \u0000
        char arrChar2[] = new char[1];

        boolean[] arrBoolean1 = new boolean[1]; // boolean default value is false
        boolean arrBoolean2[] = new boolean[1];

    }

}
