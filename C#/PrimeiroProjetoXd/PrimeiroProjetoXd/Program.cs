using System;

namespace PrimeiroProjetoXd
{
    internal class Program
    {
        static void ExibirMatriz(int[,] matriz)
        {
            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    Console.Write(matriz[i, j] + " ");
                }
                Console.WriteLine();
            }
        }

        static void Main(string[] args)
        {
            int[,] matriz = new int[10, 10];
            Random random = new Random();
            int x = random.Next(0, matriz.GetLength(0));
            int y = random.Next(0, matriz.GetLength(1));
            matriz[x, y] = 1;

            int xEscondido = random.Next(0, matriz.GetLength(0));
            int yEscondido = random.Next(0, matriz.GetLength(1));
            while (true)
            {
                Console.Clear();
                ExibirMatriz(matriz);
                matriz[x, y] = 0;

                ConsoleKeyInfo tecla = Console.ReadKey();
                switch (tecla.Key)
                {
                    case ConsoleKey.W:
                        if (x > 0)
                            x--;
                        break;
                    case ConsoleKey.A:
                        if (y > 0)
                            y--;
                        break;
                    case ConsoleKey.S:
                        if (x < matriz.GetLength(0) - 1)
                            x++;
                        break;
                    case ConsoleKey.D:
                        if (y < matriz.GetLength(1) - 1)
                            y++;
                        break;
                }

                matriz[x, y] = 1;
                if (x == xEscondido && y == yEscondido)
                    break;
            }
            Console.WriteLine("\nPARABÉNS VOCE VENCEU");

        }
    }
}
