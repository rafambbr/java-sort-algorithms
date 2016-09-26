package br.com.aust.sort.quick;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int itens[] = {2,6,4,9,1,3,8,7,0};
		sort(itens);
		System.out.println(Arrays.toString(itens));
	}

    public static void sort(int[] itens) {
        int left = 0;
		int right = itens.length-1;
		
		quickSort(itens, left, right);
    }
	
	public static void quickSort(int itens[], int left, int right){
		
		//validade
		if(itens == null || itens.length == 0 || left == right){
			return;
		}
		
		int midle = left + (right - left) / 2;
		int pivot = itens[midle];
		
		int subLeft = left;
		int subRight = right;
		
		while(subLeft <= subRight){
			
			while(itens[subLeft] < pivot){
				subLeft++;
			}
			while(itens[subRight] > pivot){
				subRight--;
			}
			
			if(subLeft <= subRight){
				int tmp = itens[subLeft];
				itens[subLeft] = itens[subRight];
				itens[subRight] = tmp;
				
				subLeft++;
				subRight--;
			}
		}
		
		if( left < subRight){
			quickSort(itens, left, subRight);
		}
		
		if( subLeft < right){
			quickSort(itens, subLeft, right);
		}
		
	}
}
