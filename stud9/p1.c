#include<stdio.h>
#include<windows.h>

#include<time.h>
#include<string.h>
#include<stdlib.h>
void Menu()
{
	printf("###################\n");
	printf("1.Guess   2.Quit\n");
	printf("###################\n");
	printf("��ѡ��");
}
void Game()
{
	printf("��Ϸ��ʼ!\n");
	srand((unsigned int)time(NULL));
	int data = rand() % 100 + 1;
	printf("����:�����ѡ��[1,100]֮������֣������������ܲ¶���\n");
	for (;;){
		printf("Guess:");
		int x = 0;
		scanf_s("%d", &x);
		if (x > data){
			printf("��´���!\n");
		}
		else if (x < data){
			printf("���С��!\n");
		}
		else{
			printf("��ϲ�㣬�¶���! %d\n", x);
			break;
		}
	}
	printf("��Ϸ����!\n");
}
int main()
{
	int quit = 0;
	while (!quit){
		Menu();
		int select = 0;
		scanf_s("%d", &select);
		switch (select){
		case 1:
			Game();
			printf("Ҫ��Ҫ����һ��?\n");
			break;
		case 2:
			quit = 1;
			printf("Game End!\n");
			break;
		default:
			printf("���������������������!\n");
			break;
		}
	}

}