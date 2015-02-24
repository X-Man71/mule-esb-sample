# SOAP 

## Funktionsweise der Anwendung

Die Anwendung nimmt ein JSON Objekt entgegen und ruft mit den im JSON Objekt enthaltenen Daten einen SOAP Webservice auf.
Der SOAP Webservice wird mit der gewünschten Laufzeit des Kredits aufgerufen, mit der Höhe des Kredits sowie mit der Bewertung des Kunden.

## Betrieb/Test der Anwendung

Die Konfiguration des ESB befindet sich in src/main/app/soap.xml und kann im AnyPoint Studio gestartet werden.

Ein JSON Objekte wird unter der [Adresse](http://localhost:8181/foo) entgegengenommen.
Die JSON Nachricht sollte als HTTP POST im Body verschickt werden und folgendes Format einhalten:

{ "amount":1000, "term":12, "quoteRate":"a" }

Das JSON Objekt wird auf die Klasse json.LoanRequest abgebildet.
Durch die Komponente Set Payload wird die Nachricht in das für den SOAP Aufruf korrekte Format gebracht.
Die durch den SOAP Aufruf zurückgelieferten Daten werden auf der Console ausgegeben.

