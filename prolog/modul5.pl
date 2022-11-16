linearList([],[]).
linearList(H,[H]):- not(is_List(H)).
linearList([H|T],Z):- linearList(H,X),linearList(T,Y),append(X,Y,Z).

pindah(X,[],[],[X]).
pindah(X,[H|T],[H|T],[X]):- X\=H.
pindah(X,[X|T],Y,[X|T1]):- pindah(X,T,Y,T1).
subList([],[]).
subList([H|T],[H1|T1]):- pindah(H,T,X,H1), subList(X,T1).

ubah([],[]).
ubah([[X|Xt]|Y],[[N,X]|Z]:- length([X|Xt],N), ubah(Y,Z).
LengthSubList(X1,X2):- subList(X1,X), ubah(X,X2).

lengthToList([],[]).
lengthToList([[1,X]|Xt],[X|T]):- lengthToList(Xt,T).
lengthToList([[N,X]|Xt],[X|T]):- N>0, K is N-1,
    lengthToList([[K,X]|Xt],T).

