package dao;

//import edu javacourse, studentorder, domain. Stre
import entity.database;
import java.sql.*;

public class shange_Zapchasti {


    private Connection getConnection() throws  SQLException{
        Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "1");
        return con;
    }

    /*public List<student> findStreets(String pattern) throws Exception {
        List<student> result = new LinkedList<>();
        try { Connection con = getConnection();

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT *\n" +
                "\tFROM public.\"ученики\";");
            while (rs.next()){
                student st = new student();
                st.setId(rs.getLong(1));
                st.setAge(rs.getLong(2));
                st.setKlass(rs.getLong(3));
                st.setFamiliya(rs.getString(4));
                st.setName_Aparat(rs.getString(5));
                st.setOtchestvo(rs.getString(6));
                 result.add(st);
            }
        //int i = rs.getInt("max")+1;
        }
        catch (Exception e){}
            return result;
    } // Вывод*/

    /*public ResultSet selctstudent(){
        try{
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, \"Kod\", \"Name\", characteristics, photo\n" +
                    "\tFROM public.\"Zapchasti\";");
            return rs;
        }
        catch (Exception e){}
        return null;
    }*/

    public int createZapchasti(database database) {
        try {////блок кода, в котором может произойти исключение
            String sql = "INSERT INTO public.\"Zapchasti\"(\n" +
                    "\t\"Kod\", \"Name\", characteristics, photo, id)\n" +
                    "\tVALUES (?, ?, ?, ?, ?);";
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setString(1, database.getKod_Zapchasti());
            statement.setString(2, database.getName_Zapchasti());
            statement.setString(3, database.getCharacteristics_Zapchasti());
            statement.setString(4, database.getPhoto_Zapchasti());
            statement.setString(5, database.getId_Zapchasti());
            /*statement.setDate(6, database.getData_input_Aparat());
            statement.setBoolean(7, database.getNa_spisanie_Aparat());
            statement.setString(8, database.getAct_spisanie_Aparat());
            statement.setString(9, database.getGurnal_TO_Aparat());*/
            int i = statement.executeUpdate();
            System.out.println("Добавлено строк " + i);
            return i;
        }
        catch (Exception e){}
        return 0;
    } // Добавление

    public int updateZapchasti(database database) {
        try {
            /*Connection con = getConnection();
        Statement stmt = con.createStatement();*/

            String sqlUpdate="UPDATE public.\"Zapchasti\"\n" +
                    "\tSET \"Kod\"=?, \"Name\"=?, characteristics=?, photo=?, id=?\n" +
                    "\tWHERE id=?;";
            PreparedStatement statement = getConnection().prepareStatement(sqlUpdate);
            statement.setString(1, database.getKod_Zapchasti());
            statement.setString(2, database.getName_Zapchasti());
            statement.setString(3, database.getCharacteristics_Zapchasti());
            statement.setString(4, database.getPhoto_Zapchasti());
            statement.setString(5, database.getId_Zapchasti());

            int i =  statement.executeUpdate();
            System.out.println("Обновлено строк " + i);

        } catch (Exception e){}
        return 0;
    }

    public int deletZapchasti(database database) {
        try
        {Connection con = getConnection();
            Statement stmt = con.createStatement();

            String sqlUpdate="DELETE FROM public.\"Zapchasti\"\n" +
                    "\tWHERE id=?;";
            PreparedStatement statement = getConnection().prepareStatement(sqlUpdate);
            statement.setString(1, database.getWhere_Zapchasti());
            int i =  statement.executeUpdate();
            System.out.println("удолено строк строк " + i);

        } catch (Exception e){}
        return 0;
    }

}