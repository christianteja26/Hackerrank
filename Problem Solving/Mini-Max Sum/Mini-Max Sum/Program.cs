using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mini_Max_Sum
{
	class Program
	{
		static void miniMaxSum(int[] arr)
		{
			var sumOfAllNumbers = 0L;
			var minimum = long.MaxValue;
			var maximum = 0L;

			for (int i = 0; i < 5; i++)
			{
				sumOfAllNumbers += arr[i];
				if (arr[i] < minimum)
					minimum = arr[i];

				if (arr[i] > maximum)
					maximum = arr[i];
			}

			Console.WriteLine((sumOfAllNumbers - maximum) + " " + (sumOfAllNumbers - minimum));
		}

		static void Main(string[] args)
		{
			int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));

			miniMaxSum(arr);

			Console.ReadLine();
		}
	}
}
