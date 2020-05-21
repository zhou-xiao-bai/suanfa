package com.xiaobai.t2;

/**
 * @author 江湖人称白玉汤
 * @program 剑指Offer
 * @description 寻找二维数组中是否包含某值，每行的值递增，每列的值也递增
 * @create 2020-04-29 16:45
 **/
public class FindArraysNum {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 7;
        System.out.println(findNumFromArrays(matrix, target));
    }

    /**
     * rows为总行数，columns为总列数，
     *      从右上角判断，若大于目标数字，则--column，若小于目标数字，则++row，
     *      直到找到或row=rows-1，columns为0
     * @param matrix
     * @param target
     * @return result:boolean
     */
    public static boolean findNumFromArrays(int[][] matrix, int target) {
        if (matrix==null || matrix.length<=0) return false;
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0,column = columns-1;
        while (row<rows && column>0) {
            if (target==matrix[row][column]) return true;
            else if (target>matrix[row][column]) ++row;
            else --column;
        }
        return false;
    }
}
