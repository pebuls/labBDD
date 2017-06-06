# language: pl
Funkcja: Informacja dla podróżnych o czasie przybycia do stacji docelowej
	W celu bardziej efektywnego planowania podróży
	Jako podróżny
	Chcę wiedzieć, o której godzinie dotrę do stacji docelowej

Szablon scenariusza: Szacowanie czasu przyjazdu 
	Zakładając chcę się dostać z "<from>" do "<dest>"
	I następny pociąg odjeżdża o <depH>:<depM> na linii "<line>"
	Gdy zapytam o godzinę przyjazdu
	Wtedy powinienem uzyskać następujący szacowany czas przyjazdu: <arrH>:<arrM>
		
	Przykłady:
		| from 		| dest 		| depH 	| depM 	| line 		| arrH 	| arrM 	|
    	| Paramatta | TownHall 	| 8 	| 2 	| Western 	| 8 	| 29 	|
    	| Epping 	| Central 	| 8 	| 3 	| Northern 	| 8 	| 48 	|
    	| Epping 	| Central 	| 8 	| 7 	| Newcastle | 8 	| 37 	|
    	| Epping 	| Central 	| 8 	| 13 	| Epping 	| 8 	| 51 	|