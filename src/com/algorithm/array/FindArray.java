package com.algorithm.array;

public class FindArray {

	public static void main(String[] args) {
		// int result = halfFind(array, 0, 3, -1);

		int array[] = { 2, 3, 1 };
		// int resultArray [] = bubbleSort(array);
		// choiceSort(array);
		insertSort(array);
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();

	}

	/**
	 * 二分查找
	 * 
	 * @param array
	 *            ：从小到大排序
	 * @param value
	 * @return
	 */
	public static int halfFind(int array[], int low, int hight, int value) {

		if (null == array || low > hight || low < 0 || hight > array.length)
			return -1;

		int middle = (hight + low) / 2;
		if (array[middle] == value)
			return middle;
		else if (array[middle] > value) {
			hight = middle - 1;
		} else {
			low = middle + 1;
		}
		return halfFind(array, low, hight, value);
	}

	/**
	 * 冒泡排序
	 * 
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort(int array[]) {

		if (null == array) {
			return null;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}

	/**
	 * @param array
	 * @return 从小到大的排序数组
	 */
	public static int choiceSort(int array[]) {

		if (null == array || array.length <= 1) {
			return 0;
		}

		for (int j = 0; j < array.length; j++) {
			int minIndex = j;
			for (int i = j + 1; i < array.length; i++) {
				if (array[minIndex] > array[i]) {
					minIndex = i;
				}
			}
			if (minIndex != j) {
				int temp = array[minIndex];
				array[minIndex] = array[j];
				array[j] = temp;
			}
		}

		return 1;
	}

	/**
	 * 插入排序
	 * 
	 * @param array
	 * @return
	 */
	public static void insertSort(int array[]) {
		if (null == array || array.length <= 1)
			return ;
		int i, j;
		int n = array.length;
		int target;

		// 假定第一个元素被放到了正确的位置上
		// 这样，仅需遍历1 - n-1
		for (i = 1; i < n; i++) {
			j = i;
			target = array[i];

			while (j > 0 && target < array[j - 1]) {
				array[j] = array[j - 1];
				j--;
			}

			array[j] = target;
		}
	}

}
