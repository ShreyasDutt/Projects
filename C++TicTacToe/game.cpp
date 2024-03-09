#include <iostream>
using namespace std;
char game[3][3] = {{'1', '2', '3'},
                   {'4', '5', '6'},
                   {'7', '8', '9'}};
int choiceP1, choiceP2;
void display()
{
    system("cls");
    cout << "___________________T I C - T A C - T O E___________________\n"
         << endl;

    cout << "Player 1 [X]" << endl;
    cout << "Player 2 [0]" << endl;
    cout << endl;
    cout << "\t  " << game[0][0] << "  |  " << game[0][1] << "  |  " << game[0][2] << "  " << endl;
    cout << "    ----------------------------" << endl;
    cout << "\t  " << game[1][0] << "  |  " << game[1][1] << "  |  " << game[1][2] << "  " << endl;
    cout << "    ----------------------------" << endl;
    cout << "\t  " << game[2][0] << "  |  " << game[2][1] << "  |  " << game[2][2] << "  " << endl;
    cout << endl;
}
bool isCellOccupied(int row, int col)
{
    return (game[row][col] == 'X' || game[row][col] == '0');
}

void turn1()
{

    cout << "Enter your Choice P1 : ";
    cin >> choiceP1;

        switch (choiceP1)
    {
         if (choiceP1 < 1 || choiceP1 > 9 || isCellOccupied((choiceP1 - 1) / 3, (choiceP1 - 1) % 3))
    {
        cout << "Cell already filled." << endl;
        return;
    }
    case 1:
        game[0][0] = 'X';
        break;

    case 2:
        game[0][1] = 'X';
        break;

    case 3:
        game[0][2] = 'X';
        break;

    case 4:
        game[1][0] = 'X';
        break;

    case 5:
        game[1][1] = 'X';
        break;

    case 6:
        game[1][2] = 'X';
        break;
    case 7:
        game[2][0] = 'X';
        break;
    case 8:
        game[2][1] = 'X';
        break;
    case 9:
        game[2][2] = 'X';
        break;

    default:
        cout << "Invalid Input" << endl;
        break;
    }
}

void turn2()
{

    cout << "Enter your Choice P2 : ";
    cin >> choiceP2;

      if (choiceP2 < 1 || choiceP2 > 9 || isCellOccupied((choiceP2 - 1) / 3, (choiceP2 - 1) % 3))
    {
        cout << "Cell already filled." << endl;
        return;
    }

    switch (choiceP2)
    {
    case 1:
        game[0][0] = '0';
        break;

    case 2:
        game[0][1] = '0';
        break;

    case 3:
        game[0][2] = '0';
        break;

    case 4:
        game[1][0] = '0';
        break;

    case 5:
        game[1][1] = '0';
        break;

    case 6:
        game[1][2] = '0';
        break;
    case 7:
        game[2][0] = '0';
        break;
    case 8:
        game[2][1] = '0';
        break;
    case 9:
        game[2][2] = '0';
        break;

    default:
        cout << "Invalid Input" << endl;
        break;
    }
}

bool over()
{
    for (int i = 0; i < 3; i++)
    {
        if (game[i][0] == game[i][1] && game[i][1] == game[i][2])
        {
            return true;
        }
    }

    for (int i = 0; i < 3; i++)
    {
        if (game[0][i] == game[1][i] && game[1][i] == game[2][i])
        {
            return true;
        }
    }

    if ((game[0][0] == game[1][1] && game[1][1] == game[2][2]) ||
        (game[0][2] == game[1][1] && game[1][1] == game[2][0]))
    {
        return true;
    }

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (game[i][j] != 'X' && game[i][j] != '0')
            {
                return false;
            }
        }
    }

    return true;
}


int main()

{

    int n = 1;
    while (!over())
    {
        display();

        if (n % 2 == 0)
        {
            turn2();
        }
        else
        {
            turn1();
        }

        n++;
        display();
    }

    if (n % 2 == 0)
    {
        cout << "Player 1 (X) won!" << endl;
    }
    else
    {
        cout << "Player 2 (0) won!" << endl;
    }

    return 0;
}
