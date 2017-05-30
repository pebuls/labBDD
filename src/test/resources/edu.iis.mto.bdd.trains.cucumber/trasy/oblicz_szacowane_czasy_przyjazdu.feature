# language: pl
Funkcja: Informacja dla podróżnych o czasie przybycia do stacji docelowej
	W celu bardziej efektywnego planowania podróży
	Jako podróżny
	Chcę wiedzieć, o której godzinie dotrę do stacji docelowej

Szablon scenariusza: Szacowanie czasu przyjazdu
	Zakładając chcę się dostać z "<startStation>" do "<stopStation>"
	I następny pociąg odjeżdża o <departureTime> na linii "<line>"
	Gdy zapytam o godzinę przyjazdu
	Wtedy powinienem uzyskać następujący szacowany czas przyjazdu: <estimationArrivalTime>

Przykłady:
| startStation | stopStation | departureTime | line | estimationArrivalTime |
| Epping | Central | 8:03 | Northern | 8:48 |
| Epping | Central | 8:07 | Newcastle | 8:37 |
| Epping | Central | 8:07 | Newcastle | 8:37 |
| Epping | Central | 8:13 | Epping | 8:51 |