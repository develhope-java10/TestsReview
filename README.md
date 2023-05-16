# Esercizio 1
Scrivere test per i seguenti casi di input per il metodo getClassroomMarks(...):
- Uno degli Student in lista è null
- La lista è composta da un solo studente
- Uno degli Student in lista ha nome null
- Uno degli Student in lista ha id null

Evitare di modificare il codice del metodo, supporre la risposta che da in base all'implementazione corrente

# Esercizio 2
- Implementare una classe AverageMarksException che estende Exception. Utilizzarla in getClassroomMarks per segnalare il caso in cui uno degli studenti in lista abbiamo come attributo *averageMarks* un valore negativo. Coprire la modifica con dei test. 

# Esercizio 3
- Implementare una classe InvalidClassroomException che estende Exception e che ha un campo *message* di tipo String. Riferendosi ai casi limite proposti nell'esercizio 1 (es: il nome di uno degli studenti è null) modificare il metodo getClassroomMarks(...) per gestire esplicitamente questi casi. Aggiornare i test di conseguenza.
