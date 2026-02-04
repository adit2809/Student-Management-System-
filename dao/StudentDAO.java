package dao;

import db.DBConnection;
import java.sql.*;

public class StudentDAO {

    public void addStudent(String name, String email, String course) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO students(name, email, course) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, course);
            ps.executeUpdate();
            System.out.println("Student added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {
        try (Connection con = DBConnection.getConnection()) {
            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM students");

            System.out.println("\nID | Name | Email | Course");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("email") + " | " +
                                rs.getString("course")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String course) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "UPDATE students SET course=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, course);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Student updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
