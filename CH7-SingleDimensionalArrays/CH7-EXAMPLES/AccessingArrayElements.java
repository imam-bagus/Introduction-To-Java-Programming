public class AccessingArrayElements {
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
        System.out.println("array byte 1 index 0 : " + arrByte1[0]);
        System.out.println("array byte 1 index 1 : " + arrByte1[1]);
        System.out.println("array byte 1 index 2 : " + arrByte1[2]);
        System.out.println("array byte 2 index 0 : " + arrByte2[0]);
        System.out.println("array byte 2 index 1 : " + arrByte2[1]);
        System.out.println("array byte 2 index 2 : " + arrByte2[2]);
        System.out.println("array byte 2 index 3 : " + arrByte2[3]);
        System.out.println("array byte 2 index 4 : " + arrByte2[4]);

        short[] arrShort1 = new short[1];
        short arrShort2[] = new short[1];
        arrShort1[0] = 8;
        arrShort2[0] = 10;
        System.out.println("array short 1 index 0 : " + arrShort1[0]);
        System.out.println("array short 2 index 0 : " + arrShort2[0]);

        int[] arrInt1 = new int[1];
        int arrInt2[] = new int[1];
        arrInt1[0] = 100;
        System.out.println("array int 1 index 0 : " + arrInt1[0]);
        System.out.println("array int 2 index 0 : " + arrInt2[0]);

        long[] arrLong1 = new long[1];
        long arrLong2[] = new long[1];
        arrLong1[0] = 1000;
        System.out.println("array long 1 index 0 : " + arrLong1[0]);
        System.out.println("array long 2 index 0 : " + arrLong2[0]);

        float[] arrFloat1 = new float[1];
        float arrFloat2[] = new float[1];
        arrFloat1[0] = 1.0f;
        System.out.println("array float 1 index 0 : " + arrFloat1[0]);
        System.out.println("array float 2 index 0 : " + arrFloat2[0]);

        double[] arrDouble1 = new double[1];
        double arrDouble2[] = new double[1];
        arrDouble1[0] = 11.1111d;
        System.out.println("array double 1 index 0 : " + arrDouble1[0]);
        System.out.println("array double 2 index 0 : " + arrDouble2[0]);

        char[] arrChar1 = new char[1];
        char arrChar2[] = new char[1]; // char default value is \u0000
        arrChar1[0] = 'A';
        System.out.println("array char 1 index 0 : " + arrChar1[0]);
        System.out.println("array char 2 index 0 : " + arrChar2[0]);

        boolean[] arrBoolean1 = new boolean[1];
        boolean arrBoolean2[] = new boolean[1]; // boolean default value is false
        arrBoolean1[0] = true;
        System.out.println("array boolean 1 index 0 : " + arrBoolean1[0]);
        System.out.println("array boolean 2 index 0 : " + arrBoolean2[0]);
    }
}
