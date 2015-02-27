# Choice bzw. Router

## Funktionsweise der Anwendung

Die Anwendung nimmt eine HTTP POST Anfrage entgegen, aufgrund des Inhaltes im Body wird die Nachricht an einen Logger weitergeleitet und der Inhalt der Nachricht ausgegeben.

## Betrieb/Test der Anwendung

Der ESB wurde mithilfe der XML Datei choice.xml konfiguriert, die Anwendung kann in das AnyPoint Studio importiert und gestartet werden.

Eine Nachricht wird unter der [Adresse](http://localhost:8080/foo) entgegengenommen.
Die Nachricht sollte als HTTP POST im Body verschickt werden und folgendes Format einhalten:

1






 

