package br.com.aust.sort.merge;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
	    int[] itens = {2,6,4,33,77,2,99,9,1,3,8,7,0};
		sort(itens);
		System.out.println(Arrays.toString(itens));
	}

    public static void sort(int[] itens) {
        int[] tmpArray = new int[itens.length];
		int left = 0;
		int right = itens.length - 1;
		mergeSort(itens, tmpArray, left, right);
    }

	private static void mergeSort(int[] itens, int[] tmpArray, int left, int right) {
		
		if(itens == null || itens.length == 0 || left >= right){
			return;
		}
		
		int midle = (left + right) / 2;
		
		mergeSort(itens, tmpArray, left, midle);
		mergeSort(itens, tmpArray, ++midle, right);
		
		merge(itens, tmpArray, left, midle, right);
	}

	private static void merge(int[] itens, int[] tmpArray, int left, int right, int subRight) {
		int subLeft = right - 1;
		int tmpIndex = left;
		
		while (left <= subLeft && right <= subRight){
			if (itens[left] < itens[right] ){
				tmpArray[tmpIndex++] = itens[left++];
			} else {
				tmpArray[tmpIndex++] = itens[right++];
			}
		}
		
		while (left <= subLeft) { // Copy rest of LEFT half
			tmpArray[tmpIndex++] = itens[left++];
		}
		while (right <= subRight) { // Copy rest of RIGHT half
			tmpArray[tmpIndex++] = itens[right++];
		}
		while(subRight >= 0){ // Copy TEMP back
			itens[subRight] = tmpArray[subRight--];
		}
	}
}
