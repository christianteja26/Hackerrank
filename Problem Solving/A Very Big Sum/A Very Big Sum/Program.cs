using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace A_Very_Big_Sum
{
	class Program
	{
		static long aVeryBigSum(int n, long[] ar)
		{
			long result = 0;
			foreach (var item in ar)
			{
				result += item;
			}
			return result;
		}

		static void Main(string[] args)
		{
			int n = Convert.ToInt32(Console.ReadLine());

			long[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt64(arTemp));
			long result = aVeryBigSum(n, ar);

			Console.WriteLine(result);

			Console.ReadLine();
		}
	}
}
