package com.example.ben.application;

public class QuestionBook4 {

    public static String[] questions = new String [] {
            "Οι τύποι δεδομένων στον προγραμματισμό διακρίνονται σε ακέραιους, πραγματικούς, λογικούς και χαρακτήρες. ",
            "Οι τύποι των μεταβλητών στον προγραμματισμό είναι πραγματικές και ακέραιες",
            "Οι αριθμητικοί τύποι δεδομένων περιλαμβάνουν τους ακαίρεους, δεκαδικούς και λογικούς. ",
            "Οι σταθερές είναι προκαθαρισμένες τιμές που δεν μεταβάλονται κατά την διάρκεια εκτέλεσης ενός προγράμματος.",
            "Μια μεταβλητή παριστάνει μια ποσότητα που η τιμή της δεν μπορεί να μεταβληθεί. ",
            "Δεν είναι απαραίτητη η δήλωση όλων των μεταβλητών που χρησιμοποιούμε στο πρόγραμμα",
            "Οι μεταβλητές που χρησιμοποιούνται σε ένα πρόγραμμα αντιστοιχούνται από τον μεταγλωττιστή σε συγκεκριμένες θέσεις μνήμης του υπολογιστή. ",
            "Ο τελεστής div χρησιμοποιείται για τον υπολογισμό υπολίπου ένώ ο mod για τον υπολογισμό του πηλίκου. ",
            "Η τιμή τις έκφρασης υπολογίζεται στην αριστερή πλευρά και καταχωρήτε στη μεταβλητή που βρίσκεται στην δεξιά πλευρά.",
            "Σε μια εντολή εκχώρησης η μεταβλητή και η έκφραση μπορουν  να είναι διαφορετικού τύπου.",
            "Κατά την εκτέλεση ενός προγράμματος η εντολή ‘ΔΙΑΒΑΣΕ’ διακόπτει την εκτέλεσή του και το πρόγραμμα περιμένει την εισαγωγή τιμών από το πληκτρολόγιο, που θα εκχωρηθούν στις μεταβλητές. ",
            "Η  εντολή γράψε χρησιμοποιειται για την εμφάνιση μηνυμάτων από τον υπολογιστή.",
            "H ροή του προγράμματος είναι σωστή.",
            "Σχόλια μπορούν να τοποθετηθούν σε οποιοδίποτε σημείο ενός προγράμματος",
            "Κάθε πρόγραμα αρχίζει με την λέξη:ΠΡΟΓΡΑΜΜΑ ΟΝΟΝΟΜΑ_ΠΡΟΓΡΑΜΜΑΤΟΣ και τελειώνει με την λέξη:ΤΕΛΟΣ ΟΝΟΜΑ_ΠΡΟΓΡΑΜΜΑΤΟΣ",
            "Tο παραπάνω πρόγραμμα έχει συντακτικό λάθος",
            "Η εντολή εκχώρησης '<-' μπορεί να αντικατασταθεί από το '='",
            "Η εντολή 'ΓΡΑΨΕ' μπορεί να χρησιμοποιηθεί αντί της εντολής 'ΕΜΦΑΝΙΣΕ' ",
            "Η εντολή 'ΔΩΣΕ' μπορεί να χρησιμοποιηθεί αντί της εντολής 'ΔΙΑΒΑΣΕ'",
            "Το DIV χρησιμοποιείται για τον υπολογισμό του πηλίκου μιας διαίρεσης ",
            "Οι 'ΛΟΓΙΚΕΣ' εντάσονται στον τύπο των 'ΜΕΤΑΒΛΗΤΩΝ'",
            "Αν υπάρχει συντακτικό λάθος το πρόγραμμα εκτελείται κανονικά αλλά βζάζει λάθος αποτέλεσμα"


    };

    public static int[] images = new int [] {
            R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.e11,
            R.drawable.a, R.drawable.a, R.drawable.e30, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a
    };

    public static boolean[] answers = new boolean[]{
            true, false, false, true, false, false, true, false, false, false, true, true, false, true, false, true,
            false, true, false, true, true, false
    };


    public int getLength() {
        return questions.length;
    }

}




