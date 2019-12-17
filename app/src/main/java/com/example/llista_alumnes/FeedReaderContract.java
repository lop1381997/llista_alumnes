package com.example.llista_alumnes;

import android.provider.BaseColumns;

public class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {

        public static final String TABLE_NAME = "alumne";
        //public static final String _ID = "id";
        public static final String COLUMN_NAME_TITLE = "nom";
        public static final String COLUMN_NAME_SUBTITLE = "cognoms";
    }

}




