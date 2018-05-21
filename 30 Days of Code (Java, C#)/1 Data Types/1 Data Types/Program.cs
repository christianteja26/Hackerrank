using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1_Data_Types
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 4;
            double d = 4.0;
            string s = "HackerRank ";

            int inputI = Convert.ToInt32(Console.ReadLine());
            decimal inputD = Convert.ToDecimal(Console.ReadLine());
            string inputS = Console.ReadLine();

            Console.WriteLine(i + inputI);
            Console.WriteLine(Convert.ToDecimal(d) + inputD);
            Console.WriteLine(s + inputS);

            Console.ReadLine();
        }
    }
}
