using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Birthday_Cake_Candles
{
	class Program
	{
		static int birthdayCakeCandles(int n, int[] ar)
		{
			int maximumHeight = 0;

			foreach (var item in ar)
			{
				if (item > maximumHeight)
					maximumHeight = item;
			}

			int maxCount = ar.Where(r => r == maximumHeight).Count();

			return maxCount;
		}

		static void Main(string[] args)
		{
			int n = Convert.ToInt32(Console.ReadLine());

			int[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt32(arTemp));

			int result = birthdayCakeCandles(n, ar);

			Console.WriteLine(result);

			Console.ReadLine();
		}
	}
}
