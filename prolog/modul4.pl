% Logika

and(A,B):- A,B.

or(A,_):- A, !.
or(_,B):- A, !.

xor(A,B):- A\=B.

equal(A,B):- A==B.
