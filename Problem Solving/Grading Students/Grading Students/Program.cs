using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Grading_Students
{
	class Program
	{
		static int[] gradingStudents(int[] grades)
		{
			for (int i = 0; i < grades.Length; i++)
			{
				if (grades[i] >= 38)
				{
					if (grades[i] % 5 != 0 && grades[i] % 5 > 2)
					{
						grades[i] = (5 - grades[i] % 5) + grades[i];
					}
				}
			}
			return grades;
		}

		static void Main(string[] args)
		{
			int n = Convert.ToInt32(Console.ReadLine());

			int[] grades = new int[n];

			for (int gradesItr = 0; gradesItr < n; gradesItr++)
			{
				int gradesItem = Convert.ToInt32(Console.ReadLine());
				grades[gradesItr] = gradesItem;
			}

			int[] result = gradingStudents(grades);

			Console.WriteLine(string.Join("\n", result));

			Console.ReadLine();
		}
	}
}
