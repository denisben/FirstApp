package com.example.ben.application;

public class QuestionLibrary6 {

    private String mQuestions [] = {
            "Τα μειωνεκτήματα των πινάκων είναι: ",
            "Ποιά είναι τα χαρακτηριστικά ενός μονοδιάστατου πίνακα",
            "Η χρήση πινάκων σε ένα πρόγραμμα είναι απαραίτητη: ",
            "Ορισμένες από τις τυπικές επεξεργασίες πινάκων είναι:",
            "Οι δύο διαδεδομένοι αλγόριθμοι αναζήτησης στοιχείων πινάκων είναι: ",
            "Ποιο το περιεχόμενο που έχουν τα στοιχεία ενος πίνακα που δεν έχουν δηλωθεί η εκχωρηθεί ακόμα",
            "Τι κάνει η συγκεκριμένη εντολή",
            "Τι γίνεται στο παραπάνω πρόγραμμα",
            "Ποιο το αποτέλεσμα που εμφανίζει το πρόγραμμα",
            "Τι τιμές μπορεί να έχει στο τέλος του προγράμματος το Κ,Λ ",
            "Ποιά είναι τα χαρακτηριστικά ενός δισδιάστατου πίνακα",
            "Ποιές οι τιμές που θα καταχωρηθούν στον πίνακα Β για τις θέσεις Β[1], Β[4], Β[9]"



    };

    private String mChoices [][] = {

            {"Η απαίτηση μνήμης και ο περιορισμός δυνατοτήτων του προγράματος", "Η δυσκολία ανάγνωσης του προγράμματος", "διαχείριση πολλαπλών τύπων και η απαγόρευση χρήσης δεικτών", "Ολα τα παραπάνω"},
            {"Αρχή, τύπος δεδομένων, τέλος", "Ονομα, μέγεθος, τύπος δεδομένων", "Γραμή, στήλη, βάθος", "Τύπος δεδομένων και τύπος μεταβλητών"},
            {"Πάντα", "Οταν υπάρχει διαθέσιμη μνήμη", "Οταν δεν χρησιμοποιούμε δείκτες", "Οταν θέλουμε να κρατήσουμε στην μνήμη κάποια δεδομένα"},
            {"Υπολογισμός αθρησμάτων στοιχείων του πίνακα, εύρεση μεγίστου η ελαχίστου", "Ταξινόμηση και αναζήτηση  στοιχείων του πίνακα", "Συγχώνευση δύο πινάκων", "Ολα τα παραπάνω"},
            {"Σειριακή και παράλληλη αναζήτηση", "Λειτουργική και παράλληλη αναζήτηση", "Σειριακή και δυαδική αναζήτηση", "Δυαδική και δεκαδική αναζήτηση"},
            {"0", "1", "-", "Απροσδιόριστη τιμή"},
            {"Εκχωρεί την τιμή 9 στην τρίτη θέση του πίνακα", "Εκχωρεί την τιμή 9 στην δεύτερη θέση του πίνακα και στην συνέχεια την αυξάνει κατά 1", "Εκχωρεί την έκτη θέση του πίνακα στην τρίτη θέση του πίνακα", "Εκχωρεί την έκτη θέση του πίνακα στην τρίτη θέση του πίνακα και στην συνέχεια την αυξάνει κατά 1"},
            {"Καταχωρούντε τιμές σε έναν πίνακα 10 θέσεων", "Καταχωρούνται τιμέσς σε έναν πίνακα 11 θέσεων", "Το πρόγραμμα δεν εκτελείται καθώς καταχωρείται στοιχείο σε θέση του πίνακα που δεν υπάρχει", "Τίποτα από τα παραπάνω"},
            {"ΔΕΛΤΑ", "Τίποτα καθώς υπάρχει λάθος", "ΑΤΛΕΔ", "Δ"},
            {"-20<=Κ<=20 κ -20<=Λ<+20", "Κ>0 κ Λ>0", "-20<=Κ<=20 κ Λ=0", "Κ=0 κ -20<=Λ<20" },
            {"Αρχή, τύπος δεδομένων, τέλος", "Ονομα, μέγεθος, τύπος δεδομένων", "Γραμή, στήλη, βάθος", "Τύπος δεδομένων και τύπος μεταβλητών"},
            {"1, 9, 65", "2, 9, 65", "0, 65, 4", "2, 4, 65"}
    };


    public static int[] images = new int [] {
            R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.e39, R.drawable.e40,
            R.drawable.e41, R.drawable.e43, R.drawable.a, R.drawable.e46
    };

    private String mCorrectAnswers[] = {"Η απαίτηση μνήμης και ο περιορισμός δυνατοτήτων του προγράματος", "Ονομα, μέγεθος, τύπος δεδομένων", "Οταν θέλουμε να κρατήσουμε στην μνήμη κάποια δεδομένα", "Ολα τα παραπάνω", "Σειριακή και δυαδική αναζήτηση", "Απροσδιόριστη τιμή", "Εκχωρεί την τιμή 9 στην τρίτη θέση του πίνακα", "Το πρόγραμμα δεν εκτελείται καθώς καταχωρείται στοιχείο σε θέση του πίνακα που δεν υπάρχει", "ΑΤΛΕΔ", "-20<=Κ<=20 κ Λ=0","Ονομα, μέγεθος, τύπος δεδομένων", "2, 4, 65"};
    public int getLength(){
        return mQuestions.length;
    }


    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice1 = mChoices[a][0];
        return choice1;
    }

    public String getChoice2(int a) {
        String choice2 = mChoices[a][1];
        return choice2;
    }

    public String getChoice3(int a) {
        String choice3 = mChoices[a][2];
        return choice3;
    }

    public String getChoice4(int a) {
        String choice4 = mChoices[a][3];
        return choice4;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}



