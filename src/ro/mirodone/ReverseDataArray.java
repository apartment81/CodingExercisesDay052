package ro.mirodone;

import java.util.Arrays;

public class ReverseDataArray {

    public int[] DataReverse(int[] data) {

        // System.out.println("Before" + Arrays.toString(data));

        for (int i = 0; i < data.length / 2; i++) {
            int temp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = temp;
        }

        //System.out.println("After" +Arrays.toString(data));
        return data;

    }

    public int[][] splitInts(final int[] data, final int chunkSize) {
        final int length = data.length;
        final int[][] dest = new int[(length + chunkSize - 1) / chunkSize][];
        int destIndex = 0;
        int stopIndex = 0;

        for (int startIndex = 0; startIndex + chunkSize <= length; startIndex += chunkSize) {
            stopIndex += chunkSize;
            dest[destIndex++] = Arrays.copyOfRange(data, startIndex, stopIndex);
        }

        if (stopIndex < length)
            dest[destIndex] = Arrays.copyOfRange(data, stopIndex, length);


        return dest;
    }

}
