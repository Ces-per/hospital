package dao;

//import edu javacourse, studentorder, domain. Stre
import entity.database;
import java.sql.*;

public class shange_Remont{


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

    public int createRemont(database database) {
        try {////блок кода, в котором может произойти исключение
            String sql = "INSERT INTO public.\"Otdelenie\"(\n" +
                    "\t\"Kod\", \"Name\")\n" +
                    "\tVALUES (?, ?);";
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setString(1, database.getKod_Otdelenie());
            statement.setString(2, database.getName_Otdelenie());

            int i = statement.executeUpdate();
            System.out.println("Добавлено строк " + i);
            return i;
        }
        catch (Exception e){}
        return 0;
    } // Добавление

    public int updateRemont(database database) {
        try {
            /*Connection con = getConnection();
        Statement stmt = con.createStatement();*/

            String sqlUpdate="UPDATE public.\"Otdelenie\"\n" +
                    "\tSET \"Kod\"=?, \"Name\"=?\n" +
                    "\tWHERE \"Kod\"=?;";
            PreparedStatement statement = getConnection().prepareStatement(sqlUpdate);
            statement.setString(1, database.getKod_Otdelenie());
            statement.setString(2, database.getName_Otdelenie());
            statement.setString(3,database.getWhere_Otdelenie());
            //statement.setInt();

            int i =  statement.executeUpdate();
            System.out.println("Обновлено строк " + i);

        } catch (Exception e){}
        return 0;
    }

    public int deletRemont(database database) {
        try
        {Connection con = getConnection();
            Statement stmt = con.createStatement();

            String sqlUpdate="DELETE FROM public.\"Otdelenie\"\n" +
                    "\tWHERE \"Kod\"=?;";
            PreparedStatement statement = getConnection().prepareStatement(sqlUpdate);
            statement.setString(1, database.getWhere_Otdelenie());
            int i =  statement.executeUpdate();
            System.out.println("удолено строк строк " + i);

        } catch (Exception e){}
        return 0;
    }

}