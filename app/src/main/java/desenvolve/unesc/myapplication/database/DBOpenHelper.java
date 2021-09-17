package desenvolve.unesc.myapplication.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import desenvolve.unesc.myapplication.database.model.FilmeModel;
import desenvolve.unesc.myapplication.database.model.UsuarioModel;

public class DBOpenHelper extends SQLiteOpenHelper {

    public static final String
    DATABASE_NOME = "bancoexemplo.db";

    public static final int
    DATABASE_VERSAO = 2;

    public DBOpenHelper(final Context contexto) {
        super(contexto, DATABASE_NOME, null, DATABASE_VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UsuarioModel.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion == 2) {
            db.execSQL(FilmeModel.CREATE_TABLE);
        }
        else {
            db.execSQL(UsuarioModel.CREATE_TABLE);
        }
    }
}
