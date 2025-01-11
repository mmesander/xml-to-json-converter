public class Notes {
    // Globaal
    // Het bestand wordt ingelezen en wordt naar een java object omgezet
    // Dat java object wordt omgezet van een input java object naar een output java object
    // Dat output java object wordt omgezegt naar een json string
    // Dit wordt getest via unit tests (even alle waardes checken AAA)

    // 1. Vooraf:
    // Uitzoeken welke libraries er nodig zijn:
    // -- Inlezen XML (zit niet meer inbegrepen bij SDK, twee dependencies nodig van jaxb), converteren van Java naar JSON (Jackson), unit testing (junit)
    // -- Structuur van het project opzetten (controllers?, dtos, exceptions?, helpers, services)

    // 2. Opzetten nieuw maven Project
    // Here we are =)

    // 3. Inlezen xml voorbeeld bestand naar java objecten
    // -- Gelijk maar even Lombok in de pom.xml toevoegen, als die een keer fatsoenlijk werkt tenminste =(
    // -- Zelf een XML bestand aanmaken
    // -- InputDto aanmaken (die het xml bestand kan inlezen?)

    // 4. Opzetten output java objecten
    // -- OutputDto aanmaken

    // 5. Converteren input objecten naar output java objecten
    // -- Helperfunctie copyProperties aanmaken
    // -- Service laag aanmaken met de transfer method daarin (1tje maar gezien er geen repo is)

    // 6. Converteren output naar json String
    // -- Methode in de service laag toevoegen om het output java object om te zetten naar een json string

    // 7. Unit tests schrijven zodra alles werkt!

    // 8. Controllers/Exceptions uitzoeken?
}
