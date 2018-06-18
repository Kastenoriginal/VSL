package src.main.java.com.kastenoriginal.interviewVsl;

/**
 * Implementujte funkciu, ktora vypise na standardny vystup polozky vstupujucej matice
 * spiralovito so zaciatkom v lavom dolnom rohu,
 * pokracovanim v pravom dolnom rohu a postupne smerujuco do stredu.
 * <p>
 * Priklad vstupu:
 * 10  9  8 7
 * 11 16 15 6
 * 12 13 14 5
 * 1  2  3 4
 * <p>
 * Priklad vystupu:
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 */

public class Slimak0 {

    public static void vypis(String[][] matica) {
        int rowCount = matica.length;
        int colCount = 0;

        for (int i = 0; i < matica.length; i++) {
            if (colCount < matica[i].length) {
                colCount = matica[i].length;
            }
        }

        printMatrix(rowCount, colCount, matica);
    }

    private static void printMatrix(int rowCount, int colCount, String[][] matrix) {
//        int i;
        int lastRow = rowCount - 1;
        int firstRow = 0;
        int firstCol = 0;
        int lastCol = colCount - 1;

        while (lastRow >= firstRow && firstCol <= lastCol) {

            //print last row
            for (int i = 0; i <= lastCol; i++) {
                System.out.print(matrix[lastRow][i] + " ");
            }
            lastRow--;

            //print last col
            for (int i = lastRow; i >= firstRow; i--) {
                System.out.print(matrix[i][lastCol] + " ");
            }
            lastCol--;

            //print first row
            if (lastRow >= firstRow) {
                for (int i = lastCol; i >= firstCol; i--) {
                    System.out.print(matrix[firstRow][i] + " ");
                }
                firstRow++;
            }

            //print first col
            if (lastCol >= firstCol) {
                for (int i = firstRow; i < lastRow; i++) {
                    System.out.print(matrix[i][firstCol] + " ");
                }
                firstCol++;
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        String[][][] vstupy = {
                {
                        {"10", "9", "8", "7"},
                        {"11", "16", "15", "6"},
                        {"12", "13", "14", "5"},
                        {"1", "2", "3", "4"}
                },
                {
                        {"1"},
                        {"2"},
                        {"3"},
                        {"4"}
                },
                {
                        {"1", "2", "3", "4"}
                },
                {
                        {"A"}
                },
                {
                        {"12", "11", "10", "9", "8"},
                        {"13", "20", "19", "18", "7"},
                        {"14", "15", "16", "17", "6"},
                        {"1", "2", "3", "4", "5"}
                },
                {
                        {"11", "10", "9", "8", "7"},
                        {"12", "13", "14", "15", "6"},
                        {"1", "2", "3", "4", "5"}
                },
                {
                        {"12", "11", "10", "9", "8", "7"},
                        {"1", "2", "3", "4", "5", "6"}
                },
                {
                        {"G", "F", "E"},
                        {"H", "I", "D"},
                        {"A", "B", "C"}
                },
                {
                        {"I", "H", "G", "F"},
                        {"J", "K", "L", "E"},
                        {"A", "B", "C", "D"}
                },
                {
                        {"I", "H", "G"},
                        {"J", "O", "F"},
                        {"K", "N", "E"},
                        {"L", "M", "D"},
                        {"A", "B", "C"}
                }
        };

        for (int i = 0; i < vstupy.length; i++) {
            vypis(vstupy[i]);
        }
    }
}
