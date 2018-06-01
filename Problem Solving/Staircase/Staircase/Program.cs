using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Staircase
{
	class Program
	{
		static void staircase(int n)
		{
			for (int i = n; i > 0; i--)
			{
				for (int j = 1; j < i; j++)
				{
					Console.Write(" ");
				}
				for (int k = i; k <= n; k++)
				{
					Console.Write("#");
				}
				Console.Write("\n");
			}
		}

		static void Main(string[] args)
		{
			int n = Convert.ToInt32(Console.ReadLine());

			staircase(n);

			Console.ReadLine();
		}
	}
}
