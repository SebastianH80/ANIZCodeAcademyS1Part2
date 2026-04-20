package Lesson30.UnitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DemigodTestSolution {

    // 1️⃣ assertEquals
    // Test af, om getName() returnerer præcis det navn, vi forventer.
    // assertEquals bruges til at sammenligne to værdier: forventet vs. faktisk.
    @Test
    void testGetName() {
        Demigod percy = new Demigod("Percy", "Poseidon", 16);
        // Vi forventer navnet "Percy", og assertEquals tjekker det.
        assertEquals("Percy", percy.getName());
    }

    // 1️⃣ assertEquals – tjek hytte for Thalia
    @Test
    void testCampCabinEquals() {
        Demigod thalia = new Demigod("Thalia", "Zeus", 15);
        assertEquals("Cabin 1", thalia.getCampCabin());
    }

    // 2️⃣ assertTrue
    // Test af, om isEligibleForQuest() returnerer true, når alder ≥ 12.
    // assertTrue tjekker, at den givne betingelse er sand.
    @Test
    void testIsEligibleForQuest_True() {
        Demigod annabeth = new Demigod("Annabeth", "Athena", 14);
        // Annabeth er 14 år, så hun skal være berettiget til quest → true
        assertTrue(annabeth.isEligibleForQuest());
    }

    // 2️⃣ assertTrue – alder ≥ 12 → eligible
    @Test
    void testEligibleForQuest_True() {
        Demigod nico = new Demigod("Nico", "Hades", 20);
        assertTrue(nico.isEligibleForQuest());
    }

    // 3️⃣ assertFalse
    // Test af, om isEligibleForQuest() returnerer false, når alder < 12.
    // assertFalse tjekker, at den givne betingelse er falsk.
    @Test
    void testIsEligibleForQuest_False() {
        Demigod nico = new Demigod("Nico", "Hades", 10);
        // Nico er kun 10 år, så han er for ung → false
        assertFalse(nico.isEligibleForQuest());
    }

    // 3️⃣ assertFalse – alder < 12 → not eligible
    @Test
    void testEligibleForQuest_False() {
        Demigod silena = new Demigod("Silena", "Aphrodite", 8);
        assertFalse(silena.isEligibleForQuest());
    }



    // 4️⃣ assertThrows
    // Test af, om constructoren kaster en fejl, når alderen er negativ.
    // assertThrows bruges til at tjekke, at koden kaster den forventede exception.
    @Test
    void testNegativeAgeThrowsException() {
        // Vi forventer, at IllegalArgumentException kastes
        assertThrows(IllegalArgumentException.class, () -> {
            new Demigod("Percy", "Poseidon", -1);
        });
    }

    // 4️⃣ assertThrows – navn må ikke være tom
    @Test
    void testEmptyNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Demigod("", "Athena", 15);
        });
    }

    // 5️⃣ assertNotNull
    // Test af, om getGodParent() returnerer et objekt, der ikke er null.
    // assertNotNull tjekker, at objektet eksisterer.
    @Test
    void testGodParentNotNull() {
        Demigod percy = new Demigod("Percy", "Poseidon", 16);
        // Gudeforælder skal altid være sat → ikke null
        assertNotNull(percy.getGodParent());
    }


}
