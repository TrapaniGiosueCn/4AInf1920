//created by TrapaniGiosuè
//libreria pthread per lavoraree con i thread in c
#include <pthread.h>
#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include <stdlib.h>

//funzione sommatore dei thread
void *sommatore_thread(void *);

//structure dei due int riguardante i due valori da sommare: Sommatore
typedef struct
{
    int som1;
    int som2;
} Sommatore;

int main(int argc, char const *argv[])
{
    if (argc != 3)
    {
        printf("USAGE: %s som#1 som#2", argv[0]);
        return -1;
    }

    //dichiarazione sommatore
    Sommatore sommatore;

    //inizializzazione di som1 e som2
    sommatore.som1 = atoi(*(argv + 1));
    sommatore.som2 = atoi(*(argv + 2));

    //dichiarazione della variabile pthraed_id di tipo pthraed_t
    pthread_t pthread_id;

    printf("Creando l'ambiente : %d e %d\n", getpid(), sommatore.som1, sommatore.som2);

    //dichiarazione della variabile nel caso la creazione dell'ambiente non riuscisse ad essere fatta
    int err= pthread_create(&pthread_id, NULL, sommatore_thread, (void *)&sommatore);

    if (err)
    {
        printf("%d - Creazione dell'ambiente fallita\n", getpid());
        return -1;
    }

    int *risultato;
    pthread_join(pthread_id, (void **)&risulatto);
    printf("%d - Somma tra %d e %d = %d\n", getpid(), sommatore.som1, sommatore.som2, (int)*risultato);

    free(risultato);

    printf("%d - Fine del processo thread\n", getpid());
    return 0;
}


void *sommatore_thread(void *var)
{
    Sommatore *sommatore = (Sommatore *)var;
    int *var_ris = (int *)malloc(sizeof(int));
    *var_ris = sommatore->som1 + sommatore->som2;
    printf("Somma tra %d e %d. Risultato = %d\n", sommatore->som1, sommatore->som2, *var_ris);

    pthread_exit(var_ris);
}
