using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Time_Conversion
{
	class Program
	{
		static string timeConversion(string s)
		{
			DateTime currDate = DateTime.Parse(s);
			return currDate.ToString("HH:mm:ss");
		}

		static void Main(string[] args)
		{
			string s = Console.ReadLine();

			string result = timeConversion(s);

			Console.WriteLine(result);

			Console.ReadLine();
		}
	}
}
