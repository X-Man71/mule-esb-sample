# Aggregator 

## Funktionsweise der Anwendung

Die Anwendung fügt mehrere Nachrichten zu einer Nachricht zusammen.

Die Anwendung nimmt eine JSON Objekt als Nachricht entgegen. 
Das JSON Objekt wird in ein Java Objekt umgewandelt welches im Payload übertragen wird.
Um mehrere Nachrichten zu einer Zusammenzufügen ist es notwendig, zu wissen welche Nachrichten zusammengefügt werden sollen und wieviele Nachrichten (CorrelationGroupSize) zusammengefügt werden sollen.
Dies geschieht durch eine CorrelationID (MULE_CORRELATION_ID) alle Nachrichten, die die gleiche CorrelationID haben werden Zusammengefügt.

Im Collection Aggregator Element werden die Nachrichten zusammengefügt. 
Es wird im Aggregator 20 000ms gewartet bis zwei Nachricht ankommen, kommen diese Nachrichten schon vor dem Ablauf von 20sec an so werden diese schon früher Aggregiert und das Aggregat weitergeleitet.
Das Aggregat wird auf der Console ausgegeben und als HTTP Response zurückgeliefert.

## Betrieb/Test der Anwendung

Der ESB wurde mithilfe der XML Datei aggregator.xml konfiguriert, die Anwendung kann in das AnyPoint Studio importiert und gestartet werden.

Ein JSON Objekte wird unter der [Adresse](http://localhost:8080/foo) entgegengenommen.
Die JSON Nachricht sollte als HTTP POST im Body verschickt werden und folgendes Format einhalten:

Inhalt Nachricht 1:
{"correlationId":"1","count":"1"}

Inhalt Nachricht 2:
{"correlationId":"1","count":"2"}

Werden die Nachrichten innerhalb von 20sec an den ESB gesendet, werden diese Aggregiert.
Die Antwort hat folgendes Format:
[{"correlationId":"1","count":"1"},{"correlationId":"1","count":"2"}]

Count kann erhöht oder zufällig gewählt werden.
Count dient lediglich dazu die Anfragen nachzuverfolgen.








 

