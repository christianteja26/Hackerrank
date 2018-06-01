using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Simple_Array_Sum
{
	class Program
	{
		static int simpleArraySum(int[] ar)
		{
			int result = 0;
			foreach (var item in ar)
			{
				result += item;
			}
			return result;
		}

		static void Main(string[] args)
		{
			int arCount = Convert.ToInt32(Console.ReadLine());

			int[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt32(arTemp))
			;
			int result = simpleArraySum(ar);

			Console.WriteLine(result);

			Console.ReadLine();
		}
	}
}
