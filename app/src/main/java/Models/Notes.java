package Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity (tableName = "notes")
public class Notes implements Serializable {

    @PrimaryKey (autoGenerate = true)
    int ID = 0;

    @ColumnInfo (name = "title")
    String title = "";

    @ColumnInfo (name = "notes")
    String notes = "";

    @ColumnInfo (name = "data")
    String data = "";

    @ColumnInfo (name = "pinned")
    boolean pinned = false;
}
