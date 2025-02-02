package dao;

//import edu javacourse, studentorder, domain. Stre
import entity.student;
import java.sql.*;
import java.util.LinkedList; import java.util. List;
public class shange_student {


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
                st.setName_(rs.getString(5));
                st.setOtchestvo(rs.getString(6));
                 result.add(st);
            }
        //int i = rs.getInt("max")+1;
        }
        catch (Exception e){}
            return result;
    } // Вывод*/

    public ResultSet selctstudent(){
        try{
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT \"Siral_number\", \"Name\", registr_number, invent_number, \"Otdelenie\", data_input, \"Na_spisanie\", \"Act_spisanie\", \"Gurnal_TO\"\n" +
                    "\tFROM public.\"Aparat\";");
            return rs;
        }
        catch (Exception e){}
        return null;
    }

    public int createstudent(student student) {
        try {////блок кода, в котором может произойти исключение
            String sql = "INSERT INTO public.\"Aparat\"(\n" +
                    "\t\"Siral_number\", \"Name\", registr_number, invent_number, \"Otdelenie\", data_input, \"Na_spisanie\", \"Act_spisanie\", \"Gurnal_TO\")\n" +
                    "\tVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setString(1, student.getSiral_number());
            statement.setString(2, student.getName_());
            statement.setString(3, student.getRegistr_number());
            statement.setString(4, student.getInvent_number());
            statement.setString(5, student.getOtdelenie());
            statement.setDate(6, student.getData_input());
            statement.setBoolean(7,student.getNa_spisanie());
            statement.setString(8, student.getAct_spisanie());
            statement.setString(9, student.getGurnal_TO());
            int i = statement.executeUpdate();
            System.out.println("Добавлено строк " + i);
            return i;
        }
        catch (Exception e){}
        return 0;
    } // Добавление

    public int updateStudent(student student) {
        try {
            /*Connection con = getConnection();
        Statement stmt = con.createStatement();*/

            String sqlUpdate="UPDATE public.\"Aparat\"\n" +
                    "\tSET \"Siral_number\"=?, \"Name\"=?, registr_number=?, invent_number=?, \"Otdelenie\"=?, data_input=?, \"Na_spisanie\"=?, \"Act_spisanie\"=?, \"Gurnal_TO\"=?\n" +
                    "\tWHERE \"Siral_number\"=?;";
            PreparedStatement statement = getConnection().prepareStatement(sqlUpdate);
            statement.setString(1, student.getSiral_number());
            statement.setString(2, student.getName_());
            statement.setString(3, student.getRegistr_number());
            statement.setString(4, student.getInvent_number());
            statement.setString(5, student.getOtdelenie());
            statement.setDate(6, student.getData_input());
            statement.setBoolean(7,student.getNa_spisanie());
            statement.setString(8, student.getAct_spisanie());
            statement.setString(9, student.getGurnal_TO());
            statement.setString(10, student.getWhere());

            int i =  statement.executeUpdate();
            System.out.println("Обновлено строк " + i);

        } catch (Exception e){}
        return 0;
    }

        public int deletStudent(student student) {
            try
            {Connection con = getConnection();
                Statement stmt = con.createStatement();

                String sqlUpdate="DELETE FROM public.\"Aparat\"\n" +
                        "\tWHERE \"Siral_number\"=?;";
                PreparedStatement statement = getConnection().prepareStatement(sqlUpdate);
                statement.setString(1, student.getWhere());
                int i =  statement.executeUpdate();
                System.out.println("удолено строк строк " + i);

            } catch (Exception e){}
            return 0;
        }

}