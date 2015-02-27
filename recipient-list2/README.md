# Recipient-List 2

## Funktionsweise der Anwendung
Die Anwendung nimmt eine HTTP POST Anfrage entgegen, der Inhalt der Nachricht wird verwendet um zu entscheiden, von welchen Loggern eine Nachricht ausgegeben werden soll.
Es können Nachrichten von mehreren Loggern ausgegeben werden.
Enthält das Array im Payload die Zahlen 1 und 2 so werden Nachrichten von den Loggern 1 und 2 ausgegeben.

## Betrieb/Test der Anwendung

Der ESB wurde mithilfe der XML Datei recipient-list2.xml konfiguriert, die Anwendung kann in das AnyPoint Studio importiert und gestartet werden.

Eine Nachricht wird unter der [Adresse](http://localhost:8080/foo) entgegengenommen.
Die Nachricht sollte als HTTP POST im Body verschickt:

["1","2","3","4"]

Auf der Console werden Nachrichten von Logger 1, Logger 2 und dem default Logger (2mal) ausgegeben.

