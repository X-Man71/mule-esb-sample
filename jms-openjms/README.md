# JMS

## Funktionsweise der Anwendung

Die Anwendung nimmt eine JSON Objekt entgegen, bildet dies auf eine Java Objekt ab und sendet dieses an OpenJMS.

## Betrieb/Test der Anwendung

Achtung die Java Bibliotheken aus dem lib Ordner müssen in den Classpath aufgenommen werden.
Der ESB wurde mithilfe der XML Datei src/main/app/openjms.xml konfiguriert.
IP Adresse für den JMS Endoint muss möglicherweise geändert werden.

Ein JSON Objekte wird unter der [Adresse](http://localhost:8080/foo) entgegengenommen.
Die JSON Nachricht sollte als HTTP POST im Body verschickt werden und folgendes Format einhalten:

{ "requestId":"1", "amount":"1000.00", "term":"12", "consumerRate":"c" }

Dadurch kann das JSON Objekt auf das Java Objekt jms.model.ARequest abgebildet werden und wird an das JMS geschickt.
Nachricht sollte auf der UI der Bank (http://{Bank-IP}:8080/jmsBankA/) angezeigt werden.
Bank A antwortet automatisch, der ESB gibt die Antwort auf der Console aus.




 

