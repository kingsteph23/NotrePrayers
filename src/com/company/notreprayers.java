package com.company;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.time.*;
public class notreprayers {
    public static void main(String[] args) {
        // title🇭🇷🇭🇷
         System.out.println("----------------------");
         System.out.println("Croatian Prayers\uD83C\uDDED\uD83C\uDDF7\uD83C\uDDED\uD83C\uDDF7");
         System.out.println("----------------------");

// outputs the current date and hour/minutes/seconds and the format for them as well
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/uuuu HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current time: " +
                "\n"+ dtf.format(now));

// array list of croatian prayers:
ArrayList<String>croatprayers = new ArrayList<>();
// sign of the cross(our father)
croatprayers.add("\"Znak Sv. -Oce Nas, koji jesi na Nebesima" +
        "\nSveti se ime Tvoje, Dodji Kraljevstvo Tvoje, budi volja Tvoja." +
        "\nKako na nebu, tako i na zemlji." +
        "\nKruh nas svagdanji daj nam danas i otpusti nama duge nase" +
        "\nkako i mi otpustamo duznicima nasim," +
        "\ni ne uvedi nas u napast nego izbavi nas od zla. Amen\"");
// hail mary
croatprayers.add("Zdravo Marijo\n" +
        "\"Milosti Puna, Gospodin stobom.\n" +
        "Blagoslovljena ti medju Zenama i\n" +
        "Blagoslovljen plod utrobe tvoje Isus.\n" +
        "Sveta Marijo, Majko Bozja, moli za nas grijesnike,\n" +
        "sada i na cas smrti nase. Amen\"");
// glory be
croatprayers.add("\"Slava Ocu, " +
        "\ni Sinu, i Duhu Svetomu." +
        "\nKako bijase na pocetku," +
        "\ntako i sada i vazda i u vijeke vjekova. Amen\"");

//fatima prayer
      croatprayers.add("\"Moj Isuse, oprosti nam naše grijehe, očuvaj nas od paklenoga ognja, " +
                "\ndovedi u raj sve duše, osobito one kojima je najveća potreba tvojega milosrdja.\"");

        // apostles creed
        croatprayers.add("\"Vjerujem u Boga, Oca svemogućega, Stvoritelja neba i zemlje." +
                "\nI u Isusa Krista, Sina njegova jedinoga, Gospodina našega, koji je začet po Duhu Svetom, rodjen od Marije Djevice, " +
                "\nmučen pod Poncijem Pilatom, raspet, umro i pokopan; " +
                "\nsašao nad pakao, treći dan uskrsnuo od mrtvih, uzašao na nebesa, " +
                "\nsjedi o desnu Boga Oca svemogućega; odonud će doći suditi žive i mrtve. " +
                "\nVjerujem u Duha Svetoga, svetu Crkvu kato­ličku, općinstvo svetih, " +
                "\noproštenje grijeha, uskrsnuće tijela, život vječni." +
                "\nAmen.\"");

        //final prayer:
        croatprayers.add("\"Boze, Tvoj nam je Sin Jedinac svojim zivotom, smrcu i uskrsnucem udijelio dobra vjecnoga spasenja. " +
                "\nNama, koji smo uz svetu krunicu Blazene Djevice Marije razmatrali ta otajstva, " +
                "\nudjeli da nasljedujemo sto ona sadrze i postignemo sto ona obecavaju. Po Kristu Gospodinu nasem.\"");

System.out.println();
        // generating random players
        int apex = (int)(Math.random() * croatprayers.size());
// outputing actual quotes
System.out.println("Prayer of the day\uD83C\uDDF7\uD83C\uDDED\uD83C\uDDF7\uD83C\uDDF7\uD83C\uDDED\uD83C\uDDF7: " +
        "\n" + croatprayers.get(apex));

    }
}
