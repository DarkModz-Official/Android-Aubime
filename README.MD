# Ausbildungsmesse 2021 / Android App Vorstellung
### Developed by Paul Rakutt und Sebastian Schindler
Diese Android Anwendung wurde innerhalb einer Woche entwickelt um an der Ausbildungsmesse in Hof an der Saale die Programmierung einer Android App dem End Nutzer näher zubringen. Wir haben diese App so entwickelt dass man auch einmal Beispielsweise die Farbe im Code ändern kann und es dann auch direkt im Emulator oder auf Wunsch auf dem eigenem Handy testen kann. Die Elemente sind leicht gehalten um Verwirrung oder zu starke Komplexität vorzubeugen. 


## Vorstellungsfunktion 1: 


```java
public void onClick(View v) {  //Bei Button Klick werden die Texte aktualisiert!
                if(mode[0]) {
                    if(reload[0]) {
                        reload[0] = false;
                        textView.setText(editText1.getText().toString());
                    } else {
                        reload[0] = true;
                        textView.setText(editText2.getText().toString());
                    }
                } else {
                    if(reload[0]) {
                        reload[0] = false;
                        textView.setText("Hello World!");  //Hier ist der erste Text welcher bearbeitet werden kann. 
                    } else {
                        reload[0] = true;
                        textView.setText("Ich bin Paul!");  //Hier ist der zweite Text welche bearbeitet werden kann. 
                    }
                }
            }
        });
```

--- 
## Vorstellungsfunktion 2: 
```java
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText(String.valueOf(rating));
                if(rating < 2) {
                    textView.setTextColor(Color.RED);  //bei weniger als 2 Sternen Textfarbe auf Rot setzen!
                } else
                if(rating < 3) {
                    textView.setTextColor(Color.YELLOW);  //bei weniger als 3 Sternen Textfarbe auf Gelb setzen!

                } else
                if(rating < 4) {
                    textView.setTextColor(Color.GREEN);  //bei weniger als 3 Sternen TextFarbe auf Grün setzen!
                }
            }
        });  //Eine Abfrage welche aufgrund der Bewertung die Farbe der Sterne ändert. 
```


## License
[MIT License](https://choosealicense.com/licenses/mit/)
