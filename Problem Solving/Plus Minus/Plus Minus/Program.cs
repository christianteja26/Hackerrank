using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Plus_Minus
{
	class Program
	{
		static void plusMinus(int[] arr)
		{
			int denominator = arr.GetLength(0);
			int positiveCount = 0;
			int negativeCount = 0;
			int zeroCount = 0;

			for (int i = 0; i < denominator; i++)
			{
				if (arr[i] == 0)
				{
					zeroCount++;
				}
				else if (arr[i] < 0)
				{
					negativeCount++;
				}
				else if (arr[i] > 0)
				{
					positiveCount++;
				}
			}

			Console.WriteLine((decimal)positiveCount / denominator);
			Console.WriteLine((decimal)negativeCount / denominator);
			Console.WriteLine((decimal)zeroCount / denominator);
		}

		static void Main(string[] args)
		{
			int n = Convert.ToInt32(Console.ReadLine());

			int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));

			plusMinus(arr);

			Console.ReadLine();
		}
	}
}
