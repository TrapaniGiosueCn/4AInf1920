//Created by TrapaniGiosuè
#include <pthread.h>
#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include <stdlib.h>

//struct per condividere i dati
typedef struct
{
    pthread_mutex_t mutex; //semaforo
    int n_cas; //numero che deve inserire casualmente tra 1 e 20 oppure -1
    int n_produ; //contatore dei numeri da produrre che verrà inserito come parametro al run del main
    int n_util; //contatore dei numeri ancora utilizzabili
} Content;

//prototipi delle due funzioni del produttore e consumatore
void *prod(void *);
void *cons(void *);

//main
int main(int argc, char *argv[]){
    pthread_t prodUno, consUno, consDue, consTre; //variabili che servono a creare l'ambiente del produttore e dei tre consumatori
    Content content;

    if (argc != 2){
        printf("\nUSAGE: %s #n_prod \n", argv[0]);
        return -1;
    }

    //inizializzazione delle variabili della struttura
    content.n_produ = atoi(argv[1]); //convertiamo in intero il parametro che passiamo al run
    content.n_cas = -1; //Lo inizializziamo a -1 per far lavorare subito il produttore
    content.n_util = atoi(argv[1]); //inizialmente i numeri disponibili sono tutti
    srand(time(NULL));

    //Creazione del semaforo
    printf("\nSto creando il semaforo(mutex).\n");
    int contErr = pthread_mutex_init(&content.mutex, NULL);
    if (contErr != 0){ //controllo errore durante la creazione
        printf("\nErrore nella creazione del semaforo.\n");
        return -2;
    }
    printf("\nSemaforo creato.\n");

    //Creazione del produttore
    printf("\nSto creando il produttore.\n");
    contErr = pthread_create(&prodUno, NULL, prod, (void *)&content);
    if (contErr != 0){
        printf("\nErrore nel creare il produttore\n");
        return -3;
    }
    printf("\nProduttore creato\n");

    //Creazione del consumatore1
    printf("\nSto creando il primo consumatore.\n");
    contErr = pthread_create(&consUno, NULL, cons, (void *)&content);
    if (contErr != 0){
        printf("\nErrore nel creare il primo consumatore\n");
        return -3;
    }
    printf("\nPrimo consumatore creato\n");

    //Creazione del consumatore2
    printf("\nSto creando il secondo consumatore.\n");
    contErr = pthread_create(&consDue, NULL, cons, (void *)&content);
    if (contErr != 0){
        printf("\nErrore nel creare il secondo consumatore\n");
        return -3;
    }
    printf("\nSecondo consumatore creato\n");

    //Creazione del consumatore3
    printf("\nSto creando il terzo consumatore.\n");
    contErr = pthread_create(&consTre, NULL, cons, (void *)&content);
    if (contErr != 0){
        printf("\nErrore nel creare il terzo consumatore\n");
        return -3;
    }
    printf("\nTerzo consumatore creato\n");

    // Punatatori alle aree di memoria dei thread
    int *risConsUno;
    int *risConsDue;
    int *risConsTre;

    //Attendo la join dei thread
    printf("\nAttesa della fine dei thread\n");
    pthread_join(consUno, (void **)&risConsUno);
    pthread_join(consDue, (void **)&risConsDue);
    pthread_join(consTre, (void **)&risConsTre);
    pthread_join(prodUno, NULL);
    printf("\n----Fine-----\n");

    //classifica e vincitore
    printf("\nLa somma dei consumatori è %d\n", ((int)*risConsUno + (int)*risConsDue + (int)*risConsTre ));
    if(((int)*risConsUno >= (int)*risConsDue) && ((int)*risConsUno >= (int)*risConsTre) && ((int)*risConsDue >= (int)*risConsTre)){
        printf("\nHa vinto consumatore 1 con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsUno, (int)*risConsUno + 1, ((int)*risConsUno / (int)*risConsUno + 1));
        printf("\nIl consumatore 2 segue con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsDue, (int)*risConsDue + 1, ((int)*risConsDue / (int)*risConsDue + 1));
        printf("\nil consumatore 3 è ultimo con %d, e %d numeri mangiato e una media di %d.\n", (int)*risConsTre, (int)*risConsTre + 1, ((int)*risConsTre / (int)*risConsTre + 1));
    } else if(((int)*risConsUno >= (int)*risConsDue) && ((int)*risConsUno >= (int)*risConsTre) && ((int)*risConsTre >= (int)*risConsDue)){
        printf("\nHa vinto consumatore 1 con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsUno, (int)*risConsUno + 1, ((int)*risConsUno / (int)*risConsUno + 1));
        printf("\nIl consumatore 3 segue con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsTre, (int)*risConsTre + 1, ((int)*risConsTre / (int)*risConsTre + 1));
        printf("\nil consumatore 2 è ultimo con %d, e %d numeri mangiato e una media di %d.\n", (int)*risConsDue, (int)*risConsDue + 1, ((int)*risConsDue / (int)*risConsDue + 1));
    } else if(((int)*risConsDue >= (int)*risConsUno) && ((int)*risConsDue >= (int)*risConsTre) && ((int)*risConsUno >= (int)*risConsTre)){
        printf("\nHa vinto consumatore 2 con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsDue, (int)*risConsDue + 1, ((int)*risConsDue / (int)*risConsDue + 1));
        printf("\nIl consumatore 1 segue con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsUno, (int)*risConsUno + 1, ((int)*risConsUno / (int)*risConsUno + 1));
        printf("\nil consumatore 3 è ultimo con %d, e %d numeri mangiato e una media di %d.\n", (int)*risConsTre, (int)*risConsTre + 1, ((int)*risConsTre / (int)*risConsTre + 1));
    } else if(((int)*risConsDue >= (int)*risConsUno) && ((int)*risConsDue >= (int)*risConsTre) && ((int)*risConsTre >= (int)*risConsUno)){
        printf("\nHa vinto consumatore 2 con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsDue, (int)*risConsDue + 1, ((int)*risConsDue / (int)*risConsDue + 1));
        printf("\nIl consumatore 3 segue con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsTre, (int)*risConsTre + 1, ((int)*risConsTre / (int)*risConsTre + 1));
        printf("\nil consumatore 1 è ultimo con %d, e %d numeri mangiato e una media di %d.\n", (int)*risConsUno, (int)*risConsUno + 1, ((int)*risConsUno / (int)*risConsUno + 1));
    } else if(((int)*risConsTre >= (int)*risConsUno) && ((int)*risConsTre >= (int)*risConsDue) && ((int)*risConsUno >= (int)*risConsDue)){
        printf("\nHa vinto consumatore 3 con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsTre, (int)*risConsTre + 1, ((int)*risConsTre / (int)*risConsTre + 1));
        printf("\nIl consumatore 1 segue con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsUno, (int)*risConsUno + 1, ((int)*risConsUno / (int)*risConsUno + 1));
        printf("\nil consumatore 2 è ultimo con %d, e %d numeri mangiato e una media di %d.\n", (int)*risConsDue, (int)*risConsDue + 1, ((int)*risConsDue / (int)*risConsDue + 1));
    } else if(((int)*risConsTre >= (int)*risConsUno) && ((int)*risConsTre >= (int)*risConsDue) && ((int)*risConsDue >= (int)*risConsUno)){
        printf("\nHa vinto consumatore 3 con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsTre, (int)*risConsTre + 1, ((int)*risConsTre / (int)*risConsTre + 1));
        printf("\nIl consumatore 2 segue con %d, e %d numeri mangiati e una media di %d.\n", (int)*risConsDue, (int)*risConsDue + 1, ((int)*risConsDue / (int)*risConsDue + 1));
        printf("\nil consumatore 1 è ultimo con %d, e %d numeri mangiato e una media di %d.\n", (int)*risConsUno, (int)*risConsUno + 1, ((int)*risConsUno / (int)*risConsUno + 1));
    }

    //distruzione dl mutex
    printf("\nDistruzione del mutex\n");
    contErr = pthread_mutex_destroy(&content.mutex);
    if(contErr != 0){
        printf("\nErrore durante la distruzione del mutex\n");
        return -5;
    }

    return 0;
}

void *prod(void *p){
    Content *content = (Content *)p;
    int totale = 0; //inizializzazione della variabile di somma dei numeri random

    //Ciclo incrementato in modo condizionale
    for(int i=0; i < content->n_produ;){
        printf("\nSto per bloccare il semaforo\n");
        pthread_mutex_lock(&content->mutex); //accesso alla zona critica
        printf("\nSono nella sezione critica\n");
        //Se troviamo -1 allora crea un intero casuale tra 1 e 20
        if(content->n_cas == -1){
            content->n_cas = rand() % 20 + 1;
            totale += content->n_cas;
            i++;
            printf("\nNumero prodotto %d.\n", content->n_cas);
        }
        pthread_mutex_unlock(&content->mutex);
        printf("Semaforo sbloccato");
    }
    printf("Il totale prodotto è %d.", totale);
    return NULL;
}

void *cons(void *p){
    Content *content = (Content *)p;
    int *risultato = (int *)malloc(2 * sizeof(int)); //allocazione della variabile per contenere i valori del risultato

    //Ciclo ad incremento condizionale che controlla se ci sono ancora numeri da mangiare
    for(int i = 0; i < content->n_produ && content->n_util;){
        printf("\nSto bloccando il semaforo\n");
        pthread_mutex_lock(&content->mutex);//accesso alla zona critica
        printf("\nSono nella sezione critica\n");
        //se non c'è -1 vuol dire che può consumare
        if(content->n_cas != -1){
            *risultato += content->n_cas;
            *(risultato + 1) += 1;
            printf("Numero consumato %d.", content->n_cas);
            content->n_util = content->n_util - 1;
            content->n_cas = -1;
            i++;
        }
        pthread_mutex_unlock(&content->mutex);
        printf("Semaforo sbloccato");
    }
    printf("Il totale consumato è %d.", *risultato);
    pthread_exit(risultato);
}