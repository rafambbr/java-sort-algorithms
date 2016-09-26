package br.com.aust.sort.bubble;

import static org.junit.Assert.*;
import org.junit.Test;

import br.com.aust.sort.bublle.BubbleSort;

public class BubbleSortTest {

    @Test
    public void sortItens() {

        int itens[] = { 99, 2, 6, 4, 22, 9, 1, 44, 2, 3, 8, 7, 0, 101 };

        BubbleSort.sort(itens);

        assertEquals(0, itens[0]);
        assertEquals(1, itens[1]);
        assertEquals(2, itens[2]);
        assertEquals(2, itens[3]);
        assertEquals(3, itens[4]);
        assertEquals(4, itens[5]);
        assertEquals(6, itens[6]);
        assertEquals(7, itens[7]);
        assertEquals(8, itens[8]);
        assertEquals(9, itens[9]);
        assertEquals(22, itens[10]);
        assertEquals(44, itens[11]);
        assertEquals(99, itens[12]);
        assertEquals(101, itens[13]);

    }
}
