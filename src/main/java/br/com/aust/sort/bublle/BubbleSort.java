package br.com.aust.sort.bublle;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int itens[] = {2,6,4,9,1,3,8,7,0};
		sort(itens);
		System.out.println(Arrays.toString(itens));
	}

    public static void sort(int[] itens) {
        for (int index= 0; index < itens.length; index++) {
			for (int subIndex = index; subIndex < itens.length; subIndex++) {
				if(itens[index] > itens[subIndex]){
					int tmp = itens[index];
					itens[index] = itens[subIndex];
					itens[subIndex] = tmp;
				}
			}
		}
    }
}
