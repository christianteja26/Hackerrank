using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Diagonal_Difference
{
	class Program
	{
		static int diagonalDifference(int[][] a)
		{
			int primaryD = 0;
			int secondaryD = 0;
			int tempIndex = a.GetLength(0) - 1;
			for (int i = 0; i < a.GetLength(0); i++)
			{
				primaryD += a[i][i];
			}
			for (int i = 0; i < a.GetLength(0); i++)
			{
				secondaryD += a[i][tempIndex];
				tempIndex--;
			}

			return Math.Abs(primaryD - secondaryD);
		}

		static void Main(string[] args)
		{
			int n = Convert.ToInt32(Console.ReadLine());

			int[][] a = new int[n][];

			for (int aRowItr = 0; aRowItr < n; aRowItr++)
			{
				a[aRowItr] = Array.ConvertAll(Console.ReadLine().Split(' '), aTemp => Convert.ToInt32(aTemp));
			}

			int result = diagonalDifference(a);

			Console.WriteLine(result);

			Console.ReadLine();
		}
	}
}
