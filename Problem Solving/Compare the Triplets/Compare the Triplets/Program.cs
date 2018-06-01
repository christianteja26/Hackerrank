using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compare_the_Triplets
{
	class Program
	{
		static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2)
		{
			int[] result = new int[2];
			int ascore = 0;
			int bscore = 0;

			if (a0 > b0)
			{
				ascore++;
			}
			else if (a0 < b0)
			{
				bscore++;
			}

			if (a1 > b1)
			{
				ascore++;
			}
			else if (a1 < b1)
			{
				bscore++;
			}

			if (a2 > b2)
			{
				ascore++;
			}
			else if (a2 < b2)
			{
				bscore++;
			}

			result.SetValue(ascore, 0);
			result.SetValue(bscore, 1);
			return result;
		}

		static void Main(string[] args)
		{
			string[] a0A1A2 = Console.ReadLine().Split(' ');

			int a0 = Convert.ToInt32(a0A1A2[0]);

			int a1 = Convert.ToInt32(a0A1A2[1]);

			int a2 = Convert.ToInt32(a0A1A2[2]);

			string[] b0B1B2 = Console.ReadLine().Split(' ');

			int b0 = Convert.ToInt32(b0B1B2[0]);

			int b1 = Convert.ToInt32(b0B1B2[1]);

			int b2 = Convert.ToInt32(b0B1B2[2]);

			int[] result = solve(a0, a1, a2, b0, b1, b2);

			Console.WriteLine(string.Join(" ", result));

			Console.ReadLine();
		}
	}
}
