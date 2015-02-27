# Recipient-List

## Funktionsweise der Anwendung
Die Anwendung nimmt eine HTTP POST Anfrage entgegen, die JSON Nachricht wird in ein Java Objekt umgewandelt.
Aufgrund der Choice Variable des Java Objektes wird entschieden, an welchen Logger die Nachricht gesendet wird.

## Betrieb/Test der Anwendung

Der ESB wurde mithilfe der XML Datei recipient-list.xml konfiguriert, die Anwendung kann in das AnyPoint Studio importiert und gestartet werden.

Eine Nachricht wird unter der [Adresse](http://localhost:8080/foo) entgegengenommen.
Die Nachricht sollte als HTTP POST im Body verschickt:

Nachricht welche an Logger 1 weitergeleitet wird:
{ "choice":"1" }

Nachricht welche an Logger 2 weitergeleitet wird:
{ "choice":"2" }

