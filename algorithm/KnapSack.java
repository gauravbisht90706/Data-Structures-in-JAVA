package algorithm;

import java.util.Scanner;

class KnapsackGreedy {
	public void Greedy(int num, int weight[], int value[], int capacity) {
		int cap = capacity;
		int i, j;
		int profit = 0;
		int extraprofit = 0;
		for (i = 0; i < num; i++) {
			if (weight[i] < cap) {
				cap = cap - weight[i];
				profit = profit + value[i];

			} else {
				extraprofit = cap / weight[i] * value[i];
				profit = profit + extraprofit;

			}

		}
		System.out.println("maximum profit is " + profit);

	}
}

class KnapSack {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of items");
		int num = s.nextInt();
		System.out.println("enter the weight of the items");
		int weight[] = new int[num];
		for (int i = 0; i < num; i++) {
			weight[i] = s.nextInt();

		}
		System.out.println("enter the value of the items");
		int value[] = new int[num];
		for (int i = 0; i < num; i++) {
			value[i] = s.nextInt();

		}

		System.out.println("enter the capacity of kanpsack");
		int capacity = s.nextInt();
		int ratio[] = new int[num];
		for (int i = 0; i < num; i++) {
			ratio[i] = value[i] / weight[i];
		}

		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (ratio[i] < ratio[j]) {
					int temp = ratio[j];
					ratio[j] = ratio[i];
					ratio[i] = temp;

					temp = weight[j];
					weight[j] = weight[i];
					weight[i] = temp;

					temp = value[j];
					value[j] = value[i];
					value[i] = temp;

				}

			}
		}

		KnapsackGreedy knap = new KnapsackGreedy();
		knap.Greedy(num, weight, value, capacity);
	}
}
