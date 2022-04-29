package Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import Models.Notes;

@Dao
public interface MainDAO {
    @Insert
    void insert(Notes notes);

    @Query("SELECT * FROM notes ORDER BY ID DESC /* сортировка по убывани, ASC - по возрастанию*/")
    List<Notes> getAll();

    @Query("UPDATE notes SET title = :title, notes = :notes WHERE ID = :id")
    void update(int id, String title, String notes);

    @Delete
    void delete (Notes notes);
}
