# Enricher

## Funktionsweise der Anwendung

Die Anwendung nimmt eine HTTP POST Anfrage entgegen, diese Nachricht wird im Payload transportiert.
Zusätzlich zum Inhalt aus dem HTTP Request wird der Nachricht eine weiterer Inhalt hinzugefügt.
Das hinzufügen der Nachricht geschieht im Message Enricher.

Bei der Nachricht, die hinzugefügt wird handelt es sich um eine statische Nachricht, diese lautet "EnrichContent".
Der Inhalt des Payloads sowie der Inhalt der hinzugefügt wurde wird von einem Logger auf der Console ausgegeben.

## Betrieb/Test der Anwendung

Der ESB wurde mithilfe der XML Datei enricher.xml konfiguriert, die Anwendung kann in das AnyPoint Studio importiert und gestartet werden.

Eine Nachricht wird unter der [Adresse](http://localhost:8080/foo) entgegengenommen.
Die Nachricht sollte als HTTP POST im Body verschickt, das Format der Nachricht im Body kann beliebig sein.
Es wird im Payload der ESB Nachricht transportiert werden.







 

